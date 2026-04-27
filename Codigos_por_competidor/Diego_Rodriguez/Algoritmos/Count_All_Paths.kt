import java.util.*

object Count_All_Paths {
    @JvmStatic
    fun main(args: Array<String>) {
        val g = Graph(4)
        g.addEdge(0, 1)
        g.addEdge(0, 2)
        g.addEdge(0, 3)
        g.addEdge(2, 1)
        g.addEdge(2, 3)
        g.addEdge(1, 3)
        val s = 0
        val d = 3
        println(g.countPaths(s, d))
    }

    internal class Graph(var V: Int) {
        var adj: Array<LinkedList<Int>>
        fun addEdge(v: Int, w: Int) {
            adj[v].add(w)
        }

        fun countPathsUtil(u: Int, d: Int, visited: BooleanArray, pathCount: Int): Int {
            var pathCount = pathCount
            visited[u] = true
            if (u == d) {
                pathCount++
            } else {
                val i: Iterator<Int> = adj[u].listIterator()
                while (i.hasNext()) {
                    val n = i.next()
                    if (!visited[n]) {
                        pathCount = countPathsUtil(n, d, visited, pathCount)
                    }
                }
            }
            visited[u] = false
            return pathCount
        }

        fun countPaths(s: Int, d: Int): Int {
            val visited = BooleanArray(V)
            Arrays.fill(visited, false)
            var pathCount = 0
            pathCount = countPathsUtil(s, d, visited, pathCount)
            return pathCount
        }

        // Constructor
        init {
            adj = Array(V){i->LinkedList<Int>()
            }
        }
    }
}