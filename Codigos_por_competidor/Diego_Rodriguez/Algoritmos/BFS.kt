import java.util.*

object BFS {
    @JvmStatic
    fun main(args: Array<String>) {
        val g = Graph(4)
        g.addEdge(0, 1)
        g.addEdge(0, 2)
        g.addEdge(1, 2)
        g.addEdge(2, 0)
        g.addEdge(2, 3)
        g.addEdge(3, 3)
        println("Siguiendo su primera busqueda en anchura traverso " + "(iniciando desde el vertice 2)")
        g.BFS(2)
    }

    internal class Graph(private val V: Int) {
        private val adj: Array<LinkedList<Int>>
        fun addEdge(v: Int, w: Int) {
            adj[v].add(w)
        }

        fun BFS(s: Int) {
            var s = s
            val visited = BooleanArray(V)
            val queue = LinkedList<Int>()
            visited[s] = true
            queue.add(s)
            while (!queue.isEmpty()) {
                s = queue.poll()
                print("$s ")
                val i: Iterator<Int> = adj[s].listIterator()
                while (i.hasNext()) {
                    val n = i.next()
                    if (!visited[n]) {
                        visited[n] = true
                        queue.add(n)
                    }
                }
            }
        }

        // Constructor
        init {
            adj = Array(V){i->LinkedList<Int>()
            }
        }
    }
}