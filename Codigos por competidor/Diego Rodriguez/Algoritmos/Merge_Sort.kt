import kotlin.jvm.JvmStatic
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.Throws
import java.io.IOException

object Merge_Sort {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val entrada = br.readLine().split(" ").toTypedArray()
        val arr = IntArray(entrada.size)
        for (i in entrada.indices) {
            arr[i] = entrada[i].toInt()
        }
        mergeSort(arr, 0, arr.size - 1)
        print(arr)
    }

    fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
        val tam1 = mid - left + 1
        val tam2 = right - mid
        val Left = IntArray(tam1)
        val Right = IntArray(tam2)
        for (i in 0 until tam1) {
            Left[i] = arr[left + i]
        }
        for (i in 0 until tam2) {
            Right[i] = arr[mid + 1 + i]
        }
        var i = 0
        var j = 0
        var k = left
        while (i < tam1 && j < tam2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i]
                i++
            } else {
                arr[k] = Right[j]
                j++
            }
            k++
        }
        while (i < tam1) {
            arr[k] = Left[i]
            i++
            k++
        }
        while (j < tam2) {
            arr[k] = Right[j]
            j++
            k++
        }
    }

    fun mergeSort(arr: IntArray, left: Int, right: Int) {
        if (left < right) {
            val m = (left + right) / 2
            mergeSort(arr, left, m)
            mergeSort(arr, m + 1, right)
            merge(arr, left, m, right)
        }
    }

    fun print(arr: IntArray) {
        val n = arr.size
        for (i in 0 until n) {
            print(arr[i].toString() + " ")
        }
        println()
    }
}