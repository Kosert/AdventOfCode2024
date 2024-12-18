package day18

import MultipleCasesTest
import kotlin.test.Test

class Day18Part1Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(
        Day18Input.testInput to 22
    )

    override fun execute(input: String) = day18Part1(input, Day18Input.testSize, Day18Input.testBlocks)

    @Test
    fun testPart1() = assertAllCases()
}