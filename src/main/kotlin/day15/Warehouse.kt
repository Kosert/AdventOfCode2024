package day15

import utils.*

interface Item
data class Wall(val position: Position) : Item

data class Robot(var position: Position) : Item {
    fun move(dir: Dir) {
        position = position.moved(dir)
    }
}

data class Box(var positions: List<Position>) : Item {
    constructor(position: Position) : this(listOf(position))

    fun move(dir: Dir) {
        positions = positions.map { it.moved(dir) }
    }

    fun gpsValue() = positions.first().let { it.y * 100 + it.x }
}

class Warehouse(
    val mapSize: Pair<Int, Int>,
    val robot: Robot,
    val boxes: List<Box>,
    val walls: List<Wall>,
) : Item {

    fun getAt(
        position: Position
    ): Item? = robot.takeIf { it.position == position }
        ?: boxes.find { it.positions.contains(position) }
        ?: walls.find { it.position == position }

    fun canMove(box: Box, dir: Dir, boxesToMove: MutableSet<Box>): Boolean {
        boxesToMove.add(box)
        val result = box.positions.all {
            val item = getAt(it.moved(dir))
            when (item) {
                box -> true
                is Wall -> false
                is Box -> canMove(item, dir, boxesToMove)
                else -> true
            }
        }
        return result
    }

    fun executeMoves(moves: List<Dir>) {
        moves.forEach { dir ->
            val current = robot.position.moved(dir)
            when (val target = getAt(current)) {
                is Wall -> Unit
                is Box -> {
                    val boxesToMove = mutableSetOf<Box>()
                    if (canMove(target, dir, boxesToMove)) {
                        robot.move(dir)
                        boxesToMove.forEach { it.move(dir) }
                    }
                    boxesToMove.clear()
                }
                else -> robot.move(dir)
            }
        }
    }

    override fun toString(): String = buildString {
        repeat (mapSize.y) { y->
            repeat(mapSize.x) { x->
                when (getAt(x to y)) {
                    is Box -> append("O")
                    is Wall -> append("#")
                    is Robot -> append("@")
                    else -> append(".")
                }
            }
            appendLine()
        }
    }

    companion object {
        fun parse(input: Iterable<String>): Warehouse {
            var xSize = 0
            var yCounter = 0
            val robot = Robot(0 to 0)
            val boxes = mutableListOf<Box>()
            val walls = mutableListOf<Wall>()

            input.forEach { row ->
                row.forEachIndexed { index, char ->
                    val pos = index to yCounter
                    when (char) {
                        '[' -> boxes.add(Box(listOf(pos, pos.moved(Dir.RIGHT))))
                        'O' -> boxes.add(Box(pos))
                        '#' -> walls.add(Wall(pos))
                        '@' -> robot.position = pos
                        else -> {}
                    }
                }
                xSize = row.length
                yCounter++
            }

            return Warehouse(
                mapSize = xSize to yCounter,
                robot = robot,
                boxes = boxes,
                walls = walls
            )
        }
    }
}