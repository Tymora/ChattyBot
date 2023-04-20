fun main() {
    val num = readln().toInt()
    var plus = 0
    repeat(num) {
        val comp = readln().toInt()
        if (comp >= 1) {
            plus += 1
        } else {}
    }
    println("$plus")
}