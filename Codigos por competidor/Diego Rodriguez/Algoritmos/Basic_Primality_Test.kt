//demasiado lento con una cantidad de consultas considerable
object Primality_Test {
    fun isPrime(x: Int): Boolean {
        if (x < 2) {
            return false
        }
        if (x == 2) {
            return true
        }
        if (x % 2 == 0) {
            return false
        }
        var i = 3
        while (i * i <= x) {
            if (x % i == 0) {
                return false
            }
            i++
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 14
        if (isPrime(n)) {
            println("Es primo")
        } else {
            println("No es primo")
        }
    }
}