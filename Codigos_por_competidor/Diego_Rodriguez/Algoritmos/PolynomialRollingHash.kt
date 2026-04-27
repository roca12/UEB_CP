import kotlin.jvm.JvmStatic

// Polynomial Rolling Hash Function
object PolynomialRollingHash {
    // Function to calculate
    // the hash of a String
    fun polynomialRollingHash(str: String): Long {

        // P and M
        val p = 31
        val m = (1e9 + 9).toInt()
        var power_of_p: Long = 1
        var hash_val: Long = 0

        // Loop to calculate the hash value
        // by iterating over the elements of String
        for (i in 0 until str.length) {
            hash_val = (hash_val + (str[i]
                    - 'a' + 1) * power_of_p) % m
            power_of_p = power_of_p * p % m
        }
        return hash_val
    }

    // Driver Code
    @JvmStatic
    fun main(args: Array<String>) {

        // Given Strings
        val str1 = "geeksforgeeks"
        val str2 = "geeks"
        print(
            "Hash of '" + str1 + "' = "
                    + polynomialRollingHash(str1)
        )
    }
}