import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here+
    val size = scanner.nextInt()
    val arr = IntArray(size)
    for (i in 0..arr.lastIndex) {
        val n = scanner.nextInt()
        arr[i] = n
    }
    var maxIndex = 0
    var max = 0
    for (i in 0 until size) {
        if (arr[i] > max) {
            maxIndex = i
            max = arr[i]
        }
    }
    println(maxIndex)
}