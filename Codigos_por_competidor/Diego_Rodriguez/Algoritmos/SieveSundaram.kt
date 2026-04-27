import kotlin.jvm.JvmStatic
import java.util.Arrays

object SieveSundaram {
    // Prints all prime numbers smaller 
    fun SieveOfSundaram(n: Int): Int {

        // In general Sieve of Sundaram, produces  
        // primes smaller than (2*x + 2) for a number 
        // given number x. Since we want primes  
        // smaller than n, we reduce n to half 
        val nNew = (n - 1) / 2

        // This array is used to separate numbers of the  
        // form i+j+2ij from others where 1 <= i <= j 
        val marked = BooleanArray(nNew + 1)

        // Initialize all elements as not marked 
        Arrays.fill(marked, false)

        // Main logic of Sundaram. Mark all numbers of the 
        // form i + j + 2ij as true where 1 <= i <= j 
        for (i in 1..nNew) {
            var j = i
            while (i + j + 2 * i * j <= nNew) {
                marked[i + j + 2 * i * j] = true
                j++
            }
        }

        // Since 2 is a prime number 
        if (n > 2) {
            print(2.toString() + " ")
        }

        // Print other primes. Remaining primes are of  
        // the form 2*i + 1 such that marked[i] is false. 
        for (i in 1..nNew) {
            if (marked[i] == false) {
                print((2 * i + 1).toString() + " ")
            }
        }
        return -1
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        val n = 20
        SieveOfSundaram(n)
    }
}