import kotlin.jvm.JvmStatic

object Number_Of_Divisors {
    fun divisors(x: Int): Int {
        var x = x
        var nDiv = 1
        var i = 2
        while (i * i <= x) {
            var cnt = 0
            while (x % i == 0) {
                ++cnt
                x /= i
            }
            nDiv *= cnt + 1
            i++
        }
        if (x > 1) {
            nDiv *= 2
        }
        return nDiv
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(divisors(10000))
    }
}