import java.lang.System.`in`
import java.util.*

fun main() {
    val scanner = Scanner(`in`)
    var counter = 0
    while (scanner.nextInt() != 0) {
        counter++
    }
    println(counter)
}