package day13

import MultipleCasesTest
import kotlin.test.Test

class Day13Part2Test : MultipleCasesTest<String, Long>() {

    override val testData: List<Pair<String, Long>> = listOf(
        """Button A: X+94, Y+34
            Button B: X+22, Y+67
            Prize: X=8400, Y=5400""" to 0L,
        """Button A: X+26, Y+66
            Button B: X+67, Y+21
            Prize: X=12748, Y=12176""" to 459236326669L,
        """Button A: X+17, Y+86
            Button B: X+84, Y+37
            Prize: X=7870, Y=6450""" to 0L,
        """Button A: X+69, Y+23
            Button B: X+27, Y+71
            Prize: X=18641, Y=10279""" to 416082282239L
    )


    override fun execute(input: String) = day13Part2(input)

    @Test
    fun testPart2() = assertAllCases()
}