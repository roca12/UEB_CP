import kotlin.jvm.JvmStatic

// in O(1) time with O(n*n) extra space 
// and O(n*n) preprocessing time. 
object SpaseTableSquareRootDecomposition {
    var MAX = 500

    // lookup[i][j] is going to store index of 
    // minimum value in arr[i..j] 
    var lookup = Array(MAX) { IntArray(MAX) }

    // Fills lookup array lookup[n][n] for 
    // all possible values of query ranges 
    fun preprocess(arr: IntArray, n: Int) {
        // Initialize lookup[][] for 
        // the intervals with length 1 
        for (i in 0 until n) {
            lookup[i][i] = i
        }

        // Fill rest of the entries in bottom up manner 
        for (i in 0 until n) {
            for (j in i + 1 until n)  // To find minimum of [0,4], 
            // we compare minimum of 
            // arr[lookup[0][3]] with arr[4]. 
            {
                if (arr[lookup[i][j - 1]] < arr[j]) {
                    lookup[i][j] = lookup[i][j - 1]
                } else {
                    lookup[i][j] = j
                }
            }
        }
    }

    // Prints minimum of given m query 
    // ranges in arr[0..n-1] 
    fun RMQ(
        arr: IntArray, n: Int,
        q: Array<Query>, m: Int
    ) {
        // Fill lookup table for 
        // all possible input queries 
        preprocess(arr, n)

        // One by one compute sum of all queries 
        for (i in 0 until m) {
            // Left and right boundaries 
            // of current range 
            val L = q[i].L
            val R = q[i].R

            // Print sum of current query range 
            println(
                "Minimum of [" + L
                        + ", " + R + "] is "
                        + arr[lookup[L][R]]
            )
        }
    }

    // Driver Code 
    @JvmStatic
    fun main(args: Array<String>) {
        val a = intArrayOf(7, 2, 3, 0, 5, 10, 3, 12, 18)
        val n = a.size
        val q = arrayOf(
            Query(0, 4),
            Query(4, 7),
            Query(7, 8)
        )
        val m = q.size
        RMQ(a, n, q, m)
    }

    // Structure to represent a query range 
    class Query(var L: Int, var R: Int)
}