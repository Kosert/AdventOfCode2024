package day21

import MultipleCasesTest
import kotlin.test.Test

class Day21Part2Test : MultipleCasesTest<String, Long>() {

    override val testData: List<Pair<String, Long>> = listOf(
        Day21Input.prodInput to 167389793580400
    )

    override fun execute(input: String) = day21Part2(input)

    @Test
    fun testPart2() = assertAllCases()
}