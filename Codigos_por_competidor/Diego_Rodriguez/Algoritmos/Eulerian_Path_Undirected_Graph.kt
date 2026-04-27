import java.util.*

object Eulerian_Path_Undirected_Graph {
    @JvmStatic
    fun main(args: Array<String>) {
        // Creamos varios ejemplos de grafos para probar
        val g1 = Graph(5)
        g1.addEdge(1, 0)
        g1.addEdge(0, 2)
        g1.addEdge(2, 1)
        g1.addEdge(0, 3)
        g1.addEdge(3, 4)
        g1.test()
        val g2 = Graph(5)
        g2.addEdge(1, 0)
        g2.addEdge(0, 2)
        g2.addEdge(2, 1)
        g2.addEdge(0, 3)
        g2.addEdge(3, 4)
        g2.addEdge(4, 0)
        g2.test()
        val g3 = Graph(5)
        g3.addEdge(1, 0)
        g3.addEdge(0, 2)
        g3.addEdge(2, 1)
        g3.addEdge(0, 3)
        g3.addEdge(3, 4)
        g3.addEdge(1, 3)
        g3.test()
        /* Crearemos un grafo con tres vertices
        conectados en forma de ciclo*/
        val g4 = Graph(3)
        g4.addEdge(0, 1)
        g4.addEdge(1, 2)
        g4.addEdge(2, 0)
        g4.test()
        /* Creamos un grafo con vertices con grado cero*/
        val g5 = Graph(3)
        g5.test()
    }

    internal class Graph(var V: Int) {
        var adj: Array<LinkedList<Int>>

        //Agregar caminos
        fun addEdge(v: Int, w: Int) {
            adj[v].add(w)
            adj[w].add(v) //El grafo es no dirigido
        }

        fun DFSUtil(v: Int, visited: BooleanArray) {
            visited[v] = true
            val i: Iterator<Int> = adj[v].listIterator()
            while (i.hasNext()) {
                val n = i.next()
                if (!visited[n]) {
                    DFSUtil(n, visited)
                }
            }
        }

        //Si no hay caminos en el grafo, retorna true
        val isConnected: Boolean
            get() {
                val visited = BooleanArray(V)
                var i: Int
                i = 0
                while (i < V) {
                    visited[i] = false
                    i++
                }
                i = 0
                while (i < V) {
                    if (!adj[i].isEmpty()) {
                        break
                    }
                    i++
                }
                //Si no hay caminos en el grafo, retorna true
                if (i == V) {
                    return true
                }
                DFSUtil(i, visited)
                i = 0
                while (i < V) {
                    if (visited[i] == false && adj[i].size > 0) {
                        return false
                    }
                    i++
                }
                return true
            }

        // Cuenta vertices con grado impar 
        // Si cuenta es más de 2, el grafo no es euleriano
        //si odd es 2, es semieuleriano
        //Si odd es 0, es euleriano 
        val isEulerian: Int
            get() {
                if (isConnected == false) {
                    return 0
                }
                // Cuenta vertices con grado impar 
                var odd = 0
                for (i in 0 until V) {
                    if (adj[i].size % 2 != 0) {
                        odd++
                    }
                }
                // Si cuenta es más de 2, el grafo no es euleriano
                if (odd > 2) {
                    return 0
                }
                //si odd es 2, es semieuleriano
                //Si odd es 0, es euleriano 
                return if (odd == 2) 1 else 2
            }

        fun test() {
            val res = isEulerian
            when (res) {
                0 -> println("Grafo no es Euleriano")
                1 -> println("Grafo tiene un camino de Euler")
                else -> println("Grafo tiene ciclo de euler")
            }
        }

        // Constructor 
        // Constructor
        init {
            adj = Array(V){i->LinkedList<Int>()
            }
        }
    }
}