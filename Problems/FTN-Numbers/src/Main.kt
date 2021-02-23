import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

    when (number) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> println("F")
        0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> println("T")
        1, 10, 100, 1_000, 10_000, 100_000 -> println("P")
        else -> println("N")
    }
}
