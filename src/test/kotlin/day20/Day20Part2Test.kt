package day20

import MultipleCasesTest
import kotlin.test.Test

class Day20Part2Test : MultipleCasesTest<String, Map<Int, Int>>() {

    override val testData: List<Pair<String, Map<Int, Int>>> = listOf(
        Day20Input.testInput to mapOf(
            50 to 32,
            52 to 31,
            54 to 29,
            56 to 39,
            58 to 25,
            60 to 23,
            62 to 20,
            64 to 19,
            66 to 12,
            68 to 14,
            70 to 12,
            72 to 22,
            74 to 4,
            76 to 3,
        )
    )

    override fun execute(input: String) = day20Part2Core(input)

    @Test
    fun testPart2() = assertAllCases()
}