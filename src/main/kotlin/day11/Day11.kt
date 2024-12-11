package day11

val testInput = "125 17"
val day11Input = "112 1110 163902 0 7656027 83039 9 74"

fun day11Part1(input: String = day11Input): Long = day11(input, 25)
fun day11Part2(input: String = day11Input): Long = day11(input, 75)

private fun day11(input: String, times: Int): Long = input.splitToSequence(" ").sumOf { blink(it, times) }

// value to blink times -> count
val cache = mutableMapOf<Pair<String, Int>, Long>()

fun blink(value: String, times: Int): Long {
    cache[value to times]?.let { return it }

    val result = when {
        times == 0 -> 1
        value == "0" -> blink("1", times - 1)
        value.length % 2 == 0 -> {
            val first = value.take(value.length / 2)
            val second = value.takeLast(value.length / 2).toLong().toString()
            blink(first, times - 1) + blink(second, times - 1)
        }
        else -> blink((value.toLong() * 2024).toString(), times - 1)
    }
    cache[value to times] = result
    return result
}