package day12

import utils.*
import kotlin.math.abs


data class Region(val positions: MutableSet<Position>, val letter: Char) {

    fun area() = positions.size

    fun perimeter() = positions.sumOf { pos ->
        4 - Dir.entries
            .map { Position(pos.x + it.x, pos.y + it.y) }
            .count { positions.contains(it) }
    }

    fun sides(): Int {
        val fencePoints = positions.map { pos ->
            pos to Dir.entries.filter { Position(pos.x + it.x, pos.y + it.y) !in positions }
        }.flatMap { (pos, dirs) ->
            dirs.map { pos.x + (it.x * 0.25) to pos.y + (it.y * 0.25) }
        }

        val (minX, maxX) = fencePoints.minOf { it.x } to fencePoints.maxOf { it.x }
        val verticals = ((minX..maxX) step 0.5).sumOf { x ->
            fencePoints
                .filter { it.x == x }
                .map { it.y }
                .sorted()
                .let { if (it.size < 2) return@sumOf it.size else it }
                .zipWithNext()
                .count { (y1, y2) -> abs(y1 - y2) > 1.0 }
                .plus(1)
        }

        val (minY, maxY) = fencePoints.minOf { it.y } to fencePoints.maxOf { it.y }
        val horizontals = ((minY..maxY) step 0.5).sumOf { y ->
            (fencePoints
                .filter { it.y == y }
                .map { it.x }
                .sorted()
                .let { if (it.size < 2) return@sumOf it.size else it }
                .zipWithNext()
                .count { (x1, x2) -> abs(x1 - x2) > 1.0 }
                .plus(1))
        }

        return verticals + horizontals
    }
}

private fun generateRegions(input: String): List<Region> {
    val map: List2D<Char> = input.split("\n").map { it.toList() }

    fun generateRegion(pos: Position, letter: Char, positions: MutableSet<Position>) {
        positions.add(pos)

        Dir.entries
            .map { Position(pos.x + it.x, pos.y + it.y) }
            .filter { map.getAt(it) == letter && it !in positions }
            .forEach { generateRegion(it, letter, positions) }
    }

    return buildList<Region> {
        map.map2DIndexed { pos, letter ->
            if (this.any { pos in it.positions }) {
                return@map2DIndexed null
            }

            val positions = mutableSetOf<Position>()
            generateRegion(pos, letter, positions)
            add(Region(positions, letter))
        }
    }
}

fun day12Part1(input: String = Day12Input.prodInput): Int {
    return generateRegions(input).sumOf { it.area() * it.perimeter() }
}

fun day12Part2(input: String = Day12Input.prodInput): Int {
    return generateRegions(input).sumOf { it.area() * it.sides() }
}