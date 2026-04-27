// working of Chinise remainder
// Theorem 
object ChineseRemainder {
    // Returns modulo inverse of a 
    // with respect to m using extended 
    // Euclid Algorithm. Refer below post for details: 
    // https://www.geeksforgeeks.org/multiplicative-inverse-under-modulo-m/ 
    fun inv(a: Int, m: Int): Int {
        var a = a
        var m = m
        val m0 = m
        var t: Int
        var q: Int
        var x0 = 0
        var x1 = 1
        if (m == 1) {
            return 0
        }
        // Apply extended Euclid Algorithm 
        while (a > 1) {
            // q is quotient 
            q = a / m
            t = m

            // m is remainder now, process 
            // same as euclid's algo 
            m = a % m
            a = t
            t = x0
            x0 = x1 - q * x0
            x1 = t
        }
        // Make x1 positive 
        if (x1 < 0) {
            x1 += m0
        }
        return x1
    }

    // k is size of num[] and rem[]. 
    // Returns the smallest number 
    // x such that: 
    // x % num[0] = rem[0], 
    // x % num[1] = rem[1], 
    // .................. 
    // x % num[k-2] = rem[k-1] 
    // Assumption: Numbers in num[] are pairwise 
    // coprime (gcd for every pair is 1) 
    fun findMinX(num: IntArray, rem: IntArray, k: Int): Int {
        // Compute product of all numbers 
        var prod = 1
        for (i in 0 until k) {
            prod *= num[i]
        }

        // Initialize result 
        var result = 0

        // Apply above formula 
        for (i in 0 until k) {
            val pp = prod / num[i]
            result += rem[i] * inv(pp, num[i]) * pp
        }
        return result % prod
    }

    // Driver method 
    @JvmStatic
    fun main(args: Array<String>) {
        val num = intArrayOf(3, 4, 5)
        val rem = intArrayOf(2, 3, 1)
        val k = num.size
        println("x is " + findMinX(num, rem, k))
    }
}