package day14

import MultipleCasesTest
import kotlin.test.Test

class Day14Part1Test : MultipleCasesTest<String, Long>() {

    override val testData: List<Pair<String, Long>> = listOf(
        Day14Input.testInput to 12,
    )

    override fun execute(input: String) = day14Part1(input, testSize)

    @Test
    fun testPart1() = assertAllCases()
}