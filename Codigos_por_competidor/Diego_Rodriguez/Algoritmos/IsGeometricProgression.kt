object IsGeometricProgression {
    // function to check series is 
    // geometric progression or not 
    fun is_geometric(arr: IntArray, n: Int): Boolean {
        if (n == 1) return true

        // Calculate ratio 
        val ratio = arr[1] / arr[0]

        // Check the ratio of the remaining 
        for (i in 1 until n) {
            if (arr[i] / arr[i - 1] != ratio) {
                return false
            }
        }
        return true
    }

    // driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(2, 6, 18, 54)
        val n = arr.size
        if (is_geometric(arr, n)) println("True") else println("False")
    }
}