import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val name = scanner.next()
    val surname = scanner.next()
    val age = scanner.nextInt()

    println("${name.first()}. $surname, $age years old")
}