import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val housee = scanner.next()
    when (housee) {
        "gryffindor" -> println("bravery")
        "hufflepuff" -> println("loyalty")
        "slytherin" -> println("cunning")
        "ravenclaw" -> println("intellect")
        else -> println("not a valid house")
    }
}