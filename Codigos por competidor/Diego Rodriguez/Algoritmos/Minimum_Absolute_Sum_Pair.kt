import kotlin.jvm.JvmStatic

object MaxMinSearch {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1000, 11, 445, 1, 330, 3000)
        val n = arr.size
        val minPair = getMinMax(arr, n)
        System.out.printf("El minimo elemento es %d", minPair.min)
        System.out.printf("\nEl maximo elemento es %d", minPair.max)
    }

    fun getMinMax(arr: IntArray, n: Int): Pair {
        val minmax = Pair()
        if (n == 1) {
            minmax.max = arr[0]
            minmax.min = arr[0]
        }
        if (arr[0] > arr[1]) {
            minmax.max = arr[0]
            minmax.min = arr[1]
        } else {
            minmax.max = arr[1]
            minmax.min = arr[0]
        }
        for (j in 2 until n) {
            if (arr[j] > minmax.max) {
                minmax.max = arr[j]
            } else if (arr[j] < minmax.min) {
                minmax.min = arr[j]
            }
        }
        return minmax
    }

    class Pair {
        var min = 0
        var max = 0
    }
}