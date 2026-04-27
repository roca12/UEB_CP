// connected component in a grid
object LargestConnectedComponentOnGrid {
    const val n = 6
    const val m = 8

    // stores information about which cell 
    // are already visited in a particular BFS 
    val visited = Array(n) { IntArray(m) }

    // result stores the final result grid 
    val result = Array(n) { IntArray(m) }

    // stores the count of 
    // cells in the largest 
    // connected component 
    var COUNT = 0

    // Function checks if a cell 
    // is valid i.e it is inside 
    // the grid and equal to the key 
    fun is_valid(
        x: Int, y: Int,
        key: Int,
        input: Array<IntArray>
    ): Boolean {
        return if (x < n && y < m && x >= 0 && y >= 0) {
            if (visited[x][y] == 0
                && input[x][y] == key
            ) {
                true
            } else {
                false
            }
        } else {
            false
        }
    }

    // BFS to find all cells in 
    // connection with key = input[i][j] 
    fun BFS(
        x: Int, y: Int, i: Int,
        j: Int, input: Array<IntArray>
    ) {
        // terminating case for BFS 
        if (x != y) {
            return
        }
        visited[i][j] = 1
        COUNT++

        // x_move and y_move arrays 
        // are the possible movements 
        // in x or y direction 
        val x_move = intArrayOf(0, 0, 1, -1)
        val y_move = intArrayOf(1, -1, 0, 0)

        // checks all four points 
        // connected with input[i][j] 
        for (u in 0..3) {
            if (is_valid(
                    i + y_move[u],
                    j + x_move[u], x, input
                ) == true
            ) {
                BFS(
                    x, y, i + y_move[u],
                    j + x_move[u], input
                )
            }
        }
    }

    // called every time before 
    // a BFS so that visited 
    // array is reset to zero 
    fun reset_visited() {
        for (i in 0 until n) {
            for (j in 0 until m) {
                visited[i][j] = 0
            }
        }
    }

    // If a larger connected component 
    // is found this function is 
    // called to store information 
    // about that component. 
    fun reset_result(
        key: Int,
        input: Array<IntArray>
    ) {
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (visited[i][j] == 1
                    && input[i][j] == key
                ) {
                    result[i][j] = visited[i][j]
                } else {
                    result[i][j] = 0
                }
            }
        }
    }

    // function to print the result 
    fun print_result(res: Int) {
        println(
            "The largest connected "
                    + "component of the grid is :"
                    + res
        )

        // prints the largest component 
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (result[i][j] != 0) {
                    print(result[i][j].toString() + " ")
                } else {
                    print(". ")
                }
            }
            println()
        }
    }

    // function to calculate the 
    // largest connected component 
    fun computeLargestConnectedGrid(input: Array<IntArray>) {
        var current_max = Int.MIN_VALUE
        for (i in 0 until n) {
            for (j in 0 until m) {
                reset_visited()
                COUNT = 0

                // checking cell to the right 
                if (j + 1 < m) {
                    BFS(
                        input[i][j], input[i][j + 1],
                        i, j, input
                    )
                }

                // updating result 
                if (COUNT >= current_max) {
                    current_max = COUNT
                    reset_result(input[i][j], input)
                }
                reset_visited()
                COUNT = 0

                // checking cell downwards 
                if (i + 1 < n) {
                    BFS(
                        input[i][j],
                        input[i + 1][j], i, j, input
                    )
                }

                // updating result 
                if (COUNT >= current_max) {
                    current_max = COUNT
                    reset_result(input[i][j], input)
                }
            }
        }
        print_result(current_max)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val input = arrayOf(
            intArrayOf(1, 4, 4, 4, 4, 3, 3, 1),
            intArrayOf(2, 1, 1, 4, 3, 3, 1, 1),
            intArrayOf(3, 2, 1, 1, 2, 3, 2, 1),
            intArrayOf(3, 3, 2, 1, 2, 2, 2, 2),
            intArrayOf(3, 1, 3, 1, 1, 4, 4, 4),
            intArrayOf(1, 1, 3, 1, 1, 4, 4, 4)
        )

        // function to compute the largest 
        // connected component in the grid 
        computeLargestConnectedGrid(input)
    }
}