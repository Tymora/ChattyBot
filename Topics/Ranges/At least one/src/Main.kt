fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    val a = readln().toInt()
    val b = readln().toInt()
    val z = readln().toInt()
    println(
        if (z in x..y || z in a..b) {
            "true"
        } else {
            "false"
        }
    )
}