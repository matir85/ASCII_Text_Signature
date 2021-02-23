import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // write your code here
    val N = scanner.nextInt()
    var tab = intArrayOf()
    var n: Int
    repeat(N){
        n = scanner.nextInt()
        tab += n
    }
    val M = scanner.nextInt()
    if ( M in tab) println("YES")
    else println("NO")
}
