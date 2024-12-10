package utils

enum class Dir(val x: Int, val y: Int) {
    UP(0, -1),
    RIGHT(1, 0),
    DOWN(0, 1),
    LEFT(-1, 0),

    ;

    fun turned() = entries.getOrNull((this.ordinal + 1)) ?: UP
}