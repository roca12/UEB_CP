// with given constraints
object DPLongestPath {
    var n = 3

    // Function that returns length of the longest path 
    // beginning with mat[i][j] 
    // This function mainly uses lookup table dp[n][n] 
    fun findLongestFromACell(i: Int, j: Int, mat: Array<IntArray>, dp: Array<IntArray>): Int {
        // Base case 
        if (i < 0 || i >= n || j < 0 || j >= n) return 0

        // If this subproblem is already solved 
        if (dp[i][j] != -1) return dp[i][j]

        // To store the path lengths in all the four directions 
        var x = Int.MIN_VALUE
        var y = Int.MIN_VALUE
        var z = Int.MIN_VALUE
        var w = Int.MIN_VALUE
        // Since all numbers are unique and in range from 1 to n*n, 
        // there is atmost one possible direction from any cell 
        if (j < n - 1 && mat[i][j] + 1 == mat[i][j + 1]) {
            dp[i][j] = 1 + findLongestFromACell(i, j + 1, mat, dp)
            x = dp[i][j]
        }
        if (j > 0 && mat[i][j] + 1 == mat[i][j - 1]) {
            dp[i][j] = 1 + findLongestFromACell(i, j - 1, mat, dp)
            y = dp[i][j]
        }
        if (i > 0 && mat[i][j] + 1 == mat[i - 1][j]) {
            dp[i][j] = 1 + findLongestFromACell(i - 1, j, mat, dp)
            z = dp[i][j]
        }
        if (i < n - 1 && mat[i][j] + 1 == mat[i + 1][j]) {
            dp[i][j] = 1 + findLongestFromACell(i + 1, j, mat, dp)
            w = dp[i][j]
        }

        // If none of the adjacent fours is one greater we will take 1 
        // otherwise we will pick maximum from all the four directions 
        return Math.max(x, Math.max(y, Math.max(z, Math.max(w, 1)))).also { dp[i][j] = it }
    }

    // Function that returns length of the longest path 
    // beginning with any cell 
    fun finLongestOverAll(mat: Array<IntArray>): Int {
        // Initialize result 
        var result = 1

        // Create a lookup table and fill all entries in it as -1 
        val dp = Array(n) { IntArray(n) }
        for (i in 0 until n) for (j in 0 until n) dp[i][j] = -1

        // Compute longest path beginning from all cells 
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (dp[i][j] == -1) findLongestFromACell(i, j, mat, dp)

                // Update result if needed 
                result = Math.max(result, dp[i][j])
            }
        }
        return result
    }

    // driver program 
    @JvmStatic
    fun main(args: Array<String>) {
        val mat = arrayOf(intArrayOf(1, 2, 9), intArrayOf(5, 3, 8), intArrayOf(4, 6, 7))
        println("Length of the longest path is " + finLongestOverAll(mat))
    }
}