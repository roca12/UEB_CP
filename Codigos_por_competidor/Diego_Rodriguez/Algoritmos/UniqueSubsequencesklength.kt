import kotlin.jvm.JvmStatic
import java.util.Arrays

object UniqueSubsequencesklength {
    // Function which returns the numbe of
    // unique subsequences of length K
    fun solution(A: IntArray, N: Int, k: Int): Int {

        // Bases cases
        if (N < k || N < 1 || k < 1) {
            return 0
        }
        if (N == k) {
            return 1
        }

        // Prepare arrays for recursion
        val v1 = IntArray(N)
        val v2 = IntArray(N)
        val v3 = IntArray(N)

        // Initiate separately for k = 1
        // intiate the last element
        v2[N - 1] = 1
        v3[A[N - 1] - 1] = 1

        // Initiate all other elements of k = 1
        for (i in N - 2 downTo 0) {

            // Initialize the front element
            // to vector v2
            v2[i] = v2[i + 1]

            // If element v[a[i]-1] is 0
            // then increment it in vector v2
            if (v3[A[i] - 1] == 0) {
                v2[i]++
                v3[A[i] - 1] = 1
            }
        }

        // Iterate for all possible values of K
        for (j in 1 until k) {

            // Fill the vectors with 0
            Arrays.fill(v3, 0)

            // Fill(v1.begin(), v1.end(), 0)
            // the last must be 0 as from last
            // no unique subarray can be formed
            v1[N - 1] = 0

            // Iterate for all index from which 
            // unique subsequences can be formed
            for (i in N - 2 downTo 0) {

                // Add the number of subsequence 
                // formed from the next index
                v1[i] = v1[i + 1]

                // Start with combinations on the
                // next index
                v1[i] = v1[i] + v2[i + 1]

                // Remove the elements which have
                // already been counted
                v1[i] = v1[i] - v3[A[i] - 1]

                // Update the number used
                v3[A[i] - 1] = v2[i + 1]
            }
        }

        // Last answer is stored in v2
        return v2[0]
    }

    // Driver Code
    @JvmStatic
    fun main(args: Array<String>) {
        val a = intArrayOf(1, 2, 3, 4)
        val n = a.size
        val k = 3
        print(solution(a, n, k))
    }
}