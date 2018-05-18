import java.io.FileWriter

fun main(args: Array<String>) {

    print("Enter the name: ")
    var message = readLine()!!.toString()

    if (message.equals("")) {
        println("Please enter a message")
    } else {
        writeToFileInput(message)
        println("Sukses")
    }


}

fun writeToFileInput(message: String) {

    try {
        var writer = FileWriter("messageInput.txt", true)
        writer.write(message + "\n")
        writer.close()
    } catch (ex: Exception) {
        println("Exception $ex")
    }


}