import java.util.*

object Eulerian_Cycle_Directed_Graph {
    @JvmStatic
    fun main(args: Array<String>) {
        val g = Graph(5)
        g.addEdge(1, 0)
        g.addEdge(0, 2)
        g.addEdge(2, 1)
        g.addEdge(0, 3)
        g.addEdge(3, 4)
        g.addEdge(4, 0)
        if (g.isEulerian) {
            println("El grafo es euleriano")
        } else {
            println("El grafo dado no es euleriano")
        }
    }

    internal class Graph(var V: Int) {
        var adj: Array<LinkedList<Int>>
        var `in`: IntArray
        fun addEdge(source: Int, destiny: Int) {
            adj[source].add(destiny)
            `in`[destiny]++
        }

        fun DFSUtil(v: Int, visited: BooleanArray) {
            visited[v] = true
            var n: Int
            for (i in adj[v].indices) {
                n = adj[v][i]
                if (!visited[n]) {
                    DFSUtil(n, visited)
                }
            }
        }

        val transpose: Graph
            get() {
                val g = Graph(V)
                for (v in 0 until V) {
                    val i: Iterator<Int> = adj[v].listIterator()
                    while (i.hasNext()) {
                        g.adj[i.next()].add(v)
                        g.`in`[v]++
                    }
                }
                return g
            }
        val isSC: Boolean
            get() {
                val visited = BooleanArray(V)
                Arrays.fill(visited, false)
                DFSUtil(0, visited)
                for (i in 0 until V) {
                    if (visited[i] == false) {
                        return false
                    }
                }
                val gr = transpose
                Arrays.fill(visited, false)
                gr.DFSUtil(0, visited)
                for (i in 0 until V) {
                    if (visited[i] == false) {
                        return false
                    }
                }
                return true
            }
        val isEulerian: Boolean
            get() {
                if (isSC == false) {
                    return false
                }
                for (i in 0 until V) {
                    if (adj[i].size != `in`[i]) {
                        return false
                    }
                }
                return true
            }

        init {
            // Constructor
            adj = Array(V){i->LinkedList<Int>()
            }
            `in` = IntArray(V)
            for (i in 0 until V) {
                `in`[i] = 0
            }
        }
    }
}