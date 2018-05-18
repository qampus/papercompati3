//interface classes  = classes that have method without bodies
//membuat implementasi sendiri
interface InputHandler {
    fun clicked()
    fun doubleClick()
    fun singleClick()
}

class Button : InputHandler {
    override fun doubleClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun singleClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clicked() {
        println("Button Clicked")
    }

}

class Phone : InputHandler {
    override fun doubleClick() {
        println("Double Click")
    }

    override fun singleClick() {
        println("Double Click")
    }

    override fun clicked() {
        println("Phone Clicked")
    }

}

fun main(args: Array<String>) {
    var myButton = Button()
    myButton.clicked()

    var phone = Phone()
    phone.clicked()
    phone.doubleClick()
}
