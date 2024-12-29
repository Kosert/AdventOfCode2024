package day23

import MultipleCasesTest
import kotlin.test.Test

class Day23Part1Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(
        Day23Input.testInput to 7
    )

    override fun execute(input: String) = day23Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}