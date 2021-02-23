import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val word = input.next()
    for (i in 'a'..'z') {
        if (i in word) continue
        print(i)
    }
}