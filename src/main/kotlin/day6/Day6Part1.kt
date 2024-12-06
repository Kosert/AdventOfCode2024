package day6


enum class Dir(val x:Int, val y:Int) {
    UP(0, -1),
    RIGHT(1, 0),
    DOWN(0, 1),
    LEFT(-1, 0);

    fun turned() = entries.getOrNull((this.ordinal + 1)) ?: UP
}

fun day6Part1(): Int {
    val map = mapInput.split("\n").map { it.toList() }

    var y = map.indexOfFirst { it.contains('^') }
    var x = map[y].indexOfFirst { it == '^' }
    var dir = Dir.UP
    val history = mutableListOf<Pair<Int, Int>>()
    while (true) {
        val next = map.getOrNull(y + dir.y)?.getOrNull(x + dir.x)
        history.add(Pair(x, y))
        when (next) {
            '#' -> dir = dir.turned()
            '.', '^' -> {
                x += dir.x
                y += dir.y
            }
            null -> break
        }
    }

    return history.distinct().size
}

