package day14

import utils.Position
import utils.x
import utils.y

val testSize = 11 to 7
val prodSize = 101 to 103

data class Robot(
    var position: Position,
    val velocity: Position,
    val mapSize: Pair<Int, Int>,
) {
    fun move() {
        val (sizeX, sizeY) = mapSize
        val newX = position.x + velocity.x
        val newY = position.y + velocity.y
        val x = if (newX < 0) {
            sizeX + newX
        } else if (newX >= sizeX) {
            newX - sizeX
        } else newX

        val y = if (newY < 0) {
            sizeY + newY
        } else if (newY >= sizeY) {
            newY - sizeY
        } else newY

        position = x to y
    }
}

private fun generateRobots(input: String, mapSize: Pair<Int, Int>): List<Robot> = input.lineSequence()
    .map {
        val (pPart, vPart) = it.split(" ")
        val pos = pPart.drop(2).split(",").map { it.toInt() }.let { it[0] to it[1] }
        val velocity = vPart.drop(2).split(",").map { it.toInt() }.let { it[0] to it[1] }
        Robot(pos, velocity, mapSize)
    }.toList()

fun day14Part1(input: String = Day14Input.prodInput, mapSize: Pair<Int, Int> = prodSize): Long {
    val robots = generateRobots(input, mapSize)

    repeat(100) {
        robots.forEach {
            it.move()
        }
    }

    val (sizeX, sizeY) = mapSize
    return listOf(
        0..<sizeX / 2 to 0..<sizeY / 2,
        0..<sizeX / 2 to sizeY / 2 + 1..<sizeY,
        sizeX / 2 + 1..<sizeX to 0..<sizeY / 2,
        sizeX / 2 + 1..<sizeX to sizeY / 2 + 1..<sizeY
    ).map { (rangeX, rangeY) ->
        robots.count { it.position.x in rangeX && it.position.y in rangeY }.toLong()
    }.reduce { acc, it -> acc * it }
}

fun day14Part2(input: String = Day14Input.prodInput, mapSize: Pair<Int, Int> = prodSize): Int {
    val robots = generateRobots(input, mapSize)

    var elapsed = 0
    while (true) {
        robots.forEach { it.move() }
        elapsed++

        val testSet = robots.map { it.position }.toSet()
        if (testSet.size == robots.size) {
            break
        }
    }
    return elapsed
}