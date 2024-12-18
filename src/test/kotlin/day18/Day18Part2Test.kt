package day18

import MultipleCasesTest
import kotlin.test.Test

class Day18Part2Test : MultipleCasesTest<String, String>() {

    override val testData: List<Pair<String, String>> = listOf(
        Day18Input.testInput to "6,1"
    )

    override fun execute(input: String) = day18Part2(input, Day18Input.testSize, 1)

    @Test
    fun testPart1() = assertAllCases()
}