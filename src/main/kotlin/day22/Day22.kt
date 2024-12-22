package day22

fun day22Part1(input: String = Day22Input.prodInput): Long {
    return input.lineSequence().sumOf {
        var number = it.toLong()
        repeat(2000) {
            number = calculateSecret(number)
        }
        number
    }
}

private fun calculateSecret(number: Long): Long {
    val step1 = ((number * 64) xor number) % 16777216
    val step2 = ((step1 / 32) xor step1) % 16777216
    val step3 = ((step2 * 2048) xor step2) % 16777216
    return step3
}

class Price(val value: Int, val history: List<Int>)

fun day22Part2(input: String = Day22Input.prodInput): Int {
    val buyers = input.lines().map { line ->
        buildList<Price> {
            var number = line.toLong()
            repeat(2000) {
                number = calculateSecret(number)

                val price = number.toString().last().digitToInt()
                val history = if (it < 4) emptyList() else listOf(
                    this[it - 3].value - this[it - 4].value,
                    this[it - 2].value - this[it - 3].value,
                    this[it - 1].value - this[it - 2].value,
                    price - this[it - 1].value,
                )
                add(Price(price, history))
            }
        }.drop(4)
    }

    val allCandidates = buyers.flatMap { price -> price.map { it.history } }

    val mapCount = allCandidates.groupingBy { it }.eachCount()
    val candidates = mapCount.entries.sortedByDescending { it.value }.take(100).map { it.key }

    return candidates.maxOf { sequence ->
        buyers.sumOf {
            it.firstOrNull { it.history == sequence }?.value ?: 0
        }
    }
}