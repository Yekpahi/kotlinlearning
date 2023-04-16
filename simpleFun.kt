fun main() {
    println("the of number 10 is : ${getSquare(10)}")
    gettriple(5)
}

// Return fonction
fun getSquare(number : Int): Int {
    val square = number * number
    return square

}

fun gettriple(number : Int) {
    val triple = number * number * number
    
    println("the triple of $number is : ${triple}")

}
