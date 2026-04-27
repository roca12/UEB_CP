import kotlin.jvm.JvmStatic

// searching 
object Zalgorithm {
    // prints all occurrences of pattern in text using 
    // Z algo 
    fun search(text: String, pattern: String) {

        // Create concatenated string "P$T" 
        val concat = "$pattern$$text"
        val l = concat.length
        val Z = IntArray(l)

        // Construct Z array 
        getZarr(concat, Z)

        // now looping through Z array for matching condition 
        for (i in 0 until l) {

            // if Z[i] (matched region) is equal to pattern 
            // length we got the pattern 
            if (Z[i] == pattern.length) {
                println(
                    "Pattern found at index "
                            + (i - pattern.length - 1)
                )
            }
        }
    }

    // Fills Z array for given string str[] 
    private fun getZarr(str: String, Z: IntArray) {
        val n = str.length

        // [L,R] make a window which matches with 
        // prefix of s 
        var L = 0
        var R = 0
        for (i in 1 until n) {

            // if i>R nothing matches so we will calculate. 
            // Z[i] using naive way. 
            if (i > R) {
                R = i
                L = R

                // R-L = 0 in starting, so it will start 
                // checking from 0'th index. For example, 
                // for "ababab" and i = 1, the value of R 
                // remains 0 and Z[i] becomes 0. For string 
                // "aaaaaa" and i = 1, Z[i] and R become 5 
                while (R < n && str[R - L] == str[R]) {
                    R++
                }
                Z[i] = R - L
                R--
            } else {

                // k = i-L so k corresponds to number which 
                // matches in [L,R] interval. 
                val k = i - L

                // if Z[k] is less than remaining interval 
                // then Z[i] will be equal to Z[k]. 
                // For example, str = "ababab", i = 3, R = 5 
                // and L = 2 
                if (Z[k] < R - i + 1) {
                    Z[i] = Z[k]
                } // For example str = "aaaaaa" and i = 2, R is 5, 
                else {

                    // else start from R and check manually 
                    L = i
                    while (R < n && str[R - L] == str[R]) {
                        R++
                    }
                    Z[i] = R - L
                    R--
                }
            }
        }
    }

    // Driver program 
    @JvmStatic
    fun main(args: Array<String>) {
        val text = "GEEKS FOR GEEKS"
        val pattern = "GEEK"
        search(text, pattern)
    }
}