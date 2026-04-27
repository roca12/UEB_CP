object Difference_Pair_Search {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 8, 30, 40, 100)
        val resultadoDeseado = 60
        findPair(arr, resultadoDeseado)
    }

    fun findPair(arr: IntArray, n: Int): Boolean {
        val size = arr.size
        var i = 0
        var j = 1
        while (i < size && j < size) {
            if (i != j && arr[j] - arr[i] == n) {
                println("Par encontrado: " + "(" + arr[i] + ", " + arr[j] + ")")
                return true
            } else if (arr[j] - arr[i] < n) {
                j++
            } else {
                i++
            }
        }
        println("No existe tal par")
        return false
    }
}