package day17

enum class OpCode(val value: Int) {
    ADV(0), // A = A / 2^op
    BXL(1), // B = B xor op (literal)
    BST(2), // B = op % 8
    JNZ(3), // if A > 0 jump op (literal)
    BXC(4), // B = B xor C
    OUT(5), // out op
    BDV(6), // B = A / 2^op
    CDV(7), // C = A / 2^op
    ;

    companion object {
        operator fun invoke(value: Int) = entries.first { it.value == value }
    }
}