import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val a: Double
    val b: Double
    val c: Double
    val r: Double
    val typ = scanner.next()

    when (typ) {
        "triangle" -> {
            a = scanner.nextDouble()
            b = scanner.nextDouble()
            c = scanner.nextDouble()
            val p = (a + b + c) / 2
            val triangle = sqrt(p * (p - a) * (p - b) * (p - c))
            println(triangle)
        }
        "rectangle" -> {
            a = scanner.nextDouble()
            b = scanner.nextDouble()
            println(a * b)
        }
        "circle" -> {
            r = scanner.nextDouble()
            val circle = 3.14 * r.pow(2.0)
            println(circle)
        }
    }
}