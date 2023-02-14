import kotlin.jvm.JvmStatic

object ModMultiplication {
    fun modmul(a: Long, b: Long, mod: Long): Long {
        var b = b
        var x: Long = 0
        var y = a % mod
        while (b > 0) {
            if (b % 2 == 1L) {
                x = (x + y) % mod
            }
            y = (y shl 1) % mod
            b = b shr 1
        }
        return x % mod
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(modmul(2, 2, 2))
    }
}