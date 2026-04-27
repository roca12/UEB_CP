package weird

import java.util.*

// A Java program to implement greedy algorithm for graph coloring 
object GraphColoring {
    @JvmStatic
    fun main(args: Array<String>) {
        val g1 = Graph(5)
        g1.addEdge(0, 1)
        g1.addEdge(0, 2)
        g1.addEdge(1, 2)
        g1.addEdge(1, 3)
        g1.addEdge(2, 3)
        g1.addEdge(3, 4)
        println("Coloring of graph 1")
        g1.greedyColoring()
        println()
        val g2 = Graph(5)
        g2.addEdge(0, 1)
        g2.addEdge(0, 2)
        g2.addEdge(1, 2)
        g2.addEdge(1, 4)
        g2.addEdge(2, 4)
        g2.addEdge(4, 3)
        println("Coloring of graph 2 ")
        g2.greedyColoring()
    }

    internal class Graph(  // This class represents an undirected graph using adjacency list 
        private val V // No. of vertices 
        : Int
    ) {
        private val adj: Array<LinkedList<Int>> //Adjacency List 

        //Function to add an edge into the graph 
        fun addEdge(v: Int, w: Int) {
            adj[v].add(w)
            adj[w].add(v) //Graph is undirected 
        }

        // Assigns colors (starting from 0) to all vertices and 
        // prints the assignment of colors 
        fun greedyColoring() {
            val result = IntArray(V)

            // Initialize all vertices as unassigned 
            Arrays.fill(result, -1)

            // Assign the first color to first vertex 
            result[0] = 0

            // A temporary array to store the available colors. False 
            // value of available[cr] would mean that the color cr is 
            // assigned to one of its adjacent vertices 
            val available = BooleanArray(V)

            // Initially, all colors are available 
            Arrays.fill(available, true)

            // Assign colors to remaining V-1 vertices 
            for (u in 1 until V) {
                // Process all adjacent vertices and flag their colors 
                // as unavailable 
                val it: Iterator<Int> = adj[u].iterator()
                while (it.hasNext()) {
                    val i = it.next()
                    if (result[i] != -1) {
                        available[result[i]] = false
                    }
                }

                // Find the first available color 
                var cr: Int
                cr = 0
                while (cr < V) {
                    if (available[cr]) {
                        break
                    }
                    cr++
                }
                result[u] = cr // Assign the found color 

                // Reset the values back to true for the next iteration 
                Arrays.fill(available, true)
            }

            // print the result 
            for (u in 0 until V) {
                println(
                    "Vertex " + u + " --->  Color "
                            + result[u]
                )
            }
        }

        //Constructor 
        // Constructor
        init {
            adj = Array(V){i->LinkedList<Int>()
            }
        }
    }
}