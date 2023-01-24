import kotlin.jvm.JvmStatic

object Missing_Number_Search {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 5, 6, 7, 8)
        val missed = getMissingNo(arr, arr.size)
        println("El numero perdido es: $missed")
    }

    fun getMissingNo(arr: IntArray, n: Int): Int {
        var x1 = arr[0]
        var x2 = 1
        for (i in 1 until n) {
            x1 = x1 xor arr[i]
        }
        for (i in 2..n + 1) {
            x2 = x2 xor i
        }
        return x1 xor x2
    }
}