import kotlin.jvm.JvmStatic
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.Throws
import java.io.IOException

object Quick_Sort {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val entrada = br.readLine().split(" ").toTypedArray()
        val arr = IntArray(entrada.size)
        for (i in arr.indices) {
            arr[i] = entrada[i].toInt()
        }
        quickSort(arr, 0, arr.size - 1)
        println("Imprimiendo")
        for (i in arr.indices) {
            print(arr[i].toString() + " ")
        }
        println("")
    }

    fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1
        for (j in low until high) {
            if (arr[j] <= pivot) {
                i++
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp
        return i + 1
    }

    fun quickSort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            val pivot = partition(arr, low, high)
            quickSort(arr, low, pivot - 1)
            quickSort(arr, pivot + 1, high)
        }
    }
}