package day09

val testInput = """2333133121414131402""".trimIndent()

fun day9Part1(input: String = day9Input): Long {
    val blocks = input.mapIndexed { index: Int, char: Char ->
        val size = char.digitToInt()
        val fileId = index / 2
        Block(index, size, fileId.takeIf { index % 2 == 0 })
    }

    blocks.reversed().forEach { block ->
        if (!block.isFileBlock()) {
            return@forEach
        }

        block.units.indices.reversed().forEach { unitIndex ->
            blocks.firstOrNull { it.getEmptySpace() > 0 }
                ?.takeIf { it.blockIndex < block.blockIndex }
                ?.let {
                    it.save(block.units[unitIndex] ?: error("File block contains null"))
                    block.units[unitIndex] = null
                }
        }
    }

    return blocks.flatMap { it.units }.filterNotNull()
        .withIndex()
        .sumOf { it.index * it.value.toLong() }
}