fun main() {
    val hourMin = readln().toInt()
    val hourMax = readln().toInt()
    val sleepAnn = readln().toInt()

    if (sleepAnn < hourMin) {
        println("Deficiency")
    } else if (sleepAnn in hourMin..hourMax) {
        println("Normal")
    } else {
        println("Excess")
    }
}