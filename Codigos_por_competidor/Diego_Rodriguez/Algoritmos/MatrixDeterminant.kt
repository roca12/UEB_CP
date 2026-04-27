import kotlin.jvm.JvmStatic

// a matrix 
object MatrixDeterminant {
    // Dimension of input square matrix 
    const val N = 4

    // Function to get cofactor of 
    // mat[p][q] in temp[][]. n is 
    // current dimension of mat[][] 
    fun getCofactor(
        mat: Array<IntArray>,
        temp: Array<IntArray>, p: Int, q: Int, n: Int
    ) {
        var i = 0
        var j = 0

        // Looping for each element of 
        // the matrix 
        for (row in 0 until n) {
            for (col in 0 until n) {

                // Copying into temporary matrix 
                // only those element which are 
                // not in given row and column 
                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col]

                    // Row is filled, so increase 
                    // row index and reset col 
                    //index 
                    if (j == n - 1) {
                        j = 0
                        i++
                    }
                }
            }
        }
    }

    /* Recursive function for finding determinant 
	of matrix. n is current dimension of mat[][]. */
    fun determinantOfMatrix(mat: Array<IntArray>, n: Int): Int {
        var D = 0 // Initialize result 

        // Base case : if matrix contains single 
        // element 
        if (n == 1) {
            return mat[0][0]
        }

        // To store cofactors 
        val temp = Array(N) { IntArray(N) }

        // To store sign multiplier 
        var sign = 1

        // Iterate for each element of first row 
        for (f in 0 until n) {
            // Getting Cofactor of mat[0][f] 
            getCofactor(mat, temp, 0, f, n)
            D += (sign * mat[0][f]
                    * determinantOfMatrix(temp, n - 1))

            // terms are to be added with 
            // alternate sign 
            sign = -sign
        }
        return D
    }

    /* function for displaying the matrix */
    fun display(mat: Array<IntArray>, row: Int, col: Int) {
        for (i in 0 until row) {
            for (j in 0 until col) {
                print(mat[i][j])
            }
            print("\n")
        }
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        val mat =
            arrayOf(intArrayOf(1, 0, 2, -1), intArrayOf(3, 0, 0, 5), intArrayOf(2, 1, 4, -3), intArrayOf(1, 0, 5, 0))
        print(
            "Determinant "
                    + "of the matrix is : "
                    + determinantOfMatrix(mat, N)
        )
    }
}