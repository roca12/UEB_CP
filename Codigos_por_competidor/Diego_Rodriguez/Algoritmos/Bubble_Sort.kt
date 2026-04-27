import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

object Bubble_Sort {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val entrada = br.readLine().split(" ").toTypedArray()
        val arr = IntArray(entrada.size)
        for (i in entrada.indices) {
            arr[i] = entrada[i].toInt()
        }
        bubbleSort(arr, arr.size)
        for (i in arr) {
            print("$i ")
        }
        println()
    }

    fun bubbleSort(arr: IntArray, size: Int) {
        if (size == 1) return
        for (i in 0 until size) {
            for (j in 0 until size - 1) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }
}