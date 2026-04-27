// compute modular power
object BinaryExp {
    /* Iterative Function to calculate 
       (x^y)%p in O(log y) */
    fun power(x: Int, y: Int, p: Int): Int {
        // Initialize result 
        var x = x
        var y = y
        var res = 1
        // Update x if it is more   
        // than or equal to p 
        x = x % p
        if (x == 0) {
            return 0 // In case x is divisible by p;    
        }
        while (y > 0) {
            // If y is odd, multiply x 
            // with result 
            if (y and 1 == 1) {
                res = res * x % p
            }
            // y must be even now 
            // y = y / 2 
            y = y shr 1
            x = x * x % p
        }
        return res
    }

    // Driver Program to test above functions 
    @JvmStatic
    fun main(args: Array<String>) {
        val x = 2
        val y = 5
        val p = 13
        println(power(x, y, p))
    }
}