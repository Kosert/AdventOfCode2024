package day21

import MultipleCasesTest
import kotlin.test.Test

class Day21Part2Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(

    )

    override fun execute(input: String) = day21Part2(input)

    @Test
    fun testPart1() = assertAllCases()
}