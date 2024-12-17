package day16

import MultipleCasesTest
import kotlin.test.Test

class Day16Part1Test : MultipleCasesTest<String, Int>() {

    override val testData: List<Pair<String, Int>> = listOf(
        Day16Input.testInput to 7036,
        Day16Input.testInput2 to 11048
    )

    override fun execute(input: String) = day16Part1(input)

    @Test
    fun testPart1() = assertAllCases()
}