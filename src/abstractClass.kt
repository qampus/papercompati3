// abstract class = class yang tidak di inisiasi


abstract class GraphicObject{

    fun moveTo(newX: Int, newY: Int){
        println("Move to new x and new y")
    }

    abstract fun draw()
    abstract  fun resize()
}

class Circle: GraphicObject(){
    override fun draw() {
        println("Drawing circle")
    }

    override fun resize() {
        println("Resizing Circle")
    }

}
fun main(args: Array<String>) {
    var circle = Circle()
    circle.draw()
    circle.moveTo(1,5)

}