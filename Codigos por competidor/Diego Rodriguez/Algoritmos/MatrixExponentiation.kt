import kotlin.jvm.JvmStatic

// f(n) is defined as 
// F(n) = F(n-1) + F(n-2) + F(n-3), n >= 3 
// Base Cases : 
// F(0) = 0, F(1) = 1, F(2) = 1 
object MatrixExponentiation {
    // A utility function to multiply two 
    // matrices a[][] and b[][]. 
    // Multiplication result is 
    // stored back in b[][] 
    fun multiply(a: Array<IntArray>, b: Array<IntArray>) {
        // Creating an auxiliary matrix to 
        // store elements of the 
        // multiplication matrix 
        val mul = Array(3) { IntArray(3) }
        for (i in 0..2) {
            for (j in 0..2) {
                mul[i][j] = 0
                for (k in 0..2) {
                    mul[i][j] += (a[i][k]
                            * b[k][j])
                }
            }
        }

        // storing the multiplication 
        // result in a[][] 
        for (i in 0..2) {
            for (j in 0..2)  // Updating our matrix 
            {
                a[i][j] = mul[i][j]
            }
        }
    }

    // Function to compute F raise to 
    // power n-2. 
    fun power(F: Array<IntArray>, n: Int): Int {
        val M = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 0), intArrayOf(0, 1, 0))
        // Multiply it with initial values 
        // i.e with F(0) = 0, F(1) = 1, 
        // F(2) = 1 
        if (n == 1) {
            return F[0][0] + F[0][1]
        }
        power(F, n / 2)
        multiply(F, F)
        if (n % 2 != 0) {
            multiply(F, M)
        }
        // Multiply it with initial values 
        // i.e with F(0) = 0, F(1) = 1, 
        // F(2) = 1 
        return F[0][0] + F[0][1]
    }

    // Return n'th term of a series defined 
    // using below recurrence relation. 
    // f(n) is defined as 
    // f(n) = f(n-1) + f(n-2) + f(n-3), n>=3 
    // Base Cases : 
    // f(0) = 0, f(1) = 1, f(2) = 1 
    fun findNthTerm(n: Int): Int {
        val F = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 0), intArrayOf(0, 1, 0))
        return power(F, n - 2)
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        val n = 5
        println("F(5) is " + findNthTerm(n))
    }
}