package utils

typealias List2D<T> = List<List<T>>

typealias Position = Pair<Int, Int>

val Position.x
    get() = first

val Position.y
    get() = second

fun <T> List2D<T>.getAt(x: Int, y: Int) = getOrNull(y)?.getOrNull(x)

fun <T> List2D<T>.getAt(position: Position) = getOrNull(position.y)?.getOrNull(position.x)

fun <T> List2D<T>.withPositions(): List2D<Pair<Position, T>> = mapIndexed { y, row -> row.mapIndexed { x, it -> Pair((x to y), it) } }

fun <T> List2D<T>.forEach2D(block: (T) -> Unit) {
    this.forEach{ row -> row.forEach { value -> block(value) } }
}

fun <T> List2D<T>.forEachIndexed2D(block: (Position, T) -> Unit) {
    this.withPositions().forEach2D { (position, value) -> block(position, value) }
}

fun <T, R> List2D<T>.map2D(block: (T) -> R): List2D<R> {
    return this.map { row -> row.map { value -> block(value) } }
}

fun <T, R> List2D<T>.map2DIndexed(block: (Position, T) -> R): List2D<R> {
    return this.withPositions().map2D { (position, value) -> block(position, value) }
}