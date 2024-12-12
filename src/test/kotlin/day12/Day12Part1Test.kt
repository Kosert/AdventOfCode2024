package day12

import MultipleCasesTest
import kotlin.test.Test

class Day12Part1Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(
        Day12Input.testInput to 140,
        Day12Input.testInput2 to 1930,
        Day12Input.testInput3 to 772,
    )

    override fun execute(input: String) = day12Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}