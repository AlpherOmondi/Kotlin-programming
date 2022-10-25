class Person(var name:String){
    fun display(){
        println("My name is $name")
    }
    //Lambda accepts another function
    fun displayWithLambda(func: (s:String) -> Unit){
        func(name)
    }
}
