package day17

import MultipleCasesTest
import kotlin.test.Test

class Day17Part2Test : MultipleCasesTest<String, Long>() {

    override val testData: List<Pair<String, Long>> = listOf(
        Day17Input.testInput2 to 117440L
    )

    override fun execute(input: String) = day17Part2(input)

    @Test
    fun testPart1() = assertAllCases()
}