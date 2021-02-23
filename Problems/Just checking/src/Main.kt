
import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    when(a) {
        1 -> println("No!")
        2 -> println("Yes!")
        3 -> println("No!")
        4 -> println("No!")
        else -> println("Unknown number")
    }
}