package day6

fun day6Part2(): Int {
    val map = mapInput.split("\n").map { it.toList() }
    var counter = 0

    repeat(map.size) { y->
        repeat(map.first().size) { x ->
            val copy = map.toMutableList().map { it.toMutableList() }
            if (copy[y][x] != '^') {
                copy[y][x] = '#'
                if (copy.isLooped()) {
                    counter++
                }
            }
        }
    }

    return counter
}

fun List<List<Char>>.isLooped(): Boolean {
    val limit = 100_000

    var counter = 0
    var y = this.indexOfFirst { it.contains('^') }
    var x = this[y].indexOfFirst { it == '^' }
    var dir = Dir.UP
    while (true) {
        val next = this.getOrNull(y + dir.y)?.getOrNull(x + dir.x)
        when (next) {
            '#' -> dir = dir.turned()
            '.', '^' -> {
                x += dir.x
                y += dir.y
                counter++
            }
            null -> break
        }
        if (counter > limit) {
            return true
        }
    }
    return false
}