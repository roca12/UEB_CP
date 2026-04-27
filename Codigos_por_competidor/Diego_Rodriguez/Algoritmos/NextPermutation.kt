import kotlin.jvm.JvmStatic
import java.util.Arrays

object NextPermutation {
    // Function to swap the data 
    // present in the left and right indices 
    fun swap(data: IntArray, left: Int, right: Int): IntArray {

        // Swap the data 
        val temp = data[left]
        data[left] = data[right]
        data[right] = temp

        // Return the updated array 
        return data
    }

    // Function to reverse the sub-array 
    // starting from left to the right 
    // both inclusive 
    fun reverse(data: IntArray, left: Int, right: Int): IntArray {

        // Reverse the sub-array 
        var left = left
        var right = right
        while (left < right) {
            val temp = data[left]
            data[left++] = data[right]
            data[right--] = temp
        }

        // Return the updated array 
        return data
    }

    // Function to find the next permutation 
    // of the given integer array 
    fun findNextPermutation(data: IntArray): Boolean {

        // If the given dataset is empty 
        // or contains only one element 
        // next_permutation is not possible 
        var data = data
        if (data.size <= 1) {
            return false
        }
        var last = data.size - 2

        // find the longest non-increasing suffix 
        // and find the pivot 
        while (last >= 0) {
            if (data[last] < data[last + 1]) {
                break
            }
            last--
        }

        // If there is no increasing pair 
        // there is no higher order permutation 
        if (last < 0) {
            return false
        }
        var nextGreater = data.size - 1

        // Find the rightmost successor to the pivot 
        for (i in data.size - 1 downTo last + 1) {
            if (data[i] > data[last]) {
                nextGreater = i
                break
            }
        }

        // Swap the successor and the pivot 
        data = swap(data, nextGreater, last)

        // Reverse the suffix 
        data = reverse(data, last + 1, data.size - 1)

        // Return true as the next_permutation is done 
        return true
    }

    // Driver Code 
    @JvmStatic
    fun main(args: Array<String>) {
        val data = intArrayOf(1, 2, 3)
        if (!findNextPermutation(data)) {
            println(
                "There is no higher"
                        + " order permutation "
                        + "for the given data."
            )
        } else {
            println(Arrays.toString(data))
        }
    }
}