import kotlin.jvm.JvmStatic
import java.util.Arrays
import java.util.LinkedList
import java.util.ArrayList

object MultiSourceSPUnweighted {
    const val N = 1000000

    // This array stores the distances of the vertices 
    // from the nearest source 
    var dist = IntArray(N)

    //This boolean array is true if the current vertex 
    // is visited otherwise it is false 
    var visited = BooleanArray(N)
    fun addEdge(graph: Array<ArrayList<Int>>, u: Int, v: Int) {
        //Function to add 2 edges in an undirected graph 
        graph[u].add(v)
        graph[v].add(u)
    }

    // Multisource BFS Function 
    fun Multisource_BFS(graph: Array<ArrayList<Int>>, q: LinkedList<Int>) {
        while (!q.isEmpty()) {
            val k = q.first
            q.pollFirst()
            for (i in graph[k]) {
                if (!visited[i]) {
                    // Pushing the adjacent unvisited vertices 
                    // with distance from current source = this 
                    // vertex's distance + 1 
                    q.push(i)
                    dist[i] = dist[k] + 1
                    visited[i] = true
                }
            }
        }
    }

    // This function calculates the distance of each 
    // vertex from nearest source 
    fun nearestTown(graph: Array<ArrayList<Int>>, n: Int, sources: IntArray, s: Int) {
        //Create a queue for BFS 
        val q = LinkedList<Int>()

        //Mark all the source vertices as visited and enqueue it 
        for (i in 0 until s) {
            q.push(sources[i])
            visited[sources[i]] = true
        }
        Multisource_BFS(graph, q)

        //Printing the distances 
        for (i in 1..n) {
            println(i.toString() + " " + dist[i])
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // Number of vertices 
        val n = 6
        val graph: Array<ArrayList<Int>> = Array(n+1){i->ArrayList<Int>() }

        Arrays.fill(graph, ArrayList<Any>())
        // Edges 
        addEdge(graph, 1, 2)
        addEdge(graph, 1, 6)
        addEdge(graph, 2, 6)
        addEdge(graph, 2, 3)
        addEdge(graph, 3, 6)
        addEdge(graph, 5, 4)
        addEdge(graph, 6, 5)
        addEdge(graph, 3, 4)
        addEdge(graph, 5, 3)

        // Sources 
        val sources = intArrayOf(1, 5)
        val S = sources.size
        nearestTown(graph, n, sources, S)
    }
}