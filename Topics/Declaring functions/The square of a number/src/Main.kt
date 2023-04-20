fun square(number: Int): Int {
    return number * number
}

/* Do not change code below */
fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}