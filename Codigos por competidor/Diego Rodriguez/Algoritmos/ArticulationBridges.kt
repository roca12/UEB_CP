import java.util.*

// representation 
object ArticulationBridges {
    // Driver method 
    @JvmStatic
    fun main(args: Array<String>) {
        // Create graphs given in above diagrams 
        println("Puntos de articulación en el grafo ")
        val g1 = Graph(5)
        g1.addEdge(1, 0)
        g1.addEdge(0, 2)
        g1.addEdge(2, 1)
        g1.addEdge(0, 3)
        g1.addEdge(3, 4)
        g1.AP()
        println()
        println("Puntos de articulación en el grafo")
        val g2 = Graph(4)
        g2.addEdge(0, 1)
        g2.addEdge(1, 2)
        g2.addEdge(2, 3)
        g2.AP()
        println()
        println("Puntos de articulación en el grafo ")
        val g3 = Graph(7)
        g3.addEdge(0, 1)
        g3.addEdge(1, 2)
        g3.addEdge(2, 0)
        g3.addEdge(1, 3)
        g3.addEdge(1, 4)
        g3.addEdge(1, 6)
        g3.addEdge(3, 5)
        g3.addEdge(4, 5)
        g3.AP()
    }

    internal class Graph(  // No. of vertices 
        private val V: Int
    ) {
        // Array of lists for Adjacency List Representation 
        private val adj: Array<LinkedList<Int>>
        var time = 0

        //Function to add an edge into the graph 
        fun addEdge(v: Int, w: Int) {
            adj[v].add(w) // Add w to v's list. 
            adj[w].add(v) //Add v to w's list 
        }

        // A recursive function that find articulation points using DFS 
        // u --> The vertex to be visited next 
        // visited[] --> keeps tract of visited vertices 
        // disc[] --> Stores discovery times of visited vertices 
        // parent[] --> Stores parent vertices in DFS tree 
        // ap[] --> Store articulation points 
        fun APUtil(
            u: Int, visited: BooleanArray, disc: IntArray,
            low: IntArray, parent: IntArray, ap: BooleanArray
        ) {

            // Count of children in DFS Tree 
            var children = 0

            // Mark the current node as visited 
            visited[u] = true

            // Initialize discovery time and low value 
            low[u] = ++time
            disc[u] = low[u]

            // Go through all vertices aadjacent to this 
            val i: Iterator<Int> = adj[u].iterator()
            while (i.hasNext()) {
                val v = i.next() // v is current adjacent of u 

                // If v is not visited yet, then make it a child of u 
                // in DFS tree and recur for it 
                if (!visited[v]) {
                    children++
                    parent[v] = u
                    APUtil(v, visited, disc, low, parent, ap)

                    // Check if the subtree rooted with v has a connection to 
                    // one of the ancestors of u 
                    low[u] = Math.min(low[u], low[v])

                    // u is an articulation point in following cases 
                    // (1) u is root of DFS tree and has two or more chilren. 
                    if (parent[u] == NIL && children > 1) {
                        ap[u] = true
                    }

                    // (2) If u is not root and low value of one of its child 
                    // is more than discovery value of u. 
                    if (parent[u] != NIL && low[v] >= disc[u]) {
                        ap[u] = true
                    }
                } // Update low value of u for parent function calls. 
                else if (v != parent[u]) {
                    low[u] = Math.min(low[u], disc[v])
                }
            }
        }

        // The function to do DFS traversal. It uses recursive function APUtil() 
        fun AP() {
            // Mark all the vertices as not visited 
            val visited = BooleanArray(V)
            val disc = IntArray(V)
            val low = IntArray(V)
            val parent = IntArray(V)
            val ap = BooleanArray(V) // To store articulation points 

            // Initialize parent and visited, and ap(articulation point) 
            // arrays 
            for (i in 0 until V) {
                parent[i] = NIL
                visited[i] = false
                ap[i] = false
            }

            // Call the recursive helper function to find articulation 
            // points in DFS tree rooted with vertex 'i' 
            for (i in 0 until V) {
                if (visited[i] == false) {
                    APUtil(i, visited, disc, low, parent, ap)
                }
            }

            // Now ap[] contains articulation points, print them 
            for (i in 0 until V) {
                if (ap[i]) {
                    print("$i ")
                }
            }
        }

        companion object {
            const val NIL = -1
        }

        // Constructor 
        init {
            adj = Array(V){i->LinkedList<Int>()
            }
        }
    }
}