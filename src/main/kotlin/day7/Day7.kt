package day7


val testInput = """
    190: 10 19
    3267: 81 40 27
    83: 17 5
    156: 15 6
    7290: 6 8 6 15
    161011: 16 10 13
    192: 17 8 14
    21037: 9 7 18 13
    292: 11 6 16 20
""".trimIndent()

private typealias Operation = (Long, Long) -> Long

fun day7Part1() = day7(
    operations = listOf<Operation>(
        { a, b -> a + b },
        { a, b -> a * b },
    )
)

fun day7Part2() = day7(
    operations = listOf<Operation>(
        { a, b -> a + b },
        { a, b -> a * b },
        { a, b -> (a.toString() + b.toString()).toLong() },
    )
)

private class Equation(val operation: Operation, val value: Long)

private fun day7(operations: List<Operation>): Long {
    val (expected, rows) = day7Input.lineSequence().map { line ->
        line.split(":").let {
            it[0].toLong() to it[1].trim().split(" ").map { it.toLong() }
        }
    }.unzip()

    fun List<List<Operation>>.multiply(): List<List<Operation>> = operations.flatMap { operation ->
        this.map { it + operation }
    }

    return rows.asSequence().map { numbers ->
        var operationsMatrix = operations.map { listOf(it) }
        repeat(numbers.size - 1) { operationsMatrix = operationsMatrix.multiply() }
        operationsMatrix.map { variant ->
            variant.mapIndexed { index, op -> Equation(op, numbers[index]) }
        }
    }.map { rowsEquation ->
        rowsEquation.map { equations ->
            equations.fold(0L, { acc, it -> it.operation(acc, it.value) })
        }

    }.mapIndexedNotNull { index, results ->
        expected[index].takeIf { results.contains(expected[index]) }.also {
            println("Expected: ${expected[index]}, found: ${it != null}, index: $index/${rows.lastIndex}")
        }
    }.sum()
}