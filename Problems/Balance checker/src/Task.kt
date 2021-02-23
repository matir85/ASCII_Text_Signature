import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    var wallet = scanner.nextInt()
    var shopping = 0
    var i = 0
    while (scanner.hasNextInt()) {
        val m = scanner.nextInt()
        if (wallet >= m) {
            shopping += m
            wallet -= m
        } else {
            i = m
            shopping += m
        }
    }
    if (i == 0) {
        println("Thank you for choosing us to manage your account! You have $wallet money.")
    } else println("Error, insufficient funds for the purchase. You have $wallet, but you need $i.")
}
