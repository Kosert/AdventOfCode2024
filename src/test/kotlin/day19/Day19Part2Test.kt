package day19

import MultipleCasesTest
import kotlin.test.Test

class Day19Part2Test : MultipleCasesTest<String, Long>() {

    override val testData: List<Pair<String, Long>> = listOf(
        Day19Input.testInput to 16
    )

    override fun execute(input: String) = day19Part2(input)

    @Test
    fun testPart2() = assertAllCases()
}