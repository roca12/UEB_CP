import kotlin.jvm.JvmStatic
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.Throws
import java.io.IOException
import java.util.ArrayList

object Shell_Sort {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val entrada = br.readLine().split(" ").toTypedArray()
        val arr = IntArray(entrada.size)
        for (i in entrada.indices) {
            arr[i] = entrada[i].toInt()
        }
        shellSort(arr)
        for (i in arr) {
            print("$i ")
        }
        println()
        dinamico()
    }

    fun shellSort(arr: IntArray): Int {
        val n = arr.size
        var gap = n / 2
        while (gap > 0) {
            var i = gap
            while (i < n) {
                val temp = arr[i]
                var j: Int
                j = i
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap]
                    j -= gap
                }
                arr[j] = temp
                i += 1
            }
            gap /= 2
        }
        return 0
    }

    @Throws(IOException::class)
    fun dinamico() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val entrada = br.readLine().split(" ").toTypedArray()
        val lista = ArrayList<Int>()
        for (i in entrada.indices) {
            lista.add(i, entrada[i].toInt())
        }
        shellSortDinamico(lista)
        for (i in lista) {
            print("$i ")
        }
        println("")
    }

    fun shellSortDinamico(arr: ArrayList<Int>): Int {
        val n = arr.size
        var gap = n / 2
        while (gap > 0) {
            var i = gap
            while (i < n) {
                val temp = arr[i]
                var j: Int
                j = i
                while (j >= gap && arr[j - gap] > temp) {
                    arr.removeAt(j)
                    arr.add(j, arr[j - gap])
                    j -= gap
                }
                arr.removeAt(j)
                arr.add(j, temp)
                i += 1
            }
            gap /= 2
        }
        return 0
    }
}