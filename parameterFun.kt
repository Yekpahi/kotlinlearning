fun main() {
    println("The sum is : ${cal(10, 12, 100)}")
    sumvar(10, 12, 13)
    sumvar(10)
}

fun cal(n1 : Int, n2 : Int, n3 : Int = 10) : Int {
    val sum  = n1 + n2 + n3
    return sum
}

fun sumvar(vararg numbers : Int) {
    var sum = 0
    for (n in numbers) {
        sum += n
    }
    println("La sum est : $sum")
}