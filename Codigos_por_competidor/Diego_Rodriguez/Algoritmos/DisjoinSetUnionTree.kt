// that all nodes are even in weight
object DisjoinSetUnionTree {
    var N = 100010

    /* 'id': stores parent of a node. 
    'sz': stores size of a DSU tree. */
    var id = IntArray(N)
    var sz = IntArray(N)

    // Function to assign root 
    fun Root(idx: Int): Int {
        var i = idx
        while (i != id[i]) {
            id[i] = id[id[i]]
            i = id[i]
        }
        return i
    }

    // Function to find Union 
    fun Union(a: Int, b: Int) {
        val i = Root(a)
        val j = Root(b)
        if (i != j) {
            if (sz[i] >= sz[j]) {
                id[j] = i
                sz[i] += sz[j]
                sz[j] = 0
            } else {
                id[i] = j
                sz[j] += sz[i]
                sz[i] = 0
            }
        }
    }

    // Utility function for Union 
    fun UnionUtil(e: Array<Edge>, W: IntArray, q: Int) {
        for (i in 0 until q) {
            // Edge between 'u' and 'v' 
            var u: Int
            var v: Int
            u = e[i].u
            v = e[i].v

            // 0-indexed nodes 
            u--
            v--

            // If weights of both 'u' and 'v' 
            // are even then we make union of them. 
            if (W[u] % 2 == 0 && W[v] % 2 == 0) {
                Union(u, v)
            }
        }
    }

    // Function to find maximum 
    // size of DSU tree 
    fun findMax(n: Int, W: IntArray): Int {
        var maxi = 0
        for (i in 1 until n) {
            if (W[i] % 2 == 0) {
                maxi = Math.max(maxi, sz[i])
            }
        }
        return maxi
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        /* 
	Nodes are 0-indexed in this code 
	So we have to make necessary changes 
	while taking inputs 
         */
        // Weights of nodes 
        val W = intArrayOf(1, 2, 6, 4, 2, 0, 3)

        // Number of nodes in a tree 
        val n = W.size

        // Initializing every node as 
        // a tree with single node. 
        for (i in 0 until n) {
            id[i] = i
            sz[i] = 1
        }
        val e = arrayOf(
            Edge(1, 2), Edge(1, 3),
            Edge(2, 4), Edge(2, 5),
            Edge(4, 6), Edge(6, 7)
        )
        val q = e.size
        UnionUtil(e, W, q)
        // Find maximum size of DSU tree. 
        val maxi = findMax(n, W)
        System.out.printf("Maximum size of the subtree with ")
        System.out.printf("even weighted nodes = %d\n", maxi)
    }

    // Structure for Edge 
    class Edge(var u: Int, var v: Int)
}