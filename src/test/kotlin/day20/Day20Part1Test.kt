package day20

import MultipleCasesTest
import kotlin.test.Test

class Day20Part1Test : MultipleCasesTest<String, Map<Int, Int>>() {

    override val testData: List<Pair<String, Map<Int, Int>>> = listOf(
        Day20Input.testInput to mapOf(
            2 to 14,
            4 to 14,
            6 to 2,
            8 to 4,
            10 to 2,
            12 to 3,
            20 to 1,
            36 to 1,
            38 to 1,
            40 to 1,
            64 to 1,
        )
    )

    override fun execute(input: String) = day20Part1Core(input)

    @Test
    fun testPart1() = assertAllCases()
}