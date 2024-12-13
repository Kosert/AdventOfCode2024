package day13

data class Machine(
    val buttonA: Pair<Long, Long>,
    val buttonB: Pair<Long, Long>,
    val target: Pair<Long, Long>
) {
    fun calculate(): Long {
        val (aX, aY) = buttonA
        val (bX, bY) = buttonB
        val (tX, tY) = target

        /*
            a * aX + b * bX = tX
            a * aY + b * bY = tY

            a = (bY * tX - bX * tY) / (aX * bY - aY * bX)
            b = (tY - a * aY) / bY
         */
        val aPresses = (bY * tX - bX * tY) / (aX * bY - aY * bX)
        val bPresses = (tY - aPresses * aY) / bY

        val resultX = aPresses * aX + bPresses * bX
        val resultY = aPresses * aY + bPresses * bY
        return if (resultX == tX && resultY == tY)
            aPresses * 3 + bPresses
        else 0
    }
}

private fun parseMachines(input: String): Sequence<Machine> {
    return input.lineSequence()
        .chunked(4)
        .map { (a, b, prize) ->
            val buttonA = a.split(",").let { (x, y) ->
                x.filter { it.isDigit() }.toLong() to y.filter { it.isDigit() }.toLong()
            }
            val buttonB = b.split(",").let { (x, y) ->
                x.filter { it.isDigit() }.toLong() to y.filter { it.isDigit() }.toLong()
            }
            val target = prize.split(",").let { (x, y) ->
                x.filter { it.isDigit() }.toLong() to y.filter { it.isDigit() }.toLong()
            }
            Machine(buttonA, buttonB, target)
        }
}

fun day13Part1(input: String = Day13Input.prodInput): Long {
    return parseMachines(input).sumOf { it.calculate() }
}

fun day13Part2(input: String = Day13Input.prodInput): Long {
    return parseMachines(input)
        .map {
            val (targetX, targetY) = it.target
            it.copy(target = targetX + 10000000000000L to targetY + 10000000000000L)
        }
        .sumOf { it.calculate() }
}