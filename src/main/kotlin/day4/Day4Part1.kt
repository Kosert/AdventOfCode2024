package day4


val testInput = """
    MMMSXXMASM
    MSAMXMSMSA
    AMXSXMAAMM
    MSAMASMSMX
    XMASAMXAMM
    XXAMMXXAMA
    SMSMSASXSS
    SAXAMASAAA
    MAMMMXMMMM
    MXMXAXMASX
""".trimIndent()

val words = listOf("XMAS", "SAMX")

fun day4Part1(): Int {
    val array = day4Input.split("\n")

    val columnStrings: List<String> = buildList {
        repeat(array.first().length) { columnIndex ->
            add(buildString {
                repeat(array.size) {
                    append(array[it][columnIndex])
                }
            })
        }
    }

    val diagonalStrings = List(array.size) { array.diagonalToString(it to 0) }.drop(1) +
            List(array.first().length) { array.diagonalToString(0 to it) } +
            List(array.size) { array.reverseDiagonalToString(it to array.first().lastIndex) }.drop(1) +
            List(array.first().length) { array.reverseDiagonalToString(0 to it) }

    return listOf(array.sumOf { it.countOccurrences(words) },
        columnStrings.sumOf { it.countOccurrences(words) },
        diagonalStrings.sumOf { it.countOccurrences(words) }
    ).sum()
}

private fun List<String>.diagonalToString(indices: Pair<Int, Int>): String = buildString {
    var (i, j) = indices
    do {
        val current = this@diagonalToString.getOrNull(i)?.getOrNull(j)?.also { append(it) }
        i++
        j++
    } while (current != null)
}

private fun List<String>.reverseDiagonalToString(indices: Pair<Int, Int>): String = buildString {
    println(indices)
    var (i, j) = indices
    do {
        val current = this@reverseDiagonalToString.getOrNull(i)?.getOrNull(j)?.also { append(it) }
        i++
        j--
    } while (current != null)
}

private fun String.countOccurrences(words: List<String>): Int = words.sumOf { countOccurrences(it) }

private fun String.countOccurrences(word: String): Int {
    var counter = 0
    var index = 0
    while (true) {
        index = this.indexOf(word, index).takeUnless { it == -1 }?.plus(word.length) ?: -1
        if (index != -1)
            counter++
        else
            return counter
    }
}