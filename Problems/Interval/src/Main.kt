import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    if ((-15 < n && n <= 12) || (n in 15..16) || 19 <= n) println("True")
    else println("False")
}