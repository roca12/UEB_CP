object Combinatory {
    fun combUtil(arr: IntArray, data: IntArray, start: Int, end: Int, index: Int, r: Int) {
        if (index == r) {
            for (i in 0 until r) {
                print(data[i].toString() + " ")
            }
            println("")
            return
        }
        var i = start
        while (i <= end && end - i + 1 >= r - index) {
            data[index] = arr[i]
            combUtil(arr, data, i + 1, end, index + 1, r)
            i++
        }
    }

    fun printComb(arr: IntArray, n: Int, r: Int) {
        val data = IntArray(r)
        combUtil(arr, data, 0, n - 1, 0, r)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(10, 2, 4, 6, 7)
        val r = 3
        val n = arr.size
        printComb(arr, n, r)
    }
}