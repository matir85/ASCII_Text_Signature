fun main() {
    // write your code here
    val str = readLine()!!
    if (str.length % 2 == 0) {
        println("${str.substring(0, str.length / 2 - 1)}${str.substring(str.length / 2 + 1, str.lastIndex + 1)}")
    } else println("${str.substring(0, str.length / 2)}${str.substring(str.length / 2 + 1, str.lastIndex + 1)}")
}