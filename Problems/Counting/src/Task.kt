import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val size = scanner.nextInt()
    val number = IntArray(size)
    for (i in 0..number.lastIndex) {
        val num = scanner.nextInt()
        number[i] = num
    }
    val x = scanner.nextInt()
    var sum = 0
    for (i in number) {
        if (i == x) sum++
    }

    println(sum)
}