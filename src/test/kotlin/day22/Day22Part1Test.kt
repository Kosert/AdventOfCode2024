package day22

import MultipleCasesTest
import kotlin.test.Test

class Day22Part1Test : MultipleCasesTest<String, Long>() {

    override val testData: List<Pair<String, Long>> = listOf(
        Day22Input.testInput to 37327623
    )

    override fun execute(input: String) = day22Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}