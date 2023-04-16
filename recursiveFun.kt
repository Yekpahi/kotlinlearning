fun main() {
    println("Factorial of 5 is: ${factorial(5)}")
}

fun factorial(n: Int): Int {
    if (n == 1) return 1
    return n * factorial(n - 1)
}
