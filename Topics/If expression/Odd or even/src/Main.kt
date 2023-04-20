fun main() {
    val number = readln().toInt()
    println(
        if (number % 2 == 0) {
            "EVEN"
        } else {
            "ODD"
        }
    )
}