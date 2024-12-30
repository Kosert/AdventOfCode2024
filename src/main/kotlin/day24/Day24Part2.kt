package day24

import utils.permutations


fun day24Part1(input: String = Day24Input.prodInput): Long {
    val (gates, wires) = parseGatesAndWires(input)
    return calculateZ(wires, gates)?.toLong(2) ?: error("Cannot calculate solution")
}

private fun parseGatesAndWires(input: String): Pair<List<Gate>, Map<String, Boolean>> {
    val wires = mutableMapOf<String, Boolean>()
    val gates = buildList {
        input.lineSequence().filterNot { it.isEmpty() }.forEach { line ->
            if (line.contains(':')) {
                val (name, value) = line.split(':').let { it[0] to it[1].trim().toBoolValue() }
                wires[name] = value
            } else {
                val input1 = line.take(3)
                val type = GateType.valueOf(line.drop(4).take(3).trim())
                val input2 = line.drop(7).take(4).trim()
                val output = line.takeLast(3)
                add(Gate(listOf(input1, input2), type, output))
            }
        }
    }
    return gates to wires
}

private fun calculateZ(initialWires: Map<String, Boolean>, gates: List<Gate>): String? {
    val wires = initialWires.toMutableMap()
    val gatesToProcess = gates.toMutableSet()
    while (gatesToProcess.isNotEmpty()) {
        val gate = gatesToProcess.firstOrNull { gate ->
            gate.inputs.all { wires.containsKey(it) }
        } ?: return null

        val (input1, input2) = gate.inputs.toList().map { wires.getValue(it) }
        val outputValue =
            when (gate.type) {
                GateType.AND -> input1 && input2
                GateType.OR -> input1 || input2
                GateType.XOR -> input1 xor input2
            }
        wires[gate.output] = outputValue
        gatesToProcess.remove(gate)
    }

    return wires
        .filterKeys { it.startsWith('z') }
        .map { it.toPair() }
        .sortedByDescending { it.first }
        .joinToString("") { it.second.toBinaryString() }
}

fun day24Part2(input: String = Day24Input.prodInput): String {
    val (gates, wires) = parseGatesAndWires(input)

    val initialWires = wires.toMap()

    val binaryX = wires.filterKeys { it.startsWith('x') }
        .map { it.toPair() }
        .sortedByDescending { it.first }
        .joinToString("") { it.second.toBinaryString() }

    val binaryY = wires.filterKeys { it.startsWith('y') }
        .map { it.toPair() }
        .sortedByDescending { it.first }
        .joinToString("") { it.second.toBinaryString() }

    val actual = calculateZ(initialWires, gates) ?: error("can't solve")

    val sum = binaryX.toLong(2) + binaryY.toLong(2)
    val expected = sum.toString(2).padStart(actual.length, '0')

    val faultyGates = mutableSetOf<Gate>()
    gates.forEach { gate ->
        if (gate.type == GateType.XOR) {
            val isXYInput = gate.inputs.all { it.startsWith('x') || it.startsWith('y') }
            val isZOutput = gate.output.startsWith('z')

            if (isXYInput && gate.inputs != listOf("x00", "y00")) {
                gates.filter { gate.output in it.inputs }
                    .none { it.type == GateType.XOR }
                    .let { result ->
                        if (result) {
                            println("XOR with XY inputs doesn't output to another XOR: $gate")
                            faultyGates.add(gate)
                        }
                    }
            }

            if (!isXYInput && !isZOutput) {
                println("XOR doesn't have XY inputs or Z output: $gate")
                faultyGates.add(gate)
            }
        }

        if (gate.type == GateType.AND && gate.inputs != listOf("x00", "y00")) {
            gates.filter { gate.output in it.inputs }
                .any { it.type != GateType.OR }
                .let { result ->
                    if (result) {
                        println("AND should only output to OR: $gate")
                        faultyGates.add(gate)
                    }
                }
        }

        if (gate.output.startsWith('z') && gate.output != "z45" && gate.type != GateType.XOR) {
            println("Z output should be from XOR, but is: $gate")
            faultyGates.add(gate)
        }
    }

    assert(faultyGates.size == 8) { "Need exactly 4 pairs of gates" }

    // verification
    permutations(faultyGates)
        .map { it.chunked(2).toSet() }
        .toSet()
        .any { swaps ->
            swaps.forEach { (g1, g2) ->
                val temp = g1.output
                g1.output = g2.output
                g2.output = temp
            }

            val binaryZ = calculateZ(initialWires, gates)?.padStart(expected.length, '0')
            if (binaryZ == expected) {
                println(swaps.map { swap -> swap.map { it.output } })
                return@any true
            }

            swaps.forEach { (g1, g2) ->
                val temp = g1.output
                g1.output = g2.output
                g2.output = temp
            }
            return@any false
        }
        .let { success ->
            if (!success) error("No correct answer found for $faultyGates")
        }

    return faultyGates
        .map { it.output }
        .sorted()
        .joinToString(",")
}


