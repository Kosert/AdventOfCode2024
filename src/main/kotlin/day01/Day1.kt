package day01

import kotlin.math.abs

fun day1Part1(): Int {
    val (list1, list2) = day1Input.lineSequence()
        .map { lines -> lines.split(Regex("\\s+")).map { it.toInt() } }
        .map { it[0] to it[1] }
        .unzip()

    return list1.sorted().zip(list2.sorted()).sumOf { abs(it.first - it.second) }
}

fun day1Part2(): Int {
    val (list1, list2) = day1Input.lineSequence()
        .map { lines -> lines.split(Regex("\\s+")).map { it.toInt() } }
        .map { it[0] to it[1] }
        .unzip()

    val countMap = list2.groupingBy { it }.eachCount()

    return list1.sumOf {
        val count = countMap.getOrDefault(it, 0)
        it * count
    }
}