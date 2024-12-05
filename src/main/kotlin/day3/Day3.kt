package day3

fun day3Part1(): Int = day3Input.split("mul(")
    .drop(1)
    .mapNotNull { it.scanDigits() }
    .sumOf { it.first * it.second }

fun day3Part2(): Int {
    var acc = 0
    var isEnabled = true
    repeat(day3Input.length) { index ->
        val input = day3Input.drop(index)
        fun getString(string: String): Boolean {
            return input.startsWith(string)
        }

        when {
            getString("do()") -> isEnabled = true
            getString("don't()") -> isEnabled = false
            getString("mul(") -> {
                if (isEnabled) {
                    input.drop(4)
                        .scanDigits()
                        ?.let { it.first * it.second }
                        ?.let { acc += it }
                }
            }
            else -> {}
        }
    }
    return acc
}

fun String.scanDigits(): Pair<Int, Int>? = runCatching {
    var number1 = ""
    var number2 = ""
    var isAfterComma = false

    repeat(length) { index ->
        val char = this.getOrNull(index)
        when {
            char?.isDigit() == true -> if (isAfterComma) number2 += char else number1 += char
            char == ',' -> isAfterComma = true
            char == ')' -> return number1.toInt() to number2.toInt()
            else -> return null
        }
    }
    return null
}.getOrNull()