import kotlin.jvm.JvmStatic
import java.util.*

object TestCasesRandomSortedArray {
    // Define the number of runs for the test data 
    // generated 
    var RUN = 5

    // Define the range of the test data generated 
    var MAX = 100000

    // Define the maximum number of array elements 
    var MAXNUM = 100
    fun randSortedArray() {
        // For random values every time 
        val r = Random()
        var NUM: Int // Number of array elements 
        for (i in 1..RUN) {
            NUM = 1 + r.nextInt(MAXNUM)
            val arr = IntArray(NUM)
            // First print the number of array elements 
            System.out.printf("%d\n", NUM)
            for (j in 0 until NUM) {
                arr[j] = r.nextInt(MAX)
            }
            // Sort the generated random array 
            Arrays.sort(arr)
            // Print the sorted random array 
            for (j in 0 until NUM) {
                System.out.printf("%d ", arr[j])
            }
            System.out.printf("\n")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        randSortedArray()
    }
}