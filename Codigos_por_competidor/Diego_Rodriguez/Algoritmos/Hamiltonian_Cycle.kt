import java.util.*

object Hamiltonian_Cycle {
    const val V = 5
    lateinit var path: IntArray
    fun isSafe(v: Int, graph: Array<IntArray>, path: IntArray, pos: Int): Boolean {
        if (graph[path[pos - 1]][v] == 0) {
            return false
        }
        for (i in 0 until pos) {
            if (path[i] == v) {
                return false
            }
        }
        return true
    }

    fun hamCycleUtil(graph: Array<IntArray>, path: IntArray, pos: Int): Boolean {
        if (pos == V) {
            return graph[path[pos - 1]][path[0]] == 1
        }
        for (v in 1 until V) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v
                if (hamCycleUtil(graph, path, pos + 1) == true) {
                    return true
                }
                path[pos] = -1
            }
        }
        return false
    }

    fun printSolution(path: IntArray) {
        println("Solucion existente, este es uno de los ciclos hamiltonianos")
        for (i in 0 until V) {
            print(path[i].toString() + " ")
        }
        println("")
    }

    fun hamCycle(graph: Array<IntArray>): Int {
        path = IntArray(V)
        Arrays.fill(path, -1)
        path[0] = 0
        if (hamCycleUtil(graph, path, 1) == false) {
            println("No existe ciclo hamiltoniano")
            return 0
        }
        printSolution(path)
        return 1
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val graph = arrayOf(
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(1, 0, 1, 1, 1),
            intArrayOf(0, 1, 0, 0, 1),
            intArrayOf(1, 1, 0, 0, 1),
            intArrayOf(0, 1, 1, 1, 0)
        )
        hamCycle(graph)
        val graph2 = arrayOf(
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(1, 0, 1, 1, 1),
            intArrayOf(0, 1, 0, 0, 1),
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(0, 1, 1, 0, 0)
        )
        //Imprimir solución
        hamCycle(graph2)
    }
}