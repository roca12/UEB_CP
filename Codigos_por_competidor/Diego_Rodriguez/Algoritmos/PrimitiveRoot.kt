import kotlin.jvm.JvmStatic
import java.util.HashSet

object PrimitiveRoot {
    // Returns true if n is prime 
    fun isPrime(n: Int): Boolean {
        // Corner cases 
        if (n <= 1) {
            return false
        }
        if (n <= 3) {
            return true
        }

        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) {
            return false
        }
        var i = 5
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false
            }
            i = i + 6
        }
        return true
    }

    /* Iterative Function to calculate (x^n)%p in 
	O(logy) */
    fun power(x: Int, y: Int, p: Int): Int {
        var x = x
        var y = y
        var res = 1 // Initialize result 
        x = x % p // Update x if it is more than or 
        // equal to p 
        while (y > 0) {
            // If y is odd, multiply x with result 
            if (y % 2 == 1) {
                res = res * x % p
            }

            // y must be even now 
            y = y shr 1 // y = y/2 
            x = x * x % p
        }
        return res
    }

    // Utility function to store prime factors of a number 
    fun findPrimefactors(s: HashSet<Int>, n: Int) {
        // Print the number of 2s that divide n 
        var n = n
        while (n % 2 == 0) {
            s.add(2)
            n = n / 2
        }

        // n must be odd at this point. So we can skip 
        // one element (Note i = i +2) 
        var i = 3
        while (i <= Math.sqrt(n.toDouble())) {

            // While i divides n, print i and divide n 
            while (n % i == 0) {
                s.add(i)
                n = n / i
            }
            i = i + 2
        }

        // This condition is to handle the case when 
        // n is a prime number greater than 2 
        if (n > 2) {
            s.add(n)
        }
    }

    // Function to find smallest primitive root of n 
    fun findPrimitive(n: Int): Int {
        val s = HashSet<Int>()

        // Check if n is prime or not 
        if (isPrime(n) == false) {
            return -1
        }

        // Find value of Euler Totient function of n 
        // Since n is a prime number, the value of Euler 
        // Totient function is n-1 as there are n-1 
        // relatively prime numbers. 
        val phi = n - 1

        // Find prime factors of phi and store in a set 
        findPrimefactors(s, phi)

        // Check for every number from 2 to phi 
        for (r in 2..phi) {
            // Iterate through all prime factors of phi. 
            // and check if we found a power with value 1 
            var flag = false
            for (a in s) {

                // Check if r^((phi)/primefactors) mod n 
                // is 1 or not 
                if (power(r, phi / a, n) == 1) {
                    flag = true
                    break
                }
            }

            // If there was no power with value 1. 
            if (flag == false) {
                return r
            }
        }

        // If no primitive root found 
        return -1
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 761
        println(
            " Smallest primitive root of " + n
                    + " is " + findPrimitive(n)
        )
    }
}