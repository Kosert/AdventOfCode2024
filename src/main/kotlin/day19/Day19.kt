package day19


fun day19Part1(input: String = Day19Input.prodInput): Int {
    val towels = input.lineSequence().first().split(", ").sortedByDescending { it.length }
    val patterns = input.lineSequence().drop(2)

    val cache = mutableMapOf<String, List<String>?>()

    fun findNext(result: List<String>, pattern: String): List<String>? {
        val alreadyFound = result.joinToString("")
        val remaining = pattern.drop(alreadyFound.length)

        if (remaining.isEmpty())
            return result

        if (cache.contains(remaining)) {
            return cache[remaining]
        }

        return towels.asSequence()
            .filter { remaining.startsWith(it) }
            .firstNotNullOfOrNull { found -> findNext(result + found, pattern) }
            .also { cache.putIfAbsent(remaining, it) }
    }

    return patterns.count { findNext(emptyList(), it) != null }
}

fun day19Part2(input: String = Day19Input.prodInput): Long {
    val towels = input.lineSequence().first().split(", ").sortedByDescending { it.length }
    val patterns = input.lineSequence().drop(2)

    val cache = mutableMapOf<String, Long>()

    fun findNext(result: List<String>, pattern: String): Long {
        val alreadyFound = result.joinToString("")
        val remaining = pattern.drop(alreadyFound.length)

        if (remaining.isEmpty())
            return 1

        cache[remaining]?.let {
            return it
        }

        return towels.asSequence()
            .filter { remaining.startsWith(it) }
            .sumOf { found -> findNext(result + found, pattern) }
            .also { cache.putIfAbsent(remaining, it) }
    }

    return patterns.sumOf { findNext(emptyList(), it) }
}