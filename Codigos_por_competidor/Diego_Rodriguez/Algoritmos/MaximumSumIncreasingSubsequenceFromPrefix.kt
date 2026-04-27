import kotlin.jvm.JvmStatic

// subsequence tiint i-th index and including 
// k-th index. 
object MaximumSumIncreasingSubsequenceFromPrefix {
    fun pre_compute(
        a: IntArray, n: Int,
        index: Int, k: Int
    ): Int {
        val dp = Array(n) { IntArray(n) }

        // Initializing the first row of 
        // the dp[][]. 
        for (i in 0 until n) {
            if (a[i] > a[0]) {
                dp[0][i] = a[i] + a[0]
            } else {
                dp[0][i] = a[i]
            }
        }

        // Creating the dp[][] matrix. 
        for (i in 1 until n) {
            for (j in 0 until n) {
                if (a[j] > a[i] && j > i) {
                    if (dp[i - 1][i] + a[j]
                        > dp[i - 1][j]
                    ) {
                        dp[i][j] = (dp[i - 1][i]
                                + a[j])
                    } else {
                        dp[i][j] = dp[i - 1][j]
                    }
                } else {
                    dp[i][j] = dp[i - 1][j]
                }
            }
        }

        // To calculate for i=4 and k=6. 
        return dp[index][k]
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        val a = intArrayOf(1, 101, 2, 3, 100, 4, 5)
        val n = a.size
        val index = 4
        val k = 6
        println(
            pre_compute(a, n, index, k)
        )
    }
}