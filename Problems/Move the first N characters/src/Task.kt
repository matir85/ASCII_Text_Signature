import java.util.*

fun main() {
    // write your code here
    val input = Scanner(System.`in`)
    val s = input.next()
    val n = input.nextInt()

    if (n > s.length) {
        print(s)
    } else {
        val begin = s.substring(0, n)
        val end = s.substring(n, s.length)
        println("$end$begin")
    }
}