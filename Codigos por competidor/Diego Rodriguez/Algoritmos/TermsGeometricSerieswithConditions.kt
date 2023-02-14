import kotlin.jvm.JvmStatic
import java.util.HashMap

object TermsGeometricSerieswithConditions {
    // A map to keep track of the bad integers 
    var map = HashMap<Int, Boolean>()

    // Function to calculate No. of elements 
    // in our series 
    fun progression(
        b1: Int, q: Int, l: Int,
        m: Int, bad: IntArray
    ) {

        // Updating value of our map 
        var b1 = b1
        for (i in 0 until m) {
            map[bad[i]] = true
        }

        // if starting value is greate 
        // r than our given limit 
        if (Math.abs(b1) > l) {
            print("0")
        } // if q or starting value is 0 
        else if (q == 0 || b1 == 0) {

            // if 0 is not a bad integer, 
            // answer becomes inf 
            if (!map.containsKey(0)) {
                print("inf")
            } // if q is 0 and b1 is not and b1 
            else if (map[0] == true && !map.containsKey(b1)) {
                print("1")
            } // else if 0 is bad integer and 
            else {
                print("0")
            }
        } // if q is 1 
        else if (q == 1) {

            // and b1 is not a bad integer, 
            // answer becomes inf 
            if (!map.containsKey(b1)) {
                print("inf")
            } // else answer is 0 
            else {
                print("0")
            }
        } // if q is -1 
        else if (q == -1) {

            // and either b1 or -b1 is not 
            // present answer becomes inf 
            if (!map.containsKey(b1) || !map.containsKey(-1 * b1)) {
                print("inf")
            } // else answer becomes 0 
            else {
                print("0")
            }
        } // if none of the above case is true, 
        else {
            var co = 0
            while (Math.abs(b1) <= l) {
                if (!map.containsKey(b1)) {
                    co++
                }
                b1 *= q
            }
            print(co)
        }
    }

    // Driver Code 
    @JvmStatic
    fun main(args: Array<String>) {
        // starting value of series, 
        // number to be multiplied, 
        // limit within which our series, 
        // No. of bad integers given 
        val b1 = 3
        val q = 2
        val l = 30
        val m = 4

        // Bad integers 
        val bad = intArrayOf(6, 14, 25, 48)
        progression(b1, q, l, m, bad)
    }
}