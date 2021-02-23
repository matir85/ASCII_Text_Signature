fun main() {
    val input = readLine()!!
    // write code here
    if (input.isEmpty()) println()
    else if (input.first() == 'i') println(input.drop(1).toInt() + 1)
    else if (input.first() == 's') println(input.drop(1).reversed())
    else println(input)
}