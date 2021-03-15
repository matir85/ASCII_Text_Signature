import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val gc = scanner.next().toLowerCase()
    var counter = 0
    val wordLength = gc.length

    for (i in gc) {
        if (i == 'g' || i == 'c') counter++
    }

    val result = counter.toDouble() / wordLength * 100

    println(result)
}