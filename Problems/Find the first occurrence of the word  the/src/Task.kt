import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val sentence = scanner.nextLine()
    val wordArr = sentence.toLowerCase().split(" ").toTypedArray()
    var check = 0
    for (i in wordArr) {
        if (i == "the" || i == "thethethe") {
            check = 1
        }
    }
    if (check == 1) {
        println(sentence.toLowerCase().indexOf("the"))
    } else println(-1)
}