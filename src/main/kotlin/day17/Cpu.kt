package day17

import kotlin.math.pow

class Cpu(
    private var registerA: Long = 0,
    private var registerB: Long = 0,
    private var registerC: Long = 0,
) {
    private val output = mutableListOf<Int>()
    private var pointer = 0

    fun executeProgram(program: List<Int>): List<Int> {
        output.clear()
        pointer = 0
        while (pointer < program.size) {
            val opCode = OpCode(program[pointer])
            val literalOperand = program[pointer + 1].toLong()
            when (opCode) {
                OpCode.ADV -> adv(getComboOperand(literalOperand))
                OpCode.BXL -> bxl(literalOperand)
                OpCode.BST -> bst(getComboOperand(literalOperand))
                OpCode.JNZ -> jnz(literalOperand)
                OpCode.BXC -> bxc()
                OpCode.OUT -> out(getComboOperand(literalOperand))
                OpCode.BDV -> bdv(getComboOperand(literalOperand))
                OpCode.CDV -> cdv(getComboOperand(literalOperand))
            }
        }
        return output.toList()
    }

    private fun getComboOperand(value: Long) = when (value) {
        in 0..3 -> value
        4L -> registerA
        5L -> registerB
        6L -> registerC
        else -> error("Invalid combo operand: $value")
    }


    fun adv(operand: Long) {
        registerA = (registerA / 2.0.pow(operand.toInt())).toLong()
        pointer += 2
    }

    fun bxl(operand: Long) {
        registerB = registerB.xor(operand)
        pointer += 2
    }

    fun bst(operand: Long) {
        registerB = operand % 8
        pointer += 2
    }

    fun jnz(operand: Long) {
        if (registerA == 0L) {
            pointer += 2
            return
        }
        pointer = operand.toInt()
    }

    fun bxc() {
        registerB = registerB.xor(registerC)
        pointer += 2
    }

    fun out(operand: Long) {
        output.add((operand % 8L).toInt())
        pointer += 2
    }

    fun bdv(operand: Long) {
        registerB = (registerA / 2.0.pow(operand.toInt())).toLong()
        pointer += 2
    }

    fun cdv(operand: Long) {
        registerC = (registerA / 2.0.pow(operand.toInt())).toLong()
        pointer += 2
    }
}