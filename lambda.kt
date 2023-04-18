fun main() {
    //val lam = {println("Salut les amis")}
    //lam.invoke()

    //val area = {a : Int, b : Int  -> a*b }

    //println("L'aire de la surface est : ${area(10, 10)}")

    var presents = {name : String, age : Int -> 
        println("Je me nomme $name et j'ai $age ans ")
    
    }
    presents("Prince", 15)
}