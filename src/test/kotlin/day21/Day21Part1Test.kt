package day21

import MultipleCasesTest
import kotlin.test.Test

class Day21Part1Test : MultipleCasesTest<String, Long>() {

    override val testData: List<Pair<String, Long>> = listOf(
        Day21Input.testInput to 126384,
        Day21Input.prodInput to 134120,
    )

    override fun execute(input: String) = day21Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}