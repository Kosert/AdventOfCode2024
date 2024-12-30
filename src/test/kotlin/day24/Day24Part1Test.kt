package day24

import MultipleCasesTest
import kotlin.test.Test

class Day24Part1Test : MultipleCasesTest<String, Long>() {

    override val testData: List<Pair<String, Long>> = listOf(
        Day24Input.testInput to 2024
    )

    override fun execute(input: String) = day24Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}