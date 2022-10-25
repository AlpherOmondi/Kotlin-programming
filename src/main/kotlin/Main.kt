fun main(args: Array<String>) {
    println("Hello World!")

    val kevin = Person("")
    kevin.name = "Alpha"
    println("Name is ${kevin.name}")
    kevin.display()
    kevin.displayWithLambda(::printname)
}

fun printname(name:String){
    println(name)
}