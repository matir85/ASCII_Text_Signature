import java.util.*

fun main() {
    // put your code here
    var counter = 0
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()

    for (i in a..b) {
        if (i % n == 0) counter++
    }
    println(counter)
}