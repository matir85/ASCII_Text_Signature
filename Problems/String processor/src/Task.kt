import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val txt1 = scanner.nextLine()
    val operator = scanner.next()
    val txt2 = scanner.next()

    when (operator) {
        "equals" -> println(txt1 == txt2)
        "plus" -> println("$txt1$txt2")
        "endsWith" -> println(txt1.endsWith(txt2))
        else -> println("Unknown operation")
    }
}