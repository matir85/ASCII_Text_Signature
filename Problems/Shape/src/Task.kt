import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val choice = scanner.nextInt()
    when (choice) {
        1 -> println("You have chosen a square")
        2 -> println("You have chosen a circle")
        3 -> println("You have chosen a triangle")
        4 -> println("You have chosen a rhombus")
        else -> println("There is no such shape!")
    }
}