import kotlin.jvm.JvmStatic

//dado es o no un número primo. 
object MillerRabin {
    fun isPrime(p: Long): Boolean {
        if (p < 2 || p != 2L && p % 2 == 0L) {
            return false
        }
        var s = p - 1
        while (s % 2 == 0L) {
            s /= 2
        }
        for (i in 0..4) {
            val a = (Math.random() * p).toLong() % (p - 1) + 1
            var temp = s
            var mod = modpow(a, temp, p)
            while (temp != p - 1 && mod != 1L && mod != p - 1) {
                mod = modmul(mod, mod, p)
                temp *= 2
            }
            if (mod != p - 1 && temp % 2 == 0L) {
                return false
            }
        }
        return true
    }

    fun modpow(a: Long, b: Long, mod: Long): Long {
        if (b == 0L) {
            return 1
        }
        return if (b % 2 == 0L) {
            val temp = modpow(a, b / 2, mod)
            temp * temp % mod
        } else {
            val temp = modpow(a, b - 1, mod)
            temp * a % mod
        }
    }

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
        for (i in 0..99) {
            println(i.toString() + " " + isPrime(i.toLong()))
        }
    }
}