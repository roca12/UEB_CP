import kotlin.jvm.JvmStatic
import java.util.*

object TarjanStronglyConnectedComponents {
    @JvmStatic
    fun main(args: Array<String>) {

        // Create a graph given in the above diagram  
        val g1 = Graph(5)
        g1.addEdge(1, 0)
        g1.addEdge(0, 2)
        g1.addEdge(2, 1)
        g1.addEdge(0, 3)
        g1.addEdge(3, 4)
        println("SSC in first graph ")
        g1.SCC()
        val g2 = Graph(4)
        g2.addEdge(0, 1)
        g2.addEdge(1, 2)
        g2.addEdge(2, 3)
        println("\nSSC in second graph ")
        g2.SCC()
        val g3 = Graph(7)
        g3.addEdge(0, 1)
        g3.addEdge(1, 2)
        g3.addEdge(2, 0)
        g3.addEdge(1, 3)
        g3.addEdge(1, 4)
        g3.addEdge(1, 6)
        g3.addEdge(3, 5)
        g3.addEdge(4, 5)
        println("\nSSC in third graph ")
        g3.SCC()
        val g4 = Graph(11)
        g4.addEdge(0, 1)
        g4.addEdge(0, 3)
        g4.addEdge(1, 2)
        g4.addEdge(1, 4)
        g4.addEdge(2, 0)
        g4.addEdge(2, 6)
        g4.addEdge(3, 2)
        g4.addEdge(4, 5)
        g4.addEdge(4, 6)
        g4.addEdge(5, 6)
        g4.addEdge(5, 7)
        g4.addEdge(5, 8)
        g4.addEdge(5, 9)
        g4.addEdge(6, 4)
        g4.addEdge(7, 9)
        g4.addEdge(8, 9)
        g4.addEdge(9, 8)
        println("\nSSC in fourth graph ")
        g4.SCC()
        val g5 = Graph(5)
        g5.addEdge(0, 1)
        g5.addEdge(1, 2)
        g5.addEdge(2, 3)
        g5.addEdge(2, 4)
        g5.addEdge(3, 0)
        g5.addEdge(4, 2)
        println("\nSSC in fifth graph ")
        g5.SCC()
    }

    // This class represents a directed graph  
    // using adjacency list representation  
    internal class Graph(  // No. of vertices     
        private val V: Int
    ) {
        //Adjacency Lists  
        private val adj: Array<LinkedList<Int?>>
        private var Time: Int

        // Function to add an edge into the graph  
        fun addEdge(v: Int, w: Int) {
            adj[v].add(w)
        }

        // A recursive function that finds and prints strongly  
        // connected components using DFS traversal  
        // u --> The vertex to be visited next  
        // disc[] --> Stores discovery times of visited vertices  
        // low[] -- >> earliest visited vertex (the vertex with 
        //             minimum discovery time) that can be reached 
        //             from subtree rooted with current vertex  
        // st -- >> To store all the connected ancestors (could be part  
        //         of SCC)  
        // stackMember[] --> bit/index array for faster check 
        //                   whether a node is in stack  
        fun SCCUtil(
            u: Int, low: IntArray, disc: IntArray,
            stackMember: BooleanArray,
            st: Stack<Int>
        ) {

            // Initialize discovery time and low value  
            disc[u] = Time
            low[u] = Time
            Time += 1
            stackMember[u] = true
            st.push(u)
            var n: Int

            // Go through all vertices adjacent to this  
            val i: MutableIterator<Int?> = adj[u].iterator()
            while (i.hasNext()) {
                n = i.next()!!
                if (disc[n] == -1) {
                    SCCUtil(n, low, disc, stackMember, st)

                    // Check if the subtree rooted with v  
                    // has a connection to one of the  
                    // ancestors of u  
                    // Case 1 (per above discussion on 
                    // Disc and Low value)  
                    low[u] = Math.min(low[u], low[n])
                } else if (stackMember[n] == true) {

                    // Update low value of 'u' only if 'v' is 
                    // still in stack (i.e. it's a back edge,  
                    // not cross edge).  
                    // Case 2 (per above discussion on Disc 
                    // and Low value) 
                    low[u] = Math.min(low[u], disc[n])
                }
            }

            // head node found, pop the stack and print an SCC  
            // To store stack extracted vertices  
            var w = -1
            if (low[u] == disc[u]) {
                while (w != u) {
                    w = st.pop() as Int
                    print("$w ")
                    stackMember[w] = false
                }
                println()
            }
        }

        // The function to do DFS traversal. 
        // It uses SCCUtil()  
        fun SCC() {

            // Mark all the vertices as not visited  
            // and Initialize parent and visited,  
            // and ap(articulation point) arrays  
            val disc = IntArray(V)
            val low = IntArray(V)
            for (i in 0 until V) {
                disc[i] = -1
                low[i] = -1
            }
            val stackMember = BooleanArray(V)
            val st = Stack<Int>()

            // Call the recursive helper function  
            // to find articulation points  
            // in DFS tree rooted with vertex 'i'  
            for (i in 0 until V) {
                if (disc[i] == -1) {
                    SCCUtil(
                        i, low, disc,
                        stackMember, st
                    )
                }
            }
        }

        // Constructor  
        init {
            adj = Array(V){i->LinkedList<Int?>()}
            Time = 0
        }
    }
}