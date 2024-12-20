package day20

import utils.*
import kotlin.math.abs

fun day20Part2Core(
    input: String = Day20Input.prodInput,
): Map<Int, Int> {
    val map: List2D<Char> = input.lines().map { line -> line.map { it } }
    val start = map.findIndex { it == 'S' }
    val end = map.findIndex { it == 'E' }
    val (sizeX, sizeY) = map.first().size to map.size

    fun getInRange(from: Position, distance: Int): Set<Position> = buildSet {
        (-distance..distance).forEach { y ->
            val size = (distance - abs(y)) * 2 + 1
            addAll(List(size) {
                Position(from.x + it - size / 2, from.y + y)
            }.filter { it.x in 0..<sizeX && it.y in 0..<sizeY })
        }
    }

    fun goThrough(): List<Position> {
        val route = mutableListOf<Position>(start)
        while (route.last() != end) {
            val prev = route.takeLast(2).first()
            val current = route.last()

            val new = Dir.entries
                .map { dir -> current.moved(dir) }
                .first { it != prev && map.getAt(it) != '#' }
            route.add(new)
        }
        return route
    }

    val steps = goThrough()

    return buildMap<Int, Int> {
        steps.forEachIndexed { index, position ->
            getInRange(position, 20)
                .filter { it in steps }
                .map {
                    val farthestIndex = steps.indexOf(it)
                    val distance = abs(position.x - it.x) + abs(position.y - it.y)
                    farthestIndex - index - distance
                }
                .filter { it >= 50 }
                .forEach { diff ->
                    this[diff] = this.getOrPut(diff) { 0 } + 1
                }
        }
    }.toSortedMap()
}

fun day20Part2(input: String = Day20Input.prodInput): Int {
    return day20Part2Core(input).filter { it.key >= 100 }.values.sum()
}