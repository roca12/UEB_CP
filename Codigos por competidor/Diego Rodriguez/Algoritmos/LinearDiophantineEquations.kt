// diophantine equations
object LinearDiophantineEquations {
    // Utility function to find the GCD 
    // of two numbers 
    fun gcd(a: Int, b: Int): Int {
        return if (a % b == 0) Math.abs(b) else gcd(b, a % b)
    }

    // This function checks if integral 
    // solutions are possible 
    fun isPossible(
        a: Int,
        b: Int, c: Int
    ): Boolean {
        return c % gcd(a, b) == 0
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var a = 3
        var b = 6
        var c = 9
        if (isPossible(a, b, c)) {
            println("Possible")
        } else {
            println("Not Possible")
        }
        a = 3
        b = 6
        c = 8
        if (isPossible(a, b, c)) {
            println("Possible")
        } else {
            println("Not Possible")
        }
        a = 2
        b = 5
        c = 1
        if (isPossible(a, b, c)) {
            println("Possible")
        } else {
            println("Not Possible")
        }
    }
}