import java.util.*
import kotlin.contracts.contract

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    var n = scanner.nextInt()
    var i = 1
    while (n > 0){
       repeat(i){
           print("$i ")
           n--
           if (n == 0) return
       }
        i++
    }
}