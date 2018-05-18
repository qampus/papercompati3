class Login<Types> (name: Types, password: Types){
    //types  = type data yg tdk tau slumnya
    init {
        println("Name: $name password: $password " )
    }
}


fun main(args: Array<String>) {
    var login = Login<String>("Hasan", "aku")
    var login2 = Login<Int>(12,13)


}