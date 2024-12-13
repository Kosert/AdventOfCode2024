package day05

fun day5Part1(): Int {
    val rules = day5RulesInput.lineSequence()
        .map { line -> line.split("|").let { it[0].toInt() to it[1].toInt() } }
        .toList()

    fun List<Int>.isValid(): Boolean = mapIndexed { index, current ->
        val shouldBeBefore = rules.filter { it.second == current }.map { it.first }
        val shouldBeAfter = rules.filter { it.first == current}.map { it.second }
        val prev = this.take(index)
        val next = this.drop(index + 1)

        prev.all { it !in shouldBeAfter } && next.all { it !in shouldBeBefore }
    }.all { it }

    return day5NumbersInput.lineSequence()
        .map { line -> line.split(",").map { it.toInt() } }
        .filter { it.isValid() }
        .onEach { if (it.size % 2 == 0) error("Even: $it") }
        .map { it[it.lastIndex / 2] }
        .sum()
}

fun day5Part2(): Int {
    val rules = day5RulesInput.lineSequence()
        .map { line -> line.split("|").let { it[0].toInt() to it[1].toInt() } }
        .toList()

    fun List<Int>.isValid(): Boolean = mapIndexed { index, current ->
        val shouldBeBefore = rules.filter { it.second == current }.map { it.first }
        val shouldBeAfter = rules.filter { it.first == current}.map { it.second }
        val prev = this.take(index)
        val next = this.drop(index + 1)

        prev.all { it !in shouldBeAfter } && next.all { it !in shouldBeBefore }
    }.all { it }

    // negative number if the first argument is less than the second
    val comp = Comparator<Int> { a, b ->
        return@Comparator when {
            rules.any { it.first == a && it.second == b } -> -1
            rules.any { it.first == b && it.second == a } -> 1
            else -> 0
        }
    }

    return day5NumbersInput.lineSequence()
        .map { line -> line.split(",").map { it.toInt() } }
        .filterNot { it.isValid() }
        .map { it.sortedWith(comp) }
        .onEach { if (it.size % 2 == 0) error("Even: $it") }
        .map { it[it.lastIndex / 2] }
        .sum()
}