fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    var rezult = 0
    for (z in a..b) {
        rezult += z
    }
    println(rezult)
}