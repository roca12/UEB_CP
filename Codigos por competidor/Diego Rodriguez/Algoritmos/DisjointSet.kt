//una colección de conjuntos disyuntos.
//Permite determinar de manera eficiente 
//a que conjunto pertenece un elemento,
//si dos elementos se encuentran en un mismo 
//conjunto y unir dos conjuntos disyuntos en un uno.
object DisjointSet {
    @JvmStatic
    fun main(args: Array<String>) {
        // Let there be 5 persons with ids as 
        // 0, 1, 2, 3 and 4 
        val n = 5
        val dus = DisjointUnionSets(n)

        // 0 is a friend of 2 
        dus.union(0, 2)

        // 4 is a friend of 2 
        dus.union(4, 2)

        // 3 is a friend of 1 
        dus.union(3, 1)

        // Check if 4 is a friend of 0 
        if (dus.find(4) == dus.find(0)) {
            println("Yes")
        } else {
            println("No")
        }

        // Check if 1 is a friend of 0 
        if (dus.find(1) == dus.find(0)) {
            println("Yes")
        } else {
            println("No")
        }
    }

    internal class DisjointUnionSets(n: Int) {
        var rank: IntArray
        var parent: IntArray
        var n: Int

        // Creates n sets with single item in each 
        fun makeSet() {
            for (i in 0 until n) {
                // Initially, all elements are in 
                // their own set. 
                parent[i] = i
            }
        }

        // Returns representative of x's set 
        fun find(x: Int): Int {
            // Finds the representative of the set 
            // that x is an element of 
            if (parent[x] != x) {
                // if x is not the parent of itself 
                // Then x is not the representative of 
                // his set, 
                parent[x] = find(parent[x])

                // so we recursively call Find on its parent 
                // and move i's node directly under the 
                // representative of this set 
            }
            return parent[x]
        }

        // Unites the set that includes x and the set 
        // that includes x 
        fun union(x: Int, y: Int) {
            // Find representatives of two sets 
            val xRoot = find(x)
            val yRoot = find(y)

            // Elements are in the same set, no need 
            // to unite anything. 
            if (xRoot == yRoot) {
                return
            }

            // If x's rank is less than y's rank 
            if (rank[xRoot] < rank[yRoot]) // Then move x under y so that depth 
            // of tree remains less 
            {
                parent[xRoot] = yRoot
            } // Else if y's rank is less than x's rank 
            else if (rank[yRoot] < rank[xRoot]) // Then move y under x so that depth of 
            // tree remains less 
            {
                parent[yRoot] = xRoot
            } else  // if ranks are the same 
            {
                // Then move y under x (doesn't matter 
                // which one goes where) 
                parent[yRoot] = xRoot

                // And increment the result tree's 
                // rank by 1 
                rank[xRoot] = rank[xRoot] + 1
            }
        }

        // Constructor 
        init {
            rank = IntArray(n)
            parent = IntArray(n)
            this.n = n
            makeSet()
        }
    }
}