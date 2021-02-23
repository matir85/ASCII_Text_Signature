import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var a = 1
    while (a * a <= n) {
        println(a * a)
        a++
    }
}
