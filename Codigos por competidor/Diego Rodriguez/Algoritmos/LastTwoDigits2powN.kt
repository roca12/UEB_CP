// 2 digits of 2^n
object LastTwoDigits2powN {
    /* Iterative Function to 
calculate (x^y)%p in O(log y) */
    fun power(
        x: Long, y: Long,
        p: Long
    ): Int {
        var x = x
        var y = y
        var res = 1 // Initialize result 
        x = x % p // Update x if it is more 
        // than or equal to p 
        while (y > 0) {

            // If y is odd, multiply 
            // x with result 
            val r = y and 1
            if (r == 1L) {
                res = res * x.toInt() % p.toInt()
            }

            // y must be even now 
            y = y shr 1 // y = y/2 
            x = x * x % p
        }
        return res
    }

    // Java function to calculate 
    // number of digits in x 
    fun numberOfDigits(x: Int): Int {
        var x = x
        var i = 0
        while (x != 0) {
            x /= 10
            i++
        }
        return i
    }

    // Java function to print 
    // last 2 digits of 2^n 
    fun LastTwoDigit(n: Int) {
        print(
            "Last " + 2
                    + " digits of " + 2 + "^"
        )
        print("$n = ")

// Generating 10^2 
        var temp = 1
        for (i in 1..2) {
            temp *= 10
        }

// Calling modular exponentiation 
        temp = power(2, n.toLong(), temp.toLong())

// Printing leftmost zeros. 
// Since (2^n)%2 can have digits 
// less then 2. In that case 
// we need to print zeros 
        for (i in 0 until 2 - numberOfDigits(temp)) {
            print(0.toString() + " ")
        }

// If temp is not zero then 
// print temp. If temp is zero 
// then already printed 
        if (temp != 0) {
            println(temp)
        }
    }

    // Driver Code 
    @JvmStatic
    fun main(args: Array<String>) {
        val n = 72
        LastTwoDigit(n)
    }
}