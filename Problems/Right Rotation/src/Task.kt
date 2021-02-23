import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val size = scanner.nextInt()
    val tab = IntArray(size)
    for (i in 0..tab.lastIndex) {
        val n = scanner.nextInt()
        tab[i] = n
    }
    var step = scanner.nextInt()
    if (step > size) step = step % size
    val newTab = IntArray(size)
    for (i in 0..tab.lastIndex) {
        if (i + step > size - 1) {
            newTab[ i + step - size] = tab[i]
        } else newTab[i + step] = tab[i]
    }
    for (i in 0..newTab.lastIndex) {
        print("${newTab[i]} ")
    }
}