import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    var counter = 0
    var sequence = 0
    val n = scanner.nextInt()
    var y = 0
    repeat(n) {
        val x = scanner.nextInt()
        if (y <= x) {
            counter++
        } else {
            if (counter > sequence) sequence = counter
            counter = 1
        }
        y = x
    }

    if (counter > sequence) {
        println(counter)
    } else println(sequence)

}
