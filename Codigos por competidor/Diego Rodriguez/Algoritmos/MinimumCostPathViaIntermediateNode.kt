import java.util.*
import kotlin.collections.ArrayList
import kotlin.jvm.JvmStatic

object MinimumCostPathViaIntermediateNode {
    var MAXN = 100005

    // to strore maped values of graph 
    var v: Array<ArrayList<Pair>> =  Array(MAXN){ i->
                ArrayList()
            }

    // to store distance of 
    // all nodes from the source node 
    var dist = IntArray(MAXN)
    fun dijkstra(source: Int, n: Int) {
        // set all the vertices 
        // distances as infinity 
        for (i in 0 until n) {
            dist[i] = Int.MAX_VALUE
        }
        // set all vertex as unvisited 
        val vis = BooleanArray(n)
        // make distance from source 
        // vertex to source vertex is zero 
        dist[source] = 0
        // // multiset do the job 
        // as a min-priority queue 
        val s = PriorityQueue<Pair>()
        // insert the source node with distance = 0 
        s.add(Pair(0, source))
        while (!s.isEmpty()) {
            val p = s.peek()
            // pop the vertex with the minimum distance 
            s.poll()
            val x = p.second
            val wei = p.first
            // check if the popped vertex 
            // is visited before 
            if (vis[x]) {
                continue
            }
            vis[x] = true
            for (i in v[x].indices) {
                val e = v[x][i].first
                val w = v[x][i].second

                // check if the next vertex 
                // distance could be minimized 
                if (dist[x] + w < dist[e]) {
                    dist[e] = dist[x] + w

                    // insert the next vertex 
                    // with the updated distance 
                    s.add(Pair(dist[e], e))
                }
            }
        }
    }

    // function to add edges in graph 
    fun add_edge(s: Int, t: Int, weight: Int) {
        v[s].add(Pair(t, weight))
        v[t].add(Pair(s, weight))
    }

    // function to find the minimum shortest path 
    fun solve(
        source: Int, destination: Int,
        intermediate: Int, n: Int
    ): Int {
        var ans = Int.MAX_VALUE
        dijkstra(source, n)
        // store distance from source to 
        // all other vertices 
        val dsource = IntArray(n)
        for (i in 0 until n) {
            dsource[i] = dist[i]
        }
        dijkstra(destination, n)
        // store distance from destination 
        // to all other vertices 
        val ddestination = IntArray(n)
        for (i in 0 until n) {
            ddestination[i] = dist[i]
        }
        dijkstra(intermediate, n)
        // store distance from intermediate 
        // to all other vertices 
        val dintermediate = IntArray(n)
        for (i in 0 until n) {
            dintermediate[i] = dist[i]
        }

        // find required answer 
        for (i in 0 until n) {
            ans = Math.min(
                ans, dsource[i] + ddestination[i]
                        + dintermediate[i]
            )
        }
        return ans
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 4
        for (i in 0 until n) {
            v[i] = ArrayList()
        }
        val source = 0
        val destination = 2
        val intermediate = 3
        // add edges in graph 
        add_edge(0, 1, 1)
        add_edge(1, 2, 2)
        add_edge(1, 3, 3)
        // function call for minimum shortest path 
        println(solve(source, destination, intermediate, n))
    }

    // Dijkstra's algorithm to find 
    // shortest path from source to node 
    class Pair(var first: Int, var second: Int) : Comparable<Pair> {
        override fun compareTo(o: Pair): Int {
            if (first < o.first) {
                return 1
            } else if (first > o.first) {
                return -1
            }
            return 0
        }
    }
}