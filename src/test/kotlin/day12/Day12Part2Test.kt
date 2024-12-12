package day12

import MultipleCasesTest
import kotlin.test.Test

class Day12Part2Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(
        Day12Input.testInput to 80,
        Day12Input.testInput2 to 1206,
        Day12Input.testInput3 to 436,
        Day12Input.testInput4 to 368,
    )

    override fun execute(input: String) = day12Part1(input)

    @Test
    fun testPart2() = assertAllCases()
}