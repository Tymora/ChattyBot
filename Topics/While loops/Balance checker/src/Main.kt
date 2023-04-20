import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var status = true // Прошли ли все платежи.
    while (scanner.hasNextInt()) {
        val next = scanner.next().toInt()
        if (balance >= next) {
            balance -= next
        } else {
            status = false
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $next.")
        }
    }
    if (status) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}
