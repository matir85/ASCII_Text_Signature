import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val string = scanner.nextLine()
    val index = scanner.nextInt()
    println("Symbol # $index of the string \"$string\" is \'${string[index - 1]}\'")
}