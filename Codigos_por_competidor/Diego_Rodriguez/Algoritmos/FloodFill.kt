object FloodFill {
    // Dimentions of paint screen 
    var M = 8
    var N = 8

    // A recursive function to replace previous color 'prevC' at '(x, y)' 
    // and all surrounding pixels of (x, y) with new color 'newC' and 
    fun floodFillUtil(
        screen: Array<IntArray>, x: Int, y: Int,
        prevC: Int, newC: Int
    ) {
        // Base cases 
        if (x < 0 || x >= M || y < 0 || y >= N) {
            return
        }
        if (screen[x][y] != prevC) {
            return
        }

        // Replace the color at (x, y) 
        screen[x][y] = newC

        // Recur for north, east, south and west 
        floodFillUtil(screen, x + 1, y, prevC, newC)
        floodFillUtil(screen, x - 1, y, prevC, newC)
        floodFillUtil(screen, x, y + 1, prevC, newC)
        floodFillUtil(screen, x, y - 1, prevC, newC)
    }

    // It mainly finds the previous color on (x, y) and 
    // calls floodFillUtil() 
    fun floodFill(screen: Array<IntArray>, x: Int, y: Int, newC: Int) {
        val prevC = screen[x][y]
        floodFillUtil(screen, x, y, prevC, newC)
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        val screen = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1, 0, 0),
            intArrayOf(1, 0, 0, 1, 1, 0, 1, 1),
            intArrayOf(1, 2, 2, 2, 2, 0, 1, 0),
            intArrayOf(1, 1, 1, 2, 2, 0, 1, 0),
            intArrayOf(1, 1, 1, 2, 2, 2, 2, 0),
            intArrayOf(1, 1, 1, 1, 1, 2, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 2, 2, 1)
        )
        val x = 4
        val y = 4
        val newC = 3
        floodFill(screen, x, y, newC)
        println("Updated screen after call to floodFill: ")
        for (i in 0 until M) {
            for (j in 0 until N) {
                print(screen[i][j].toString() + " ")
            }
            println()
        }
    }
}