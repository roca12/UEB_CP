import kotlin.jvm.JvmStatic

// in a rectangle of size m x n 
object NumberSquaresRectangle {
    // Returns count of all squares  
    // in a rectangle of size m x n 
    fun countSquares(
        m: Int,
        n: Int
    ): Int {
        // If n is smaller, swap m and n 
        var m = m
        var n = n
        if (n < m) {
            // swap(m, n) 
            val temp = m
            m = n
            n = temp
        }
        // Now n is greater dimension,  
        // apply formula 
        return m * (m + 1) * (2 * m + 1)/ 6 + (n - m) * m * (m + 1) / 2
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val m = 4
        val n = 3
        println(
            "Count of squares is "
                    + countSquares(m, n)
        )
    }
}