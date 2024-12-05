package day2

import dropIndex

fun day2Part1(): Int {
    val lists = day2input.lineSequence()
        .map { lines -> lines.split(Regex("\\s+")).map { it.toInt() } }
        .toList()

    return lists.count { list -> list.isSafe() }
}

fun day2Part2(): Int {
    val lists = day2input.lineSequence()
        .map { lines -> lines.split(Regex("\\s+")).map { it.toInt() } }
        .toList()

    return lists.count { list ->
        list.isSafe() || List(list.size) { index -> list.dropIndex(index) }.any { it.isSafe() }
    }
}

private fun List<Int>.isSafe() = this.zipWithNext().let {
    it.all { (a, b) -> a - b in 1..3 } || it.all { (a, b) -> a - b in -3..-1 }
}