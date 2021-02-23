import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val fileX = IntArray(5)
    val fileY = IntArray(5)
    var freeX = ""
    var freeY = ""
    repeat(3) {
        val x = input.nextInt()
        fileX[x - 1] = 1
        val y = input.nextInt()
        fileY[y - 1] = 1
    }
    for (i in 0..fileX.lastIndex) {
        if (fileX[i] == 0) {
            freeX += "${i + 1} "
        }
    }
    for (i in 0..fileY.lastIndex) {
        if (fileY[i] == 0) {
            freeY += "${i + 1} "
        }
    }
    println(freeX.trim())
    println(freeY.trimEnd())
}