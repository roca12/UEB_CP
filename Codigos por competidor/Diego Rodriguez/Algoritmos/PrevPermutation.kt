import kotlin.jvm.JvmStatic
import java.util.Arrays

object PrevPermutation {
    fun prev_permutation(arr: IntArray): Boolean {
        var len = arr.size
        var i = len - 1
        // 1. find largest i where arr[i - 1] > arr[i]
        while (i > 0) {
            if (arr[i - 1] > arr[i]) {
                break
            }
            i--
        }
        if (i <= 0) {
            return false
        }
        // 2. find largest j where arr[i - 1] > arr[j] and j >= i
        var j = len - 1
        while (j >= i) {
            if (arr[i - 1] > arr[j]) {
                break
            }
            j--
        }
        // 3. swap elements between arr[i-1] and arr[j]
        swap(i - 1, j, arr)
        // 4. reverse elements from i to end of array
        len--
        while (i < len) {
            swap(i, len, arr)
            len--
            i++
        }
        return true
    }

    fun swap(x: Int, y: Int, arr: IntArray) {
        val temp = arr[x]
        arr[x] = arr[y]
        arr[y] = temp
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val data = intArrayOf(3, 2, 1)
        while (prev_permutation(data)) {
            println(Arrays.toString(data))
        }
    }
}