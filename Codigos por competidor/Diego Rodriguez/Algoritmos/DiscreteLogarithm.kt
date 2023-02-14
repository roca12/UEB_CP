object DiscreteLogarithm {
    /* Iterative Function to calculate (x ^ y)%p in 
        O(log y) */
    fun powmod(x: Int, y: Int, p: Int): Int {
        var x = x
        var y = y
        var res = 1 // Initialize result 
        x = x % p // Update x if it is more than or 
        // equal to p 
        while (y > 0) {
            // If y is odd, multiply x with result 
            if (y and 1 > 0) {
                res = res * x % p
            }

            // y must be even now 
            y = y shr 1 // y = y/2 
            x = x * x % p
        }
        return res
    }

    // Function to calculate k for given a, b, m 
    fun discreteLogarithm(a: Int, b: Int, m: Int): Int {
        val n = (Math.sqrt(m.toDouble()) + 1).toInt()
        val value = IntArray(m)

        // Store all values of a^(n*i) of LHS 
        for (i in n downTo 1) {
            value[powmod(a, i * n, m)] = i
        }
        for (j in 0 until n) {
            // Calculate (a ^ j) * b and check 
            // for collision 
            val cur = powmod(a, j, m) * b % m

            // If collision occurs i.e., LHS = RHS 
            if (value[cur] > 0) {
                val ans = value[cur] * n - j
                // Check whether ans lies below m or not 
                if (ans < m) {
                    return ans
                }
            }
        }
        return -1
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        var a = 2
        var b = 3
        var m = 5
        println(discreteLogarithm(a, b, m))
        a = 3
        b = 7
        m = 11
        println(discreteLogarithm(a, b, m))
    }
}