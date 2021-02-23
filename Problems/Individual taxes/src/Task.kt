import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val company = scanner.nextInt()

    val incomeCompany = IntArray(company)
    for (i in 0..incomeCompany.lastIndex) {
        val income = scanner.nextInt()
        incomeCompany[i] = income
    }

    val taxRate = IntArray(company)
    for (i in 0..taxRate.lastIndex) {
        val tax = scanner.nextInt()
        taxRate[i] = tax
    }

    val taxToPay = DoubleArray(company)
    for (i in 0..taxToPay.lastIndex) {
        taxToPay[i] = (incomeCompany[i] / 100.0 * taxRate[i]).toDouble()
    }

    var whoMost = 0
    var tax = 0
    for (i in 0..taxToPay.lastIndex) {
        if (taxToPay[i] > tax) {
            whoMost = i
            tax = taxToPay[i].toInt()
        }
    }
    println(whoMost + 1)
}
