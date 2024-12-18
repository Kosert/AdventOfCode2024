package day22

import MultipleCasesTest
import kotlin.test.Test

class Day22Part1Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(

    )

    override fun execute(input: String) = day22Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}