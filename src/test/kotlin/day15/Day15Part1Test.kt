package day15

import MultipleCasesTest
import kotlin.test.Test

class Day15Part1Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(
        Day15Input.testInput to 2028,
        Day15Input.testInput2 to 10092,
    )

    override fun execute(input: String) = day15Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}