import java.util.*

object EdmondsKarpMaxFlow {
    @JvmStatic
    fun main(args: Array<String>) {
        val nodes = 4
        val edges = 5
        val source = 0
        val sink = nodes - 1
        val graph = arrayOfNulls<Node>(nodes)

        // Initialize each node
        for (i in 0 until nodes) {
            graph[i] = Node()
        }

        // Initialize each edge
        /*0 1 1000
        1 2 1
        0 2 1000
        1 3 1000
        2 3 1000*/
        val sc = Scanner(System.`in`)
        for (i in 0 until edges) {
            val u = sc.nextInt()
            val v = sc.nextInt()
            val c = sc.nextInt()

            // Note edge "b" is not actually in the input graph
            // It is a construct that allows us to solve the problem
            val a = Edge(u, v, 0, c)
            val b = Edge(v, u, 0, 0)

            // Set pointer from each edge "a" to
            // its reverse edge "b" and vice versa
            a.setReverse(b)
            b.setReverse(a)
            graph[u]!!.edges.add(a)
            graph[v]!!.edges.add(b)
        }
        var maxFlow = 0
        while (true) {
            // Parent array used for storing path
            // (parent[i] stores edge used to get to node i)
            val parent = arrayOfNulls<Edge>(nodes)
            val q = ArrayList<Node?>()
            q.add(graph[source])

            // BFS finding shortest augmenting path
            while (!q.isEmpty()) {
                val curr = q.removeAt(0)

                // Checks that edge has not yet been visited, and it doesn't
                // point to the source, and it is possible to send flow through it. 
                for (e in curr!!.edges) {
                    if (parent[e.v] == null && e.v != source && e.capacity > e.flow) {
                        parent[e.v] = e
                        q.add(graph[e.v])
                    }
                }
            }

            // If sink was NOT reached, no augmenting path was found.
            // Algorithm terminates and prints out max flow.
            if (parent[sink] == null) {
                break
            }

            // If sink WAS reached, we will push more flow through the path
            var pushFlow = Int.MAX_VALUE

            // Finds maximum flow that can be pushed through given path
            // by finding the minimum residual flow of every edge in the path
            run {
                var e = parent[sink]
                while (e != null) {
                    pushFlow = Math.min(pushFlow, e!!.capacity - e!!.flow)
                    e = parent[e!!.u]
                }
            }

            // Adds to flow values and subtracts from reverse flow values in path
            var e = parent[sink]
            while (e != null) {
                e!!.flow += pushFlow
                e!!.reverse!!.flow -= pushFlow
                e = parent[e!!.u]
            }
            maxFlow += pushFlow
        }
        println("Max Flow: $maxFlow")
    }

    // No explicit constructor is necessary :P
    internal class Node {
        // List of edges also includes reverse edges that
        // are not in original given graph (for push-back flow)
        var edges = ArrayList<Edge>()
    }

    internal class Edge(var u: Int, var v: Int, var flow: Int, var capacity: Int) {
        var reverse: Edge? = null
        @JvmName("setReverse1")
        fun setReverse(e: Edge?) {
            reverse = e
        }
    }
}