package day25

import MultipleCasesTest
import kotlin.test.Test

class Day25Part2Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(

    )

    override fun execute(input: String) = day25Part2(input)

    @Test
    fun testPart2() = assertAllCases()
}