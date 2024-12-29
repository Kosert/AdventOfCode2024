package day23

fun day23Part1(input: String = Day23Input.prodInput): Int {
    val connections = input.lineSequence().map { line -> line.split("-").let { it[0] to it[1] } }

    val nodes = connections.flatMap { it.toList() }.distinct()
    val nodesToCheck = nodes.filter { it.first() == 't' }.toMutableSet()

    fun getConnected(node: String): Sequence<String> {
        return connections.filter { it.first == node || it.second == node }
            .map { if (it.first == node) it.second else it.first }
    }

    val triples = mutableSetOf<Set<String>>()
    while (nodesToCheck.isNotEmpty()) {
        val node = nodesToCheck.first()

        getConnected(node).forEach { neighbor ->
            val connectedToNeighbor = getConnected(neighbor)
            connectedToNeighbor.forEach { third ->
                val connectedToThird = getConnected(third)
                if (connectedToThird.contains(node)) {
                    triples.add(setOf(node, neighbor, third))
                }
            }
        }
        nodesToCheck.remove(node)
    }

    return triples.size
}
