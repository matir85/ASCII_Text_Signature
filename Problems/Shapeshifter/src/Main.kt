// Initialization of inputArray. Do not declare this array!

    val newArray = arrayOf(
        arrayOf(inputArray.last().joinToString()),
        arrayOf(inputArray.first().joinToString())
    )
    println(newArray.contentDeepToString())