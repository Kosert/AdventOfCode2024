package day18

import utils.*

data class RamNode(val position: Position) : Node

private fun generateEdges(size: Int, obstacles: List<Position>): List<Edge> = buildList {
    repeat(size) { y ->
        repeat(size) repeatX@{ x ->
            val position = Position(x, y)
            if (obstacles.contains(position))
                return@repeatX

            addAll(Dir.entries.mapNotNull { dir ->
                Edge(RamNode(position), RamNode(position.moved(dir)), 1)
                    .takeUnless { obstacles.contains(position) }
            })
        }
    }
}

fun day18Part1(
    input: String = Day18Input.prodInput,
    size: Int = Day18Input.prodSize,
    blocks: Int = Day18Input.prodBlocks,
): Int {
    val positions: List<Position> = input.lineSequence()
        .map { line -> line.split(",").map { it.toInt() }.let { it[0] to it[1] } }
        .toList()

    val blocked = positions.take(blocks)
    val edges = mutableListOf<Edge>()

    repeat(size) { y ->
        repeat(size) repeatX@{ x ->
            val position = Position(x, y)
            if (blocked.contains(position))
                return@repeatX

            edges.addAll(Dir.entries.mapNotNull { dir ->
                Edge(RamNode(position), RamNode(position.moved(dir)), 1)
                    .takeUnless { blocked.contains(position) }
            })
        }
    }

    return findShortestPath(edges, RamNode(0 to 0), RamNode(size - 1 to size - 1)).distance()
}

fun day18Part2(
    input: String = Day18Input.prodInput,
    size: Int = Day18Input.prodSize,
    startingObstacles: Int = Day18Input.prodBlocks,
): String {
    val positions: List<Position> = input.lineSequence()
        .map { line -> line.split(",").map { it.toInt() }.let { it[0] to it[1] } }
        .toList()

    var currentShortest: ShortestPathResult? = null
    (startingObstacles..positions.size).forEach { count ->
        val obstacles = positions.take(count)
        val newObstacle = obstacles.last()

        val shortest = currentShortest?.takeUnless {
            it.shortestPath().contains(RamNode(newObstacle))
        } ?: run {
            val edges = generateEdges(size, obstacles)
            findShortestPath(edges, RamNode(0 to 0), RamNode(size - 1 to size - 1))
        }

        if (shortest.distance() < 0) {
            return "${newObstacle.x},${newObstacle.y}"
        }
        currentShortest = shortest
    }

    error("Not found")
}