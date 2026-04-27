import java.util.*

object Domino_DFS {
    @JvmStatic
    fun main(args: Array<String>) {
        val dominos: Int
        var caminos: Int
        var consultas: Int
        var desde: Int
        var hasta: Int
        var origen: Int
        dominos = sc.nextInt()
        caminos = sc.nextInt()
        consultas = sc.nextInt()
        for (i in 0 until dominos) {
            ady.add(ArrayList())
        }
        while (caminos > 0) {
            desde = sc.nextInt()
            hasta = sc.nextInt()
            ady[desde].add(hasta)
            caminos--
        }
        while (consultas > 0) {
            origen = sc.nextInt()
            total = 0
            Arrays.fill(visitados, false)
            DFS(origen)
            println("Total dominos tumbados: " + total)
            consultas--
        }
    }

    const val MAX = 10001
    var ady = ArrayList<ArrayList<Int>>()
    var sc = Scanner(System.`in`)
    var total = 0
    var visitados = BooleanArray(MAX)
    fun DFS(u: Int) {
        total++
        visitados[u] = true
        for (v in ady[u].indices) {
            if (!visitados[ady[u][v]]) {
                DFS(ady[u][v])
            }
        }
    }
}