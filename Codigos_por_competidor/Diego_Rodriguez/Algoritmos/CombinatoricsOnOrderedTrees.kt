// trees with given number of edges and
// leaves 
object CombinatoricsOnOrderedTrees {
    // Function returns value of 
    // Binomial Coefficient C(n, k) 
    fun binomialCoeff(n: Int, k: Int): Int {
        val C = Array(n + 1) { IntArray(k + 1) }
        var i: Int
        var j: Int
        // Calculate value of Binomial 
        // Coefficient in bottom up manner 
        i = 0
        while (i <= n) {
            j = 0
            while (j <= Math.min(i, k)) {

                // Base Cases 
                if (j == 0 || j == i) {
                    C[i][j] = 1
                } // Calculate value using 
                else {
                    C[i][j] = (C[i - 1][j - 1]
                            + C[i - 1][j])
                }
                j++
            }
            i++
        }
        return C[n][k]
    }

    // Function to calculate the number 
    // of trees with exactly k leaves. 
    fun k_Leaves(n: Int, k: Int): Int {
        val ans = (binomialCoeff(n, k)
                * binomialCoeff(n, k - 1)) / n
        println(
            "Number of trees "
                    + "having 4 edges and exactly 2 "
                    + "leaves : " + ans
        )
        return 0
    }

    // Function to calculate total number of 
    // nodes of degree d in these trees. 
    fun numberOfNodes(n: Int, d: Int): Int {
        val ans = binomialCoeff(
            2 * n - 1 - d,
            n - 1
        )
        println(
            "Number of nodes "
                    + "of degree 1 in a tree having 4 "
                    + "edges : " + ans
        )
        return 0
    }

    // Function to calculate the number of 
    // trees in which the root has degree r. 
    fun rootDegreeR(n: Int, r: Int): Int {
        var ans = r * binomialCoeff(2 * n - 1 - r, n - 1)
        ans = ans / n
        println(
            "Number of trees "
                    + "having 4 edges where root has"
                    + " degree 2 : " + ans
        )
        return 0
    }

    // Driver program to test above functions 
    @JvmStatic
    fun main(args: Array<String>) {
        // Number of trees having 3 
        // edges and exactly 2 leaves 
        k_Leaves(3, 2)
        // Number of nodes of degree 
        // 3 in a tree having 4 edges 
        numberOfNodes(3, 1)
        // Number of trees having 3 
        // edges where root has degree 2 
        rootDegreeR(3, 2)
    }
}