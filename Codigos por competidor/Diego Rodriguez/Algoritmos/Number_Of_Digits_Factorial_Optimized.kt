import kotlin.jvm.JvmStatic

object Number_Of_Digits_Factorial_Optimized {
    var M_E = 2.71828182845904523536
    var M_PI = 3.141592654
    fun findDigits(n: Int): Long {
        if (n < 0) {
            return 0
        }
        if (n <= 1) {
            return 1
        }
        val x = n * Math.log10(n / M_E) + Math.log10(2 * M_PI * n) / 2.0
        return Math.floor(x).toLong() + 1
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(findDigits(1))
        println(findDigits(50000000))
        println(findDigits(1000000000))
        println(findDigits(120))
    }
}