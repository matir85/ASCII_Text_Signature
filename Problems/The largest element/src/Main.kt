import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)

    var largestElement = 0
    var n = 1
    while (n != 0) {
        n = scanner.nextInt()
        if (n >= largestElement) largestElement = n
    }

    println(largestElement)
}