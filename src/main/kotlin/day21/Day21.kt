package day21

import utils.*
import kotlin.math.abs

val keypad1 = """
    789
    456
    123
    X0A
""".trimIndent().lines().toList2D()

val keypad2 = """
    X^A
    <v>
""".trimIndent().lines().toList2D()

fun day21Part1(input: String = Day21Input.prodInput): Long {
    return day21(input, depth = 2)
}

fun day21Part2(input: String = Day21Input.prodInput): Long {
    return day21(input, depth = 25)
}

private fun day21(input: String, depth: Int): Long {
    val codes = input.lines()

    return codes.sumOf { code ->
        var current = keypad1.findIndex { it == 'A' }
        val length = code.sumOf { targetChar ->
            val target = keypad1.findIndex { it == targetChar }
            val validPaths = validPaths(keypad1, current, target)
            current = target
            shortest(validPaths, depth)
        }
        length * code.dropLast(1).toLong()
    }
}

fun validPaths(keypad: List2D<Char>, from: Position, target: Position): List<String> {
    val horizontalDistance = abs(from.x - target.x)
    val verticalDistance = abs(from.y - target.y)

    return generateAllVariations(verticalDistance, horizontalDistance)
        .map { variation ->
            variation.map {
                when (it) {
                    '0' -> if (target.y < from.y) Dir.UP else Dir.DOWN
                    '1' -> if (target.x < from.x) Dir.LEFT else Dir.RIGHT
                    else -> error("Invalid variation: $variation")
                }
            }
        }
        .filterNot { goesThroughX(keypad, from, it) }
        .map { dirs -> dirs.joinToString("") { it.symbol.toString() } + "A" }
}

fun goesThroughX(keypad: List2D<Char>, from: Position, sequence: List<Dir>): Boolean {
    var position = from
    sequence.forEach { dir ->
        position = position.moved(dir)
        if (keypad.getAt(position) == 'X') {
            return true
        }
    }
    return false
}

fun shortest(paths: List<String>, depth: Int): Long {
    return if (depth == 0)
        paths.minOf { it.length }.toLong()
    else
        paths.minOf { sumPath(it, depth - 1) }
}

val sumPath = cachedFun { path: String, depth: Int ->
    var current = keypad2.findIndex { it == 'A' }
    return@cachedFun path.sumOf { symbol ->
        val target = keypad2.findIndex { it == symbol }
        val paths = validPaths(keypad2, current, target)
        current = target
        shortest(paths, depth)
    }
}
