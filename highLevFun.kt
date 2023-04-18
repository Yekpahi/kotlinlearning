fun main () {
    //highlevel(::myname, 50)
   val funName = highlevel()
   funName("Prince")
}

fun myname(name : String){
    println("My name is $name")
}

/*fun highlevel(funname : (name : String) -> Unit, age : Int) {
    println("In high ")

    println("Call high level")
    funname("prince")
    println("my age is $age ans")
}*/

fun highlevel(): (name : String) -> Unit {

    return ::myname
}


