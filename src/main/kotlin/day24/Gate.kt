package day24

enum class GateType {
    AND, OR, XOR
}

data class Gate(
    val inputs: List<String>,
    val type: GateType,
    var output: String,
) {
    override fun toString() = "${inputs.first()} ${type.name} ${inputs[1]} -> $output"
}

fun String.toBoolValue() = this == "1"
fun Boolean.toBinaryString() = if (this) "1" else "0"
