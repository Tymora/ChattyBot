fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}
// write your function here

fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}