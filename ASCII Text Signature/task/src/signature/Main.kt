import java.awt.List
import java.io.File
import java.util.*
import kotlin.collections.IndexedValue as IndexedValue1

fun main() {
    val scanner = Scanner(System.`in`)

    // Pobranie imienia i nazwiska
    print("Enter name and surname: ")
    var name = scanner.nextLine()

    // Pominięcie pustago znaku w przypadku wystąpienia na początku
    if (name.first() == ' ') name = name.substringAfter(' ')

    // Pominięcie pustago znaku w przypadku wystąpienia na początku
    val nameArr = name.toCharArray()

    // Pobranie statusu i zmiana na małe litery
    print("Enter person's status: ")
    var stat = scanner.nextLine().toLowerCase()

    // Pominięcie pustago znaku w przypadku wystąpienia na początku
    if (stat.first() == ' ') stat = stat.substringAfter(' ')
    // Pominięcie pustago znaku w przypadku wystąpienia na początku
    val statusArray = stat.toCharArray()

    var longerString = if (nameArr.size > statusArray.size)  nameArr.size
    else statusArray.size

    // Obliczanie wielkości obramowania
    val spaceName = spaceName(name, stat)
    val spaceStatus = spaceStatus(name, stat)
    val longText = borderLong(name, stat)

    // Panel wyświetlający
    println("8".repeat(longText))
    printName(nameArr, spaceName)
    status(statusArray, spaceStatus)
    println("8".repeat(longText))
}

// Znaki statusu
fun status(statusArray: CharArray, space: Int) {
    val letters = mapOf(
        ("a" to listOf("____", "|__|", "|  |")),
        ("b" to listOf("___ ", "|__]", "|__]")),
        ("c" to listOf("____", "|   ", "|___")),
        ("d" to listOf("___ ", "|  \\", "|__/")),
        ("e" to listOf("____", "|___", "|___")),
        ("f" to listOf("____", "|___", "|   ")),
        ("g" to listOf("____", "| __", "|__]")),
        ("h" to listOf("_  _", "|__|", "|  |")),
        ("i" to listOf("_", "|", "|")),
        ("j" to listOf(" _", " |", "_|")),
        ("k" to listOf("_  _", "|_/ ", "| \\_")),
        ("l" to listOf("_   ", "|   ", "|___")),
        ("m" to listOf("_  _", "|\\/|", "|  |")),
        ("n" to listOf("_  _", "|\\ |", "| \\|")),
        ("o" to listOf("____", "|  |", "|__|")),
        ("p" to listOf("___ ", "|__]", "|   ")),
        ("q" to listOf("____", "|  |", "|_\\|")),
        ("r" to listOf("____", "|__/", "|  \\")),
        ("s" to listOf("____", "[__ ", "___]")),
        ("t" to listOf("___", " | ", " | ")),
        ("u" to listOf("_  _", "|  |", "|__|")),
        ("v" to listOf("_  _", "|  |", " \\/ ")),
        ("w" to listOf("_ _ _", "| | |", "|_|_|")),
        ("x" to listOf("_  _", " \\/ ", "_/\\_")),
        ("y" to listOf("_   _", " \\_/ ", "  |  ")),
        ("z" to listOf("___ ", "  / ", " /__")),
        (" " to listOf("    ", "    ", "    "))
    )

    val newStatus: Array<String> = arrayOf("", "", "")
    for (i in 0..2) {
        for (j in statusArray) {
            newStatus[i] += "${letters["$j"]?.get(i)} "
        }
    }
    println("88  " + " ".repeat(space) + newStatus[0] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newStatus[1] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newStatus[2] + " ".repeat(space) + " 88")

}

fun printName(nameArr: CharArray, space: Int) {
    // wczytanie pliku z czcionką
    val newLetter =
        "F:\\Programowanie\\NaukaKotlin\\ASCII Text Signature\\ASCII Text Signature\\task\\src\\signature\\roman.txt"
    val newFont = File(newLetter).readLines()

    // tabela z nowymi literami do podmiany
    var newName: Array<String> = arrayOf("", "", "", "", "", "", "", "", "", "")

    // uzupełnienie wymaganej przerwy w przypadku wystąpienie pustego space
    for (i in nameArr) {
        if (i == ' ') {
            repeat(10) {
                for (j in 0..9) {
                    newName[j] += " "
                }
            }
        } else {
            newFont.forEach { line ->
                if (line.first().equals(i) && line[1].equals(' ')) {
                    var index = newFont.indexOf(line)
                    for (j in 0..9) {
                        newName[j] += "${newFont[++index]}"
                    }

                }
            }
        }
    }
    println("88  " + " ".repeat(space) + newName[0] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newName[1] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newName[2] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newName[3] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newName[4] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newName[5] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newName[6] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newName[7] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newName[8] + " ".repeat(space) + " 88")
    println("88  " + " ".repeat(space) + newName[9] + " ".repeat(space) + " 88")
}

// Obliczanie długości obramowania górengo i dolnego
fun borderLong(name: String, status: String): Int {
    val nameLong = name.length * 11 + 10
    val statusLong = status.length * 5 + 6
    if (nameLong > statusLong) return nameLong
    else return statusLong
}

// Obliczanie ilości pustych znaków od obramowania do poczatku litery
fun spaceName(name: String, status: String): Int {
    val nameLong = name.length * 11 + 10
    val statusLong = status.length * 5 + 6
    if (nameLong >= statusLong) return 0
    else return (statusLong - nameLong) / 2 - 2
}
fun spaceStatus(name: String, status: String): Int {
    val nameLong = name.length * 11 + 10
    val statusLong = status.length * 5 + 6
    if (nameLong >= statusLong) return (nameLong - statusLong)  / 2
    else return 0
}