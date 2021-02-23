import java.util.*

fun main() {
    // put your code here

    var a : Int
    val b : Int
    var resault = 1L
    val scanner = Scanner(System.`in`)
    a = scanner.nextInt()
    b = scanner.nextInt()

    while (a<b){
        resault *= a
        a++
    }
    println("$resault")

}


