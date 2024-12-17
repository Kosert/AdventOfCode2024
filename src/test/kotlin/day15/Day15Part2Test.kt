package day15

import MultipleCasesTest
import kotlin.test.Test

class Day15Part2Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(
        Day15Input.testInput2 to 9021,
    )

    override fun execute(input: String) = day15Part2(input)

    @Test
    fun testPart2() = assertAllCases()
}