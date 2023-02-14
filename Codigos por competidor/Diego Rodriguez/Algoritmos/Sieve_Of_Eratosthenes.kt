import kotlin.jvm.JvmStatic
import java.util.Arrays

object Sieve_Of_Eratosthenes {
    fun sieveEratosthenes(N: Int): BooleanArray {
        val prime = BooleanArray(N + 1)
        Arrays.fill(prime, true)
        prime[1] = false
        prime[0] = prime[1]
        var p = 2
        while (p * p <= N) {
            if (prime[p]) {
                var i = p * p
                while (i <= N) {
                    prime[i] = false
                    i += p
                }
            }
            p++
        }
        return prime
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val res = sieveEratosthenes(1000)
        for (i in res.indices) {
            println(i.toString() + ": " + res[i])
        }
    }
}