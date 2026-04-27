import kotlin.jvm.JvmStatic

// in a multistage graph. 
object MultiStageGraphSP {
    var N = 8
    var INF = Int.MAX_VALUE

    // Returns shortest distance from 0 to 
    // N-1. 
    fun shortestDist(graph: Array<IntArray>): Int {

        // dist[i] is going to store shortest 
        // distance from node i to node N-1. 
        val dist = IntArray(N)
        dist[N - 1] = 0

        // Calculating shortest path for 
        // rest of the nodes 
        for (i in N - 2 downTo 0) {

            // Initialize distance from i to 
            // destination (N-1) 
            dist[i] = INF

            // Check all nodes of next stages 
            // to find shortest distance from 
            // i to N-1. 
            for (j in i until N) {
                // Reject if no edge exists 
                if (graph[i][j] == INF) {
                    continue
                }

                // We apply recursive equation to 
                // distance to target through j. 
                // and compare with minimum distance 
                // so far. 
                dist[i] = Math.min(
                    dist[i], graph[i][j]
                            + dist[j]
                )
            }
        }
        return dist[0]
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        // Graph stored in the form of an 
        // adjacency Matrix 
        val graph = arrayOf(
            intArrayOf(INF, 1, 2, 5, INF, INF, INF, INF),
            intArrayOf(INF, INF, INF, INF, 4, 11, INF, INF),
            intArrayOf(
                INF, INF, INF, INF, 9, 5, 16, INF
            ),
            intArrayOf(INF, INF, INF, INF, INF, INF, 2, INF),
            intArrayOf(INF, INF, INF, INF, INF, INF, INF, 18),
            intArrayOf(
                INF, INF, INF, INF, INF, INF, INF, 13
            ),
            intArrayOf(INF, INF, INF, INF, INF, INF, INF, 2)
        )
        println(shortestDist(graph))
    }
}