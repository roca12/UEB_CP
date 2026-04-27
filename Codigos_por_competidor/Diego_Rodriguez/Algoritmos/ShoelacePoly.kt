package ready

import kotlin.jvm.JvmStatic

// Java program to evaluate area  
// of a polygon using shoelace formula 
object ShoelacePoly {
    // (X[i], Y[i]) are coordinates of i'th point. 
    fun polygonArea(
        X: DoubleArray, Y: DoubleArray,
        n: Int
    ): Double {
        // Initialze area 
        var area = 0.0

        // Calculate value of shoelace formula 
        var j = n - 1
        for (i in 0 until n) {
            area += (X[j] + X[i]) * (Y[j] - Y[i])

            // j is previous vertex to i 
            j = i
        }

        // Return absolute value 
        return Math.abs(area / 2.0)
    }

    // Driver program  
    @JvmStatic
    fun main(args: Array<String>) {
        val X = doubleArrayOf(0.0, 2.0, 4.0)
        val Y = doubleArrayOf(1.0, 3.0, 7.0)
        val n = 3
        println(polygonArea(X, Y, n))
    }
}