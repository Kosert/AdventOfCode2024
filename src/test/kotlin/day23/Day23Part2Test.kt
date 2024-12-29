package day23

import MultipleCasesTest
import kotlin.test.Test

class Day23Part2Test : MultipleCasesTest<String, String>() {

    override val testData: List<Pair<String, String>> = listOf(
        Day23Input.testInput to "co,de,ka,ta"
    )

    override fun execute(input: String) = day23Part2(input)

    @Test
    fun testPart2() = assertAllCases()
}