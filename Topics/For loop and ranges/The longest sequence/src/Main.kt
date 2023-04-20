fun main() {
    val n = readln().toInt()
    var z = 1 // последовательность на проверке
    var y = readln().toInt() // последнее число
    var num = 1 // финальная последовательность

    for (i in 1 until n) {
        val currentNumber = readln().toInt()
        if (currentNumber >= y) {
            z += 1
            if (num < z) {
                num = z
            }
        } else {
            z = 1
        }
        y = currentNumber
    }
    println(num)
}