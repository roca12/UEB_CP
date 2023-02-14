import kotlin.jvm.JvmStatic
import java.util.Arrays
import java.util.TreeMap
import java.util.function.Consumer

object SuffixArrayString {
    //Sorted map for all suffix with begin index
    var suffixes = TreeMap<Int, Suffix?>()

    // This is the main function that takes a string 'txt' 
    // of size n as an argument, builds and return the 
    // suffix array for the given string 
    fun suffixArray(s: String): IntArray {
        val n = s.length
        val su = arrayOfNulls<Suffix>(n)

        // Store suffixes and their indexes in 
        // an array of classes. The class is needed 
        // to sort the suffixes alphabatically and 
        // maintain their old indexes while sorting 
        for (i in 0 until n) {
            su[i] = Suffix(i, s[i] - '$', 0)
        }
        for (i in 0 until n) {
            su[i]!!.next = if (i + 1 < n) su[i + 1]!!.rank else -1
        }

        // Sort the suffixes using the comparison function 
        // defined above. 
        Arrays.sort(su)

        // At this point, all suffixes are sorted 
        // according to first 2 characters. 
        // Let us sort suffixes according to first 4 
        // characters, then first 8 and so on 
        val ind = IntArray(n)

        // This array is needed to get the index in suffixes[] 
        // from original index. This mapping is needed to get 
        // next suffix. 
        var length = 4
        while (length < 2 * n) {


            // Assigning rank and index values to first suffix 
            var rank = 0
            var prev = su[0]!!.rank
            su[0]!!.rank = rank
            ind[su[0]!!.index] = 0
            for (i in 1 until n) {
                // If first rank and next ranks are same as 
                // that of previous suffix in array, 
                // assign the same new rank to this suffix 
                if (su[i]!!.rank == prev
                    && su[i]!!.next == su[i - 1]!!.next
                ) {
                    prev = su[i]!!.rank
                    su[i]!!.rank = rank
                } else {
                    // Otherwise increment rank and assign 
                    prev = su[i]!!.rank
                    su[i]!!.rank = ++rank
                }
                ind[su[i]!!.index] = i
            }

            // Assign next rank to every suffix 
            for (i in 0 until n) {
                val nextP = su[i]!!.index + length / 2
                su[i]!!.next = if (nextP < n) su[ind[nextP]]!!.rank else -1
            }

            // Sort the suffixes according 
            // to first k characters 
            Arrays.sort(su)
            length = length shl 1
        }

        // Store indexes of all sorted 
        // suffixes in the suffix array 
        val suf = IntArray(n)
        for (i in 0 until n) {
            suf[i] = su[i]!!.index
        }
        var k = 0
        for (i in su) {
            suffixes[su[k]!!.index] = su[k]
            k++
        }

// Return the suffix array 
        return suf
    }

    fun printArr(arr: IntArray, n: Int) {
        for (i in 0 until n) {
            print(arr[i].toString() + " ")
        }
        println()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val txt = "banana"
        val n = txt.length
        val suff_arr = suffixArray(txt)
        println("All suffixes")
        suffixes.entries.forEach(Consumer<Map.Entry<Int, Suffix?>> { entry: Map.Entry<Int, Suffix?> ->
            println(
                "index: " + entry.key + ". suffix: " + txt.substring(
                    entry.value!!.index
                )
            )
        })
        println("Following is suffix array for $txt sorted:")
        printArr(suff_arr, n)
    }

    // Class to store information of a suffix 
    class Suffix(var index: Int, var rank: Int, var next: Int) : Comparable<Suffix> {
        // A comparison function used by sort() 
        // to compare two suffixes. 
        // Compares two pairs, returns 1 
        // if first pair is smaller 
        override fun compareTo(s: Suffix): Int {
            return if (rank != s.rank) {
                Integer.compare(rank, s.rank)
            } else Integer.compare(next, s.next)
        }
    }
}