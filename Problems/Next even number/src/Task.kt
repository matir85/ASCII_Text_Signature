import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    if (n % 2 == 0) println(n + 2)
    else println(n + 1)

}