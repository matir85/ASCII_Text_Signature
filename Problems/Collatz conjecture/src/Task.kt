import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    var n = scanner.nextInt()
    while (n != 1) {
        print("$n ")
        if (n % 2 != 0) {
            n = n * 3 + 1
        } else n /= 2
    }
    print(n)
}