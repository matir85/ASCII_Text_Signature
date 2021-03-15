fun main() {
    // write your code here    
    val N = readLine().toString()
    var N1 = 0
    var N2 = 0
    for (i in 0..N.length / 2 - 1) {
        N1 += N[i].toString().toInt()
    }
    for (i in 0 until N.length / 2){
        N2 += N.reversed()[i].toString().toInt()
    }

    if (N1 == N2) println("YES")
    else println("NO")
}