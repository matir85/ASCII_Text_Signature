import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val date = scanner.next()
    val newDate = date.split("-")
    print("${newDate[1]}/${newDate[2]}/${newDate[0]}")
}