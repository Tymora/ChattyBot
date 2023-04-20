fun main() {
    val num = readln().toInt()
    var big = 0
    var defect = 0
    var perfect = 0
    repeat(num) {
        val comp = readln().toInt()
        if (comp == 1) {
            big += 1
        } else if (comp == -1) {
            defect += 1
        } else if (comp == 0) {
            perfect += 1
        }
    }
    println("$perfect $big $defect")
}