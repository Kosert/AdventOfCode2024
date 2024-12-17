package day15

import utils.*

fun day15Part1(input: String = Day15Input.prodInput): Int {
    val (movesString, warehouseString) = input.lineSequence()
        .filter { it.isNotEmpty() }
        .partition { it.first() in listOf('v', '<', '>', '^') }

    val moves = movesString.flatMap { line -> line.map { Dir.fromSymbol(it) } }
    val warehouse = Warehouse.parse(warehouseString)

    warehouse.executeMoves(moves)
    return warehouse.boxes.sumOf { it.gpsValue() }
}


fun day15Part2(input: String = Day15Input.prodInput): Int {
    val (movesString, warehouseString) = input.lineSequence()
        .filter { it.isNotEmpty() }
        .partition { it.first() in listOf('v', '<', '>', '^') }

    val moves = movesString.flatMap { line -> line.map { Dir.fromSymbol(it) } }
    val warehouse = Warehouse.parse(warehouseString.map {
        it.replace(".", "..")
            .replace("O", "[]")
            .replace("@", "@.")
            .replace("#", "##")
    })

    warehouse.executeMoves(moves)
    return warehouse.boxes.sumOf { it.gpsValue() }
}
