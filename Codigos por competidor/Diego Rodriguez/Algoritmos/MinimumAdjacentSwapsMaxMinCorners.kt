import kotlin.jvm.JvmStatic
import kotlin.Throws
import java.io.IOException

object MinimumAdjacentSwapsMaxMinCorners {
    // Function performing calculations 
    fun minimumSwaps(a: IntArray, n: Int) {
        var maxx = -1
        var minn = a[0]
        var l = 0
        var r = 0
        for (i in 0 until n) {

            // Index of leftmost largest element 
            if (a[i] > maxx) {
                maxx = a[i]
                l = i
            }

            // Index of rightmost smallest element 
            if (a[i] <= minn) {
                minn = a[i]
                r = i
            }
        }
        if (r < l) {
            println(l + (n - r - 2))
        } else {
            println(l + (n - r - 1))
        }
    }

    // Driver Code 
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val a = intArrayOf(5, 6, 1, 3)
        val n = a.size
        minimumSwaps(a, n)
    }
}