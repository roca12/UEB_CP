//ya que excede el tamaño de un long en Java
object Fibonacci_Last_Digit_Dinamic {
    fun fib(n: Long): Long {
        val F = arrayOf(longArrayOf(1, 1), longArrayOf(1, 0))
        if (n == 0L) {
            return 0
        }
        power(F, n - 1)
        return F[0][0]
    }

    fun multiply(F: Array<LongArray>, M: Array<LongArray>) {
        val x = (F[0][0] * M[0][0]
                + F[0][1] * M[1][0])
        val y = (F[0][0] * M[0][1]
                + F[0][1] * M[1][1])
        val z = (F[1][0] * M[0][0]
                + F[1][1] * M[1][0])
        val w = (F[1][0] * M[0][1]
                + F[1][1] * M[1][1])
        F[0][0] = x
        F[0][1] = y
        F[1][0] = z
        F[1][1] = w
    }

    fun power(F: Array<LongArray>, n: Long) {
        if (n == 0L || n == 1L) {
            return
        }
        val M = arrayOf(longArrayOf(1, 1), longArrayOf(1, 0))
        power(F, n / 2)
        multiply(F, F)
        if (n % 2 != 0L) {
            multiply(F, M)
        }
    }

    fun findLastDigit(n: Long): Long {
        return fib(n) % 10
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(fib(92).toString() + ":" + findLastDigit(92))
    }
}