import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val numb = scanner.next()
    var sum = 0
    for (i in 0..2) {
        sum += numb[i].toString().toInt()
    }
    println(sum)
}