var count: Long = 1

val lambda: (Long, Long) -> Long = { l1, l2 ->
    for (i in l1..l2) {
        count *= i
    }
    count
}