import java.util.*

object DFS {
    var sc = Scanner(System.`in`)
    @JvmStatic
    fun main(args: Array<String>) {
        val g = Graph(4)
        g.addEdge(0, 1)
        g.addEdge(0, 2)
        g.addEdge(1, 2)
        g.addEdge(2, 0)
        g.addEdge(2, 3)
        g.addEdge(3, 3)
        val inicial = 1
        println("Siguiendo la DFS desde el nodo $inicial")
        g.DFS(inicial)
    }

    internal class Graph(  //nodos
        var V: Int
    ) {
        var adj: Array<LinkedList<Int>>
        fun addEdge(v: Int, w: Int) {
            adj[v].add(w)
        }

        fun DFSUtil(v: Int, visited: BooleanArray) {
            visited[v] = true
            print("$v ")
            val i: Iterator<Int> = adj[v].listIterator()
            while (i.hasNext()) {
                val n = i.next()
                if (!visited[n]) {
                    DFSUtil(n, visited)
                }
            }
        }

        fun DFS(v: Int) {
            val visited = BooleanArray(V)
            DFSUtil(v, visited)
        }

        // Constructor
        init {
            adj = Array(V){i->LinkedList<Int>()
            }
        }
    }
}