object MagicSquareMissing {
    // Function to print the original matrix 
    fun printFilledDiagonal(sq: Array<IntArray>): Int {
        // Calculate the sum of all the elements 
        // of the matrix 
        var sum = 0
        for (i in 0..2) for (j in 0..2) sum += sq[i][j]

        // Required sum of each row (from the approach) 
        sum /= 2
        for (i in 0..2) {

            // Row sum excluding the diagonal element 
            var rowSum = 0
            for (j in 0..2) rowSum += sq[i][j]

            // Element that must be inserted at 
            // diagonal element of the current row 
            sq[i][i] = sum - rowSum
        }

        // Print the updated matrix 
        for (i in 0..2) {
            for (j in 0..2) print(sq[i][j].toString() + " ")
            println()
        }
        return 0
    }

    // Driver Program to test above function 
    @JvmStatic
    fun main(args: Array<String>) {
        val sq = arrayOf(intArrayOf(0, 7, 6), intArrayOf(9, 0, 1), intArrayOf(4, 3, 0))
        printFilledDiagonal(sq)
    }
}