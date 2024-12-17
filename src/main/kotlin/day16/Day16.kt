package day16

import utils.*

enum class Orientation {
    VERTICAL, HORIZONTAL
}

data class NodeImpl(val position: Position, val orientation: Orientation) : Node
val Node.position
    get() = (this as NodeImpl).position

private fun generateEdges(position: Position): List<Edge> {
    return listOf(
        Edge(
            NodeImpl(position, Orientation.VERTICAL),
            NodeImpl(position.moved(Dir.DOWN), Orientation.VERTICAL),
            1
        ),
        Edge(
            NodeImpl(position, Orientation.VERTICAL),
            NodeImpl(position.moved(Dir.UP), Orientation.VERTICAL),
            1
        ),
        Edge(
            NodeImpl(position, Orientation.HORIZONTAL),
            NodeImpl(position.moved(Dir.RIGHT), Orientation.HORIZONTAL),
            1
        ),
        Edge(
            NodeImpl(position, Orientation.HORIZONTAL),
            NodeImpl(position.moved(Dir.LEFT), Orientation.HORIZONTAL),
            1
        ),
        Edge(NodeImpl(position, Orientation.VERTICAL), NodeImpl(position, Orientation.HORIZONTAL), 1000),
        Edge(NodeImpl(position, Orientation.HORIZONTAL), NodeImpl(position, Orientation.VERTICAL), 1000),
    )
}

fun day16Part1(input: String = Day16Input.prodInput): Int {
    val maze: List2D<Char> = input.lines().map { line -> line.map { it } }

    lateinit var source: NodeImpl
    lateinit var target: NodeImpl
    val edges = mutableListOf<Edge>()
    maze.forEachIndexed2D { position, char ->
        when (char) {
            '#' -> Unit
            '.' -> edges.addAll(generateEdges(position))
            'S' -> {
                source = NodeImpl(position, Orientation.HORIZONTAL)
                edges.addAll(generateEdges(position))
            }
            'E' -> {
                target = NodeImpl(position, Orientation.HORIZONTAL)
                edges.addAll(generateEdges(position))
                edges.add(Edge(NodeImpl(position, Orientation.VERTICAL), NodeImpl(position, Orientation.HORIZONTAL), 0))
            }
        }
    }

    val result = findShortestPath(edges, source, target)
    return result.shortestDistance() ?: error("No path found")
}

//fixme this doesn't work for some inputs
fun day16Part2(input: String = Day16Input.prodInput): Int {

    val maze: List2D<Char> = input.lines().map { line -> line.map { it } }

    lateinit var source: NodeImpl
    lateinit var target: NodeImpl
    val edges = mutableListOf<Edge>()
    maze.forEachIndexed2D { position, char ->
        when (char) {
            '#' -> {}
            '.' -> {
                edges.addAll(generateEdges(position))
            }
            'S' -> {
                source = NodeImpl(position, Orientation.HORIZONTAL)
                edges.addAll(generateEdges(position))
            }
            'E' -> {
                target = NodeImpl(position, Orientation.VERTICAL)
                edges.addAll(generateEdges(position))
                edges.add(Edge(NodeImpl(position, Orientation.HORIZONTAL), NodeImpl(position, Orientation.VERTICAL), 0))
            }
        }
    }

    val firstResult = findShortestPath(edges, source, target)
    val pathTilesSet = firstResult.shortestPath().map { (it as NodeImpl).position }.toMutableSet()
    println(pathTilesSet.size)
    val extraPathsTilesSet = mutableSetOf<Position>()

    val alreadyProcessedKeys = mutableSetOf<Pair<Node, List<Node>>>()
    fun getAlternatives(result: ShortestPathResult) {
        result.prev.entries.filter { it.value.size > 1 }
            .filter { it.key.position in pathTilesSet }
            .also { println("Found ${it.size} potential alternatives") }
            .forEach { junction ->
                if (alreadyProcessedKeys.contains(junction.toPair()))
                    return
                alreadyProcessedKeys.add(junction.toPair())
                junction.println()
                junction.value.drop(1).forEach {
                    val test = edges.filter { edge -> edge.node1 != it && edge.node2 == junction.key }
                    println("Filtered: $test")
                    val edges2 = edges.filterNot { edge -> edge.node1 != it && edge.node2 == junction.key }
                    val alternativeResult = findShortestPath(edges2, source, junction.key)
                    alternativeResult
                        .shortestPath(source, junction.key)
                        .also {
                            println("Path length = ${it.size}")
                            val new = it.filter { !pathTilesSet.contains(it.position) }
                            println("Adding: ${new.size}")
                            extraPathsTilesSet.addAll(new.map { it.position })
                        }
                    getAlternatives(alternativeResult)
                }
            }
    }

    getAlternatives(firstResult)


    maze.forEachIndexed2D { (x, y), it ->
        if (x == 0)
            println()

        if (pathTilesSet.contains(x to y))
            print("O")
        else if (extraPathsTilesSet.contains(x to y))
            print("X")
        else
            print(it)
    }

    println()
    println(pathTilesSet)
    println(pathTilesSet.size + extraPathsTilesSet.size)
    return pathTilesSet.size + extraPathsTilesSet.size
}