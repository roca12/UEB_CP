import kotlin.jvm.JvmStatic
import java.util.ArrayList

object PrimeFactorization {
    var MAX = 1000000
    var SQRT = 1000
    var primes = ArrayList<Int>()
    var marked = BooleanArray(MAX + 1)
    var factors = ArrayList<Int>()
    fun primeFactors(n: Int) {
        var n = n
        factors.clear()
        var i = 0
        var p = primes[i]
        while (p * p <= n) {
            while (n % p == 0) {
                factors.add(p)
                n /= p
            }
            p = primes[++i]
        }
        if (n > 1) {
            factors.add(n)
        }
    }

    fun sieve() {
        marked[1] = true
        var i = 2
        while (i <= SQRT) {
            if (!marked[i]) {
                primes.add(i)
                var j = i * i
                while (j <= MAX) {
                    marked[j] = true
                    j += i
                }
            }
            ++i
        }
        while (i <= MAX) {
            if (!marked[i]) {
                primes.add(i)
            }
            ++i
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        sieve()
        primeFactors(100)
        for (i in factors) {
            print("$i ")
        }
        println("")
    }
}