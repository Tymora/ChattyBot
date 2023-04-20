fun main() {
    val interval = readln().toInt()
    val equ = interval in -14..12 || interval in 15..16 || interval in 19..Int.MAX_VALUE
    println(
        if (equ) "True"
        else "False"
    )
}