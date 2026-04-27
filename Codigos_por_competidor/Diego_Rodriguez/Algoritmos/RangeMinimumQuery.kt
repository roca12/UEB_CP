import kotlin.jvm.JvmStatic

// tree.  
object RangeMinimumQuery {
    fun construct_segment_tree(
        segtree: IntArray,
        a: IntArray, n: Int
    ) {

        // assign values to leaves of the segment tree 
        for (i in 0 until n) {
            segtree[n + i] = a[i]
        }

        /* 
        * assign values to internal nodes 
        * to compute minimum in a given range 
         */for (i in n - 1 downTo 1) {
            segtree[i] = Math.min(segtree[2 * i], segtree[2 * i + 1])
        }
    }

    fun update(segtree: IntArray, pos: Int, value: Int, n: Int) {

        // change the index to leaf node first 
        var pos = pos
        pos += n

        // update the value at the leaf node 
        // at the exact index 
        segtree[pos] = value
        while (pos > 1) {

            // move up one level at a time in the tree 
            pos = pos shr 1

            // update the values in the nodes in 
            // the next higher level 
            segtree[pos] = Math.min(
                segtree[2 * pos],
                segtree[2 * pos + 1]
            )
        }
    }

    fun range_query(
        segtree: IntArray, left: Int,
        right: Int, n: Int
    ): Int {

        /* 
        * Basically the left and right indices will move 
        * towards right and left respectively and with 
        * every each next higher level and compute the 
        * minimum at each height. */
        // change the index to leaf node first 
        var left = left
        var right = right
        left += n
        right += n

        // initialize minimum to a very high value 
        var mi = 1e9.toInt()
        while (left < right) {

            // if left index in odd 
            if (left and 1 == 1) {
                mi = Math.min(mi, segtree[left])

                // make left index even 
                left++
            }

            // if right index in odd 
            if (right and 1 == 1) {

                // make right index even 
                right--
                mi = Math.min(mi, segtree[right])
            }

            // move to the next higher level 
            left /= 2
            right /= 2
        }
        return mi
    }

    // Driver Code 
    @JvmStatic
    fun main(args: Array<String>) {
        val a = intArrayOf(2, 6, 10, 4, 7, 28, 9, 11, 6, 33)
        val n = a.size

        /*  
        * Construct the segment tree by assigning 
        * the values to the internal nodes 
         */
        val segtree = IntArray(2 * n)
        construct_segment_tree(segtree, a, n)

        // compute minimum in the range left to right  
        var left = 0
        var right = 5
        System.out.printf(
            "Minimum in range %d to %d is %d\n",
            left, right, range_query(
                segtree,
                left, right + 1, n
            )
        )

        // update the value of index 3 to 1  
        val index = 3
        val value = 1

        // a[3] = 1;  
        // Contents of array : {2, 6, 10, 1, 7, 28, 9, 11, 6, 33} 
        update(segtree, index, value, n) // point update 

        // compute minimum in the range left to right 
        left = 2
        right = 6
        System.out.printf(
            "Minimum in range %d to %d is %d\n",
            left, right, range_query(
                segtree,
                left, right + 1, n
            )
        )
    }
}