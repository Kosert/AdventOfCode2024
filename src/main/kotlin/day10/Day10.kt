package day10

import utils.Dir
import utils.List2D
import utils.getAt
import utils.withPositions

private val testInput = """
    89010123
    78121874
    87430965
    96549874
    45678903
    32019012
    01329801
    10456732
""".trimIndent()

private val testInput2 = """
..90..9
...1.98
...2..7
6543456
765.987
876....
987....
""".trimIndent()

private fun prepareMap(input: String): List2D<Int> = input.split("\n")
    .map { row -> row.map { if (it.isDigit()) it.digitToInt() else 10 } }

private fun List2D<Int>.getTrailheads() = this.withPositions()
    .flatten()
    .filter { (_, it) -> it == 0 }
    .map { (position, _) -> position }

fun day10Part1(input: String = day10Input): Int {
    val map = prepareMap(input)
    val trailheads = map.getTrailheads()

    return trailheads.sumOf { (x, y) ->
        map.calculateBranchUnique(x, y)
    }
}

fun day10Part2(input: String = day10Input): Int {
    val map = prepareMap(input)
    val trailheads = map.getTrailheads()

    return trailheads.sumOf { (x, y) ->
        map.calculateBranch(x, y)
    }
}

private fun List2D<Int>.calculateBranchUnique(x: Int, y: Int, alreadyReached: MutableSet<Pair<Int, Int>> = mutableSetOf()): Int {
    val currentValue = this[y][x]

    if (currentValue == 9) {
        if (alreadyReached.contains(x to y))
            return  0
        else {
            alreadyReached.add(x to y)
            return 1
        }
    }

    return Dir.entries
        .map { Pair(x + it.x, y + it.y) }
        .filter { this.getAt(it) == currentValue + 1 }
        .sumOf { (x, y) -> calculateBranchUnique(x, y, alreadyReached) }
}

private fun List2D<Int>.calculateBranch(x: Int, y: Int): Int {
    val currentValue = this[y][x]

    if (currentValue == 9) {
        return 1
    }

    return Dir.entries
        .map { Pair(x + it.x, y + it.y) }
        .filter { this.getAt(it) == currentValue + 1 }
        .sumOf { (x, y) -> calculateBranch(x, y) }
}