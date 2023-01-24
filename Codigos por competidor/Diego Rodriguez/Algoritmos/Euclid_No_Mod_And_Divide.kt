import java.util.*

object Euclid_No_Mod_And_Divide {
    fun gcd(a: Int, b: Int): Int {
        if (b == 0 || a == b) {
            return a
        }
        if (a == 0) {
            return b
        }
        if (a and 1 == 0 && b and 1 == 0) {
            return gcd(a shr 1, b shr 1) shl 1
        }
        if (a and 1 == 0 && b and 1 != 0) {
            return gcd(a shr 1, b)
        }
        if (a and 1 != 0 && b and 1 == 0) {
            return gcd(a, b shr 1)
        }
        return if (a > b) gcd(a - b, b) else gcd(a, b - a)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        println(gcd(a, b))
    }
}