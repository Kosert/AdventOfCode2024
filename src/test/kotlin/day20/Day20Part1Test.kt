package day20

import MultipleCasesTest
import kotlin.test.Test

class Day20Part1Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(

    )

    override fun execute(input: String) = day20Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}