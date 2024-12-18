package day25

import MultipleCasesTest
import kotlin.test.Test

class Day25Part1Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(

    )

    override fun execute(input: String) = day25Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}