import kotlin.jvm.JvmStatic

// ways to change the XOR of two 
// numbers by swapping the bits 
object WaysToXORTwoNumbers {
    // Function that returns the 
    // number of bit swaps such 
    // that xor is different 
    fun countWays(
        s1: String,
        s2: String
    ): Int {
        var c1 = 0
        var c0 = 0
        val n = s1.length

        // traverse and count 1's and 0's 
        for (i in 0 until n) {
            if (s1[i] == '1') {
                c1++
            } else {
                c0++
            }
        }
        var used1 = 0
        var used0 = 0
        var ways = 0

        // traverse in the String 
        for (i in 0 until n) {

            // if both positions are 0 
            if (s1[i] == '0'
                && s2[i] == '0'
            ) {

                // add the number of ones as 
                // it will change the XOR 
                ways += c1

                // subtract the number of 
                // ones already used 
                ways -= used1

                // zeros have been used 
                used0++
            } // when 1 and 0, to change XOR, 
            else if (s1[i] == '1'
                && s2[i] == '0'
            ) {

                // add number of 0's 
                ways += c0

                // subtract number of 
                // 0's already used 
                ways -= used0

                // count 1's used 
                used1++
            }
        }

        // return the answer 
        return ways
    }

    // Driver Code 
    @JvmStatic
    fun main(args: Array<String>) {
        val s1 = "01011"
        val s2 = "11001"
        println(countWays(s1, s2))
    }
}