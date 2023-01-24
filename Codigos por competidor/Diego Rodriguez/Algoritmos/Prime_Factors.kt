import kotlin.jvm.JvmStatic

object Prime_Factors {
    fun primeFactor(n: Int) {
        var n = n
        var p: Long = 2
        while (p * p <= n) {
            while (n % p == 0L) {
                println(p)
                n /= p.toInt()
            }
            p++
        }
        if (n > 1) {
            println(n)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        primeFactor(20)
    }
}