package day17

import MultipleCasesTest
import kotlin.test.Test

class Day17Part1Test : MultipleCasesTest<String, String>() {

    override val testData: List<Pair<String, String>> = listOf(
        Day17Input.testInput to "4,6,3,5,6,3,5,2,1,0"
    )

    override fun execute(input: String) = day17Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}