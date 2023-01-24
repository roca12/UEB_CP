// Burst balloon problem
object BurstBalloonMaximizeCoins {
    fun getMax(A: IntArray, N: Int): Int {

        // Add Bordering Balloons 
        val B = IntArray(N + 2)
        B[N + 1] = 1
        B[0] = B[N + 1]
        for (i in 1..N) {
            B[i] = A[i - 1]
        }

        // Declaring DP array 
        val dp = Array(N + 2) { IntArray(N + 2) }
        for (length in 1 until N + 1) {
            for (left in 1 until N - length + 2) {
                val right = left + length - 1

                // For a sub-array from indices 
                // left, right. This innermost 
                // loop finds the last balloon burst 
                for (last in left until right + 1) {
                    dp[left][right] = Math.max(
                        dp[left][right],
                        dp[left][last - 1]
                                + (B[left - 1] * B[last]
                                * B[right + 1])
                                + dp[last + 1][right]
                    )
                }
            }
        }
        return dp[1][N]
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val A = intArrayOf(1, 2, 3, 4, 5)
        val N = A.size
        println(getMax(A, N))
    }
}