package day16

import MultipleCasesTest
import kotlin.test.Test

class Day16Part2Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(
        Day16Input.testInput to 45,
//        Day16Input.testInput2 to 64,
    )

    override fun execute(input: String) = day16Part2(input)

    @Test
    fun testPart2() = assertAllCases()
}