import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()

    if (str == str.reversed()) println("yes")
    else println("no")
}