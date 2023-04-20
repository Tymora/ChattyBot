fun main() {
    val num = readln().toInt()
    var plus = 4
    repeat(num) {
        val comp = readln().toInt()
        if (comp % 4 == 0) {
            if (comp > plus) {
                plus = comp
            }
        }
    }
    println("$plus")
}