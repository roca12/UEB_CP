import kotlin.jvm.JvmStatic
import java.util.ArrayList

object Sieve_Of_Eratosthenes_Optimized {
    const val MAX_SIZE = 1000001
    var DefisPrime = ArrayList<Boolean>(MAX_SIZE)
    var prime = ArrayList<Int>()
    var SPF = ArrayList<Int>(MAX_SIZE)
    fun manipuledSieve(N: Int) {
        DefisPrime[0] = false
        DefisPrime[1] = false
        for (i in 2 until N) {
            if (DefisPrime[i]) {
                prime.add(i)
                SPF[i] = i
            }
            var j = 0
            while (j < prime.size && i * prime[j] < N && prime[j] <= SPF[i]) {
                DefisPrime[i * prime[j]] = false
                SPF[i * prime[j]] = prime[j]
                j++
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val N = 29
        for (i in 0 until MAX_SIZE) {
            DefisPrime.add(true)
            SPF.add(2)
        }
        manipuledSieve(N + 1)
        println("Numeros primos desde 2 hasta $N:")
        for (i in prime.indices) {
            print(prime[i].toString() + " ")
        }
        println("")
        println("Factores primos de cada numero:")
        for (i in 2..N) {
            println(i.toString() + ":" + SPF[i])
        }
    }
}