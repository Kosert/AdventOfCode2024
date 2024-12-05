package day4


fun day4Part2(): Int {
    val array = day4Input.split("\n")

    var counter = 0
    array.forEachIndexed { y, line ->
        line.forEachIndexed { x, char ->
            if (char == 'A') {
                val diagonal1 = (array.getAt(x - 1, y - 1) == 'S' && array.getAt(x + 1, y + 1) == 'M') ||
                    (array.getAt(x - 1, y - 1) == 'M' && array.getAt(x + 1, y + 1) == 'S')

                val diagonal2 = (array.getAt(x - 1, y + 1) == 'S' && array.getAt(x + 1, y - 1) == 'M') ||
                    (array.getAt(x - 1, y + 1) == 'M' && array.getAt(x + 1, y - 1) == 'S')

                if (diagonal1 && diagonal2) {
                    counter++
                }
            }
        }
    }

    return counter
}

private fun List<String>.getAt(x: Int, y: Int) = getOrNull(y)?.getOrNull(x)
