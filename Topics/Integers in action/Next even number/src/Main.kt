fun main() {
    val x = readln().toInt()
    val y = x % 2
    if (y == 0) {
        println(x + 2)
    } else {
        println(x + 1)
    }
}