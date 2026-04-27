import java.util.*

object Kruskal_Minimum_Spanning_Tree {
    const val MAX = 1005
    var padre = IntArray(MAX)
    fun makeSet(n: Int) {
        for (i in 0..n) {
            padre[i] = i
        }
    }

    fun find(x: Int): Int {
        return if (x == padre[x]) x else find(
            padre[x]
        ).also { padre[x] = it }
    }

    fun union(x: Int, y: Int) {
        padre[find(x)] = find(y)
    }

    fun sameComponent(x: Int, y: Int): Boolean {
        return if (find(x) == find(y)) {
            true
        } else false
    }

    var V = 0
    var E = 0
    var aristas = arrayOfNulls<Edge>(MAX)
    var MST = arrayOfNulls<Edge>(MAX)
    fun kruskalMST() {
        var origen: Int
        var destino: Int
        var peso: Int
        var total = 0
        var numAristas = 0
        makeSet(V)
        Arrays.sort(aristas, 0, E)
        for (i in 0 until E) {
            origen = aristas[i]!!.origen
            destino = aristas[i]!!.destino
            peso = aristas[i]!!.peso
            if (!sameComponent(origen, destino)) {
                total += peso
                MST[numAristas++] = aristas[i]
                union(origen, destino)
            }
        }
        if (V - 1 != numAristas) {
            println("No existe MST valido para el grafo ingresado, este debe ser conexo")
            return
        }
        println("El MST enconstrado contiene las siguientes aristas: ")
        for (i in 0 until numAristas) {
            System.out.printf("(%d, %d): %d\n", MST[i]!!.origen, MST[i]!!.destino, MST[i]!!.peso)
        }
        println("El costo minimo de todas las aristas del MST es: $total")
    }

    //Manejo de grafos no dirigidos   
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        V = sc.nextInt()
        E = sc.nextInt()
        for (i in 0 until E) {
            aristas[i] = Edge()
            aristas[i]!!.origen = sc.nextInt()
            aristas[i]!!.destino = sc.nextInt()
            aristas[i]!!.peso = sc.nextInt()
        }
        kruskalMST()
    }

    class Edge : Comparator<Edge> {
        var origen = 0
        var destino = 0
        var peso = 0
        override fun compare(t: Edge, t1: Edge): Int {
            return t.peso - t1.peso
        }
    }
}