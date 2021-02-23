import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val txt = scanner.nextLine().toString()
    var counter: Int = 0
    next@ for (i in txt) {
        var x: Int = 0
        for (j in txt) {
            if (i == j) x++
            if (x > 1) continue@next
        }
        counter++
    }

    println(counter)
}