import java.util.*

object Cycle_In_A_Directed_Graph {
    @JvmStatic
    fun main(args: Array<String>) {
        val graph = Graph(4)
        graph.addEdge(0, 1)
        graph.addEdge(0, 2)
        graph.addEdge(1, 2)
        graph.addEdge(2, 0)
        graph.addEdge(2, 3)
        graph.addEdge(3, 3)
        if (graph.isCyclic) {
            println("El grafo contiene un ciclo")
        } else {
            println(
                "El grafo no contiene"
                        + " un ciclo"
            )
        }
    }

    internal class Graph(var V: Int) {
        var adj: MutableList<MutableList<Int>>
        fun addEdge(source: Int, dest: Int) {
            adj[source].add(dest)
        }

        fun isCycliUtil(i: Int, visited: BooleanArray, recStack: BooleanArray): Boolean {
            if (recStack[i]) {
                return true
            }
            if (visited[i]) {
                return false
            }
            visited[i] = true
            recStack[i] = true
            val children: List<Int> = adj[i]
            if (children.stream().anyMatch { c: Int -> isCycliUtil(c, visited, recStack) }) {
                return true
            }
            recStack[i] = false
            return false
        }

        val isCyclic: Boolean
            get() {
                val visited = BooleanArray(V)
                val recStack = BooleanArray(V)
                for (i in 0 until V) {
                    if (isCycliUtil(i, visited, recStack)) {
                        return true
                    }
                }
                return false
            }

        init {
            adj = ArrayList(V)
            for (i in 0 until V) {
                adj.add(LinkedList())
            }
        }
    }
}