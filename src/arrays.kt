fun main(args: Array<String>) {
    //size 5 slot, each have 2
    var myArray = Array<Int>(5) { 2 }
    myArray[0] = 10
    myArray[1] = 11
    myArray[2] = 12
    myArray[3] = 13
    myArray[4] = 14

    //printing using objects
    for (element in myArray) {
        println("Index is $element")
    }
}