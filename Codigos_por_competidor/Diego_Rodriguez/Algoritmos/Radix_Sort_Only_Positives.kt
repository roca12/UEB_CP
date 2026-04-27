import kotlin.jvm.JvmStatic
import java.util.Arrays
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.Throws
import java.io.IOException

object Radix_Sort_Only_Positives {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val entrada = br.readLine().split(" ").toTypedArray()
        val arr = IntArray(entrada.size)
        for (i in arr.indices) {
            arr[i] = entrada[i].toInt()
        }
        radixsort(arr, arr.size)
        print(arr, arr.size)
    }

    fun getMax(arr: IntArray, n: Int): Int {
        var mx = arr[0]
        for (i in 1 until n) {
            if (arr[i] > mx) {
                mx = arr[i]
            }
        }
        return mx
    }

    fun countSort(arr: IntArray, n: Int, exp: Int) {
        val output = IntArray(n) // Array de salida
        var i: Int
        val count = IntArray(10)
        Arrays.fill(count, 0)
        i = 0
        while (i < n) {
            count[arr[i] / exp % 10]++
            i++
        }
        i = 1
        while (i < 10) {
            count[i] += count[i - 1]
            i++
        }
        i = n - 1
        while (i >= 0) {
            output[count[arr[i] / exp % 10] - 1] = arr[i]
            count[arr[i] / exp % 10]--
            i--
        }
        i = 0
        while (i < n) {
            arr[i] = output[i]
            i++
        }
    }

    fun radixsort(arr: IntArray, n: Int) {
        val m = getMax(arr, n)
        var exp = 1
        while (m / exp > 0) {
            countSort(arr, n, exp)
            exp *= 10
        }
    }

    fun print(arr: IntArray, n: Int) {
        for (i in 0 until n) {
            print(arr[i].toString() + " ")
        }
    }
}