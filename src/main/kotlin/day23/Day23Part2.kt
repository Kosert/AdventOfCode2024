package day23

import utils.cachedFun

fun day23Part2(input: String = Day23Input.prodInput): String {
    val connections = input.lineSequence().map { line -> line.split("-").let { it[0] to it[1] } }

    val nodes = connections.flatMap { it.toList() }.distinct()

    val getConnected: (String) -> Sequence<String> = cachedFun { node: String ->
        return@cachedFun connections.filter { it.first == node || it.second == node }
        .map { if (it.first == node) it.second else it.first }
    }

    fun isConnected(nodes: Set<String>): Boolean = nodes.all { node ->
        val others = nodes.minus(node)
        others.all { getConnected(it).contains(node) }
    }

    val prioritizedList = nodes.sortedByDescending { getConnected(it).count() }

    prioritizedList.forEach {
        val testSet = getConnected(it).toSet() + it
        if (isConnected(testSet)) {
            return testSet.toList().sorted().joinToString(",")
        }
    }

    prioritizedList.forEach {
        val testSet = getConnected(it).toSet() + it
        testSet.minus(it).forEach { one ->
            val testSubset = testSet - one
            if (isConnected(testSubset)) {
                return testSubset.toList().sorted().joinToString(",")
            }
        }
    }

    prioritizedList.forEach {
        val testSet = getConnected(it).toSet() + it
        testSet.minus(it).forEach { one ->
            testSet.forEach { two ->
                val testSubset = testSet - one - two
                if (isConnected(testSubset)) {
                    return testSubset.toList().sorted().joinToString(",")
                }
            }
        }
    }

    error("Didn't find any networks, need to go deeper")
}