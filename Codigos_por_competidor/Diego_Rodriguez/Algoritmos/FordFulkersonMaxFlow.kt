import java.util.*

object FordFulkersonMaxFlow {
    const val V = 6 //Number of vertices in graph 

    /* Returns true if there is a path from source 's' to sink 
	't' in residual graph. Also fills parent[] to store the 
	path */
    fun bfs(rGraph: Array<IntArray>, s: Int, t: Int, parent: IntArray): Boolean {
        // Create a visited array and mark all vertices as not 
        // visited 
        val visited = BooleanArray(V)
        for (i in 0 until V) {
            visited[i] = false
        }

        // Create a queue, enqueue source vertex and mark 
        // source vertex as visited 
        val queue = LinkedList<Int>()
        queue.add(s)
        visited[s] = true
        parent[s] = -1

        // Standard BFS Loop 
        while (queue.size != 0) {
            val u = queue.poll()
            for (v in 0 until V) {
                if (visited[v] == false && rGraph[u][v] > 0) {
                    queue.add(v)
                    parent[v] = u
                    visited[v] = true
                }
            }
        }

        // If we reached sink in BFS starting from source, then 
        // return true, else false 
        return visited[t] == true
    }

    // Returns tne maximum flow from s to t in the given graph 
    fun fordFulkerson(graph: Array<IntArray>, s: Int, t: Int): Int {
        var u: Int
        var v: Int

        // Create a residual graph and fill the residual graph 
        // with given capacities in the original graph as 
        // residual capacities in residual graph 
        // Residual graph where rGraph[i][j] indicates 
        // residual capacity of edge from i to j (if there 
        // is an edge. If rGraph[i][j] is 0, then there is 
        // not) 
        val rGraph = Array(V) { IntArray(V) }
        u = 0
        while (u < V) {
            v = 0
            while (v < V) {
                rGraph[u][v] = graph[u][v]
                v++
            }
            u++
        }

        // This array is filled by BFS and to store path 
        val parent = IntArray(V)
        var max_flow = 0 // There is no flow initially 

        // Augment the flow while tere is path from source 
        // to sink 
        while (bfs(rGraph, s, t, parent)) {
            // Find minimum residual capacity of the edhes 
            // along the path filled by BFS. Or we can say 
            // find the maximum flow through the path found. 
            var path_flow = Int.MAX_VALUE
            v = t
            while (v != s) {
                u = parent[v]
                path_flow = Math.min(path_flow, rGraph[u][v])
                v = parent[v]
            }

            // update residual capacities of the edges and 
            // reverse edges along the path 
            v = t
            while (v != s) {
                u = parent[v]
                rGraph[u][v] -= path_flow
                rGraph[v][u] += path_flow
                v = parent[v]
            }

            // Add path flow to overall flow 
            max_flow += path_flow
        }

        // Return the overall flow 
        return max_flow
    }

    // Driver program to test above functions 
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        // Let us create a graph shown in the above example 
        val graph = arrayOf(
            intArrayOf(0, 16, 13, 0, 0, 0),
            intArrayOf(0, 0, 10, 12, 0, 0),
            intArrayOf(0, 4, 0, 0, 14, 0),
            intArrayOf(0, 0, 9, 0, 0, 20),
            intArrayOf(0, 0, 0, 7, 0, 4),
            intArrayOf(0, 0, 0, 0, 0, 0)
        )
        println(
            "The maximum possible flow is "
                    + fordFulkerson(graph, 0, 5)
        )
    }
}