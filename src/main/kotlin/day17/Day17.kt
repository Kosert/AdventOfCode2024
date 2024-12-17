package day17

fun day17Part1(input: String = Day17Input.prodInput): String {
    val inputSequence = input.lineSequence()
        .filter { it.isNotEmpty() }
        .map { it.split(":")[1].trim() }

    val (a, b, c) = inputSequence.take(3).map { it.toLong() }.toList()
    val program = inputSequence.last().split(",").map { it.toInt() }

    val cpu = Cpu(a, b, c)
    return cpu.executeProgram(program).joinToString(",")
}

// 2,4,1,5,7,5,0,3,1,6,4,3,5,5,3,0
// b = a % 8     // b in 0..7
// b = b xor 5   // b xor 5
// c = a / 2^b   // c = a / 2^b
// A = A / 8     //
// B = B xor 6   //
// B = B xor C   // 0 xor C
// out B         // b = 0
// if A > 0 jump 0
fun day17Part2(input: String = Day17Input.prodInput): Long {
    val programString = input.lines().last().split(":")[1].trim()
    val program = programString.split(",").map { it.toInt() }

    var a = 0L
    (1..program.size).forEach {
        val base = a * 8
        val expected = program.takeLast(it)
        var counter = 0
        while (true) {
            val cpu = Cpu(base + counter, 0, 0)
            if (cpu.executeProgram(program) == expected) {
                break
            }
            counter++
        }
        a = base + counter
    }

    return a
}