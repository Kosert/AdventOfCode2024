package day9

fun day9Part2(input: String = day9Input): Long {
    val blocks = input.mapIndexed { index: Int, char: Char ->
        val size = char.digitToInt()
        val fileId = index / 2
        Block(index, size, fileId.takeIf { index % 2 == 0 })
    }

    blocks.reversed().forEach { block ->
        if (!block.isFileBlock()) {
            return@forEach
        }

        blocks.firstOrNull { it.getEmptySpace() >= block.size }
            ?.takeIf { it.blockIndex < block.blockIndex }
            ?.let {
                block.units.forEachIndexed { index, _ ->
                    it.save(block.units[index] ?: error("File block contains null"))
                }
                block.units.fill(null)
            }
    }

    return blocks.flatMap { it.units }
        .map { it?.toLong() ?: 0L }
        .withIndex()
        .sumOf { it.index * it.value }
}