import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine().toLowerCase()
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    if (alphabet.contains(str)) {
        println("true")
    } else {
        println("false")
    }
}