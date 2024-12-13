package day08

private val testInput = """
............
........0...
.....0......
.......0....
....0.......
......A.....
............
............
........A...
.........A..
............
............""".trimIndent()

fun day8Part1(): Int {
    val antennas = buildMap<Char, List<Pair<Int, Int>>> {
        day8Input.lineSequence().forEachIndexed { yIndex, line ->
            line.forEachIndexed { xIndex, it ->
                if (it != '.') {
                    val points = getOrPut(it) { listOf() }
                    set(it, points + Pair(xIndex, yIndex))
                }
            }
        }
    }

    val (maxX, maxY) = day8Input.lines().let { it.lastIndex to it.first().lastIndex }

    val resultSet = mutableSetOf<Pair<Int, Int>>()
    antennas.entries
        .filter { it.value.size > 1 }
        .forEach { entry ->
            entry.value
                .flatMap { current -> entry.value.filter { current != it }.map { current to it } }
                .forEach { (p1, p2) ->
                    val (x1, y1) = p1
                    val (x2, y2) = p2
                    val xDiff = x1 - x2
                    val yDiff = y1 - y2

                    val result = x1 + xDiff to y1 + yDiff
                    if (result.first in 0..maxX && result.second in 0..maxY) {
                        resultSet.add(result)
                    }
                }
        }

    return resultSet.count()
}

fun day8Part2(): Int {
    val antennas = buildMap<Char, List<Pair<Int, Int>>> {
        day8Input.lineSequence().forEachIndexed { yIndex, line ->
            line.forEachIndexed { xIndex, it ->
                if (it != '.') {
                    val points = getOrPut(it) { listOf() }
                    set(it, points + Pair(xIndex, yIndex))
                }
            }
        }
    }

    val (maxX, maxY) = day8Input.lines().let { it.lastIndex to it.first().lastIndex }

    val resultSet = mutableSetOf<Pair<Int, Int>>()
    antennas.entries
        .filter { it.value.size > 1 }
        .forEach { entry ->
            entry.value
                .flatMap { current -> entry.value.filter { current != it }.map { current to it } }
                .forEach { (p1, p2) ->
                    val (x1, y1) = p1
                    val (x2, y2) = p2
                    val xDiff = x1 - x2
                    val yDiff = y1 - y2

                    var result = x1 to y1
                    while (result.first in 0..maxX && result.second in 0..maxY) {
                        resultSet.add(result)
                        result = result.first + xDiff to result.second + yDiff
                    }
                }
        }

    return resultSet.count()
}



