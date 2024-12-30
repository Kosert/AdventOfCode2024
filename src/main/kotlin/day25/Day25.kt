package day25

import utils.*

fun day25Part1(input: String = Day25Input.prodInput): Int {
    val (locks, keys) = input.lineSequence()
        .filter { it.isNotEmpty() }
        .chunked(7)
        .map { it.toList2D() }
        .partition { it.getAt(0, 0) == '#' }

    fun List2D<Char>.countPinHeights() = (0..lastXIndex).map { index -> getColumn(index).count { it == '#' } - 1 }

    val lockPins = locks.map { lock -> lock.countPinHeights() }
    val keyPins = keys.map { key -> key.countPinHeights() }

    return lockPins.sumOf { lock ->
        keyPins.count { key ->
            lock.zip(key).none { it.first + it.second > 5}
        }
    }
}