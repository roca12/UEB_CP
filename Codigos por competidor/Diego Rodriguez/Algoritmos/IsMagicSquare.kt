internal object GFG {
    var N = 3

    // Returns true if mat[][] is magic 
    // square, else returns false. 
    fun isMagicSquare(mat: Array<IntArray>): Boolean {

        // calculate the sum of 
        // the prime diagonal 
        var sum = 0
        var sum2 = 0
        for (i in 0 until N) sum = sum + mat[i][i]

        // the secondary diagonal 
        for (i in 0 until N) sum2 = sum2 + mat[i][N - 1 - i]
        if (sum != sum2) return false

        // For sums of Rows 
        for (i in 0 until N) {
            var rowSum = 0
            for (j in 0 until N) rowSum += mat[i][j]

            // check if every row sum is 
            // equal to prime diagonal sum 
            if (rowSum != sum) return false
        }

        // For sums of Columns 
        for (i in 0 until N) {
            var colSum = 0
            for (j in 0 until N) colSum += mat[j][i]

            // check if every column sum is 
            // equal to prime diagonal sum 
            if (sum != colSum) return false
        }
        return true
    }

    // driver program to 
    // test above function 
    @JvmStatic
    fun main(args: Array<String>) {
        val mat = arrayOf(intArrayOf(2, 7, 6), intArrayOf(9, 5, 1), intArrayOf(4, 3, 8))
        if (isMagicSquare(mat)) println("Magic Square") else println(
            "Not a magic" +
                    " Square"
        )
    }
}