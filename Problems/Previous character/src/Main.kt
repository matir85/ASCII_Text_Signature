import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val txt = charArrayOf(' ', ' ', ' ', ' ')
    for (i in 0..3) {
        val a = readLine()!!
        txt[i] = a.single()
    }
    for (i in 0..3) {
        println(txt[i] - 1)
    }

}