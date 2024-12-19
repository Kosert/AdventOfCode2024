package day23

import MultipleCasesTest
import kotlin.test.Test

class Day23Part2Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(

    )

    override fun execute(input: String) = day23Part2(input)

    @Test
    fun testPart2() = assertAllCases()
}