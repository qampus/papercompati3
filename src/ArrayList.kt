fun main(args: Array<String>) {
    //array list

    var myArrayList = ArrayList<String>()
    myArrayList.add("Hasan")
    myArrayList.add("Sansob")
    myArrayList.add("Ann")
    //myArrayList.set(1, "Salmon")

    if(myArrayList.contains("Ann")){
        println("She's beautifull")
        myArrayList.remove("Sansob")
    }

    //iterating object
    for(names in myArrayList){
        println("Names: $names")
    }

    for (index in 0..myArrayList.size - 1){
        //println("Name: ${myArrayList.get(index)}")
    }

    //println("Array ${myArrayList.get(1)}")
}