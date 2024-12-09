package day9

class Block(
    val blockIndex: Int,
    val size: Int,
    initValue: Int?,
) {
    val units = MutableList(size) { initValue }

    fun isFileBlock(): Boolean = blockIndex % 2 == 0
    fun getEmptySpace(): Int = units.count { it == null }
    fun save(value: Int) {
        val index = units.indexOfFirst { it == null }
        units[index] = value
    }

    override fun toString(): String = units.toString()
}