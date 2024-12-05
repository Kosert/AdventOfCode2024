
fun <T> List<T>.dropIndex(index: Int): List<T> = subList(0, index) + subList(index + 1, this.size)
