package day22

import MultipleCasesTest
import kotlin.test.Test

class Day22Part2Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(

    )

    override fun execute(input: String) = day22Part2(input)

    @Test
    fun testPart2() = assertAllCases()
}