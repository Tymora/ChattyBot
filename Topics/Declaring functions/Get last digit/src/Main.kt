import kotlin.math.abs

fun getLastDigit(a: Int): Int {
    return abs(a % 10)
}

// write your code here
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}