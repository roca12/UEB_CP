import kotlin.jvm.JvmStatic

object Number_Of_Digits_Factorial {
    fun findDigits(n: Int): Int {
        if (n < 0) {
            return 0
        }
        if (n <= 1) {
            return 1
        }
        var digits = 0.0
        for (i in 2..n) {
            digits += Math.log10(i.toDouble())
        }
        return (Math.floor(digits) + 1).toInt()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(findDigits(100))
    }
}