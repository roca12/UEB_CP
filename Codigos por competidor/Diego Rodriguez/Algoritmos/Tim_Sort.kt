import kotlin.jvm.JvmStatic
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.Throws
import java.io.IOException

object TimSort {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val entrada = br.readLine().split(" ").toTypedArray()
        val arr = IntArray(entrada.size)
        for (i in entrada.indices) {
            arr[i] = entrada[i].toInt()
        }
        timSort(arr, arr.size)
        for (i in arr) {
            print("$i ")
        }
        println()
    }

    var RUN = 32
    fun insertionSort(arr: IntArray, left: Int, right: Int) {
        var i: Int
        i = left + 1
        while (i <= right) {
            val temp = arr[i]
            var j = i - 1
            while (arr[j] > temp && j >= left) {
                arr[j + 1] = arr[j]
                j--
                if (j < 0) {
                    break
                }
            }
            arr[j + 1] = temp
            i++
        }
    }

    fun merge(arr: IntArray, x: Int, m: Int, r: Int) {
        val len1 = m - x + 1
        val len2 = r - m
        val left = IntArray(len1)
        val right = IntArray(len2)
        for (i in 0 until len1) {
            left[i] = arr[x + i]
        }
        for (i in 0 until len2) {
            right[i] = arr[m + 1 + i]
        }
        var i = 0
        var j = 0
        var k = x
        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i]
                i++
            } else {
                arr[k] = right[j]
                j++
            }
            k++
        }
        while (i < len1) {
            arr[k] = left[i]
            k++
            i++
        }
        while (j < len2) {
            arr[k] = right[j]
            k++
            j++
        }
    }

    fun timSort(arr: IntArray, tam: Int) {
        var i = 0
        while (i < tam) {
            insertionSort(arr, i, Math.min(i + 31, tam - 1))
            i += RUN
        }
        var size = RUN
        while (size < tam) {
            var left = 0
            while (left < tam) {
                val mid = left + size - 1
                val right = Math.min(left + 2 * size - 1, tam - 1)
                merge(arr, left, mid, right)
                left += 2 * size
            }
            size = 2 * size
        }
    }
}