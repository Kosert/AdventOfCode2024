package day20

import utils.*

fun day20Part1Core(input: String = Day20Input.prodInput): Map<Int, Int> {
    val map: List2D<Char> = input.lines().map { line -> line.map { it } }
    val start = map.findIndex { it == 'S' }
    val end = map.findIndex { it == 'E' }
    val (obstacles, path) = map.withPositions()
        .flatten()
        .partition { (_, value) -> value == '#' }
        .toList().map { it.map { it.first } }

    val potentialShortcuts = obstacles.filter { obstacle ->
        Dir.entries.map { obstacle.moved(it) }.count { it in path } >= 2
    }

    fun goThrough(
        removedObstacle: Position? = null,
        normalRoute: List<Position> = listOf()
    ): List<Position> {
        val route = mutableListOf<Position>(start)
        var cheatUsed = false
        while (route.last() != end) {
            val prev = route.takeLast(2).first()
            val current = route.last()

            val options = Dir.entries
                .map { dir -> current.moved(dir) }
                .filter { it != prev && (it == removedObstacle || map.getAt(it) != '#') }

            val new = when {
                options.size == 1 -> options.first()
                !cheatUsed && removedObstacle in options -> {
                    cheatUsed = true
                    removedObstacle!!
                }
                else -> options.map { it to normalRoute.indexOf(it) }
                    .maxBy { it.second }
                    .first
            }
            route.add(new)
        }
        return route
    }

    val normalRoute = goThrough()

    val results = mutableMapOf<Int, Int>()
    potentialShortcuts.forEach {
        val diff = normalRoute.size - goThrough(it, normalRoute).size
        if (diff <= 0)
            return@forEach
        results[diff] = results.getOrPut(diff) { 0 } + 1
    }

    return results
}

fun day20Part1(input: String = Day20Input.prodInput): Int {
    return day20Part1Core(input).filter { it.key >= 100 }.values.sum()
}