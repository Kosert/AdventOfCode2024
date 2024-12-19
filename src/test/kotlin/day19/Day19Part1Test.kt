package day19

import MultipleCasesTest
import kotlin.test.Test

class Day19Part1Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(
        Day19Input.testInput to 6,
    )

    override fun execute(input: String) = day19Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}