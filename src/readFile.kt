import java.io.FileReader

fun main(args: Array<String>) {
    readFile()
}

fun readFile() {
    var reader = FileReader("messageInput.txt")
    var readMessage: String? = null
    var char: Int?
    try {
        do {
            char = reader.read()
            print(char.toChar())
        } while (char != -1)
        //sampe akhir file

    } catch (ex: Exception) {
        println(ex.message)
    }
}