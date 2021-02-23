import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    // put your code here
    val letter = input.next()
    for (i in 'a' until letter.first()) {
        print(i)
    }
}