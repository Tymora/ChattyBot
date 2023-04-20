fun main() {
    val x = readLine().toBoolean()
    val y = readLine().toBoolean()
    val z = readLine().toBoolean()
    val logic = !(x && y) || z
    println(logic)
}