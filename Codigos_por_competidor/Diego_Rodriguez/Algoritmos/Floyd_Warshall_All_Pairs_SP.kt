import java.util.*

object Floyd_Warshall_All_Pairs_SP {
    var INF = 9999
    var V = 0

    //grafo en matriz fija
    lateinit var graph: Array<IntArray>

    //matriz que almacena el camino recorrido
    lateinit var next: Array<IntArray>
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        V = sc.nextInt()
        graph = Array(V) { IntArray(V) }
        next = Array(V) { IntArray(V) }
        val E = sc.nextInt()
        //Inicializa todo en infinito
        for (i in 0 until V) {
            for (j in 0 until V) {
                graph[i][j] = INF
            }
        }

        // De un nodo al mismo nodo es 0
        for (i in 0 until V) {
            graph[i][i] = 0
        }
        for (i in 0 until E) {
            graph[sc.nextInt()][sc.nextInt()] = sc.nextInt()
        }
        floydWarshall(graph)
        val path: ArrayList<Int>
        println("El camino mas corto desde 0 a 3: ")
        //Construit camino
        path = constructPath(0, 3)
        //imprimir camino
        printPath(path)
    }

    fun floydWarshall(graph: Array<IntArray>) {
        val dist = Array(V) { IntArray(V) }
        var i: Int
        var j: Int
        var k: Int
        /*Inicialice la matriz de solución igual que 
            la matriz del gráfico de entrada. O podemos 
            decir que los valores iniciales de las distancias 
            más cortas se basan en las rutas más cortas, 
            considerando que no hay vértice intermedio. */i = 0
        while (i < V) {
            j = 0
            while (j < V) {
                dist[i][j] = graph[i][j]
                // Si no hay camino entre i y j
                if (graph[i][j] == INF) {
                    next[i][j] = -1
                } else {
                    next[i][j] = j
                }
                j++
            }
            i++
        }

        /*Agregue todos los vértices uno por uno al conjunto 
            de vértices intermedios.
            ---> Antes del inicio de una iteración, tenemos 
            distancias más cortas entre todos los pares de vértices, 
            de modo que las distancias más cortas consideran solo
            los vértices en el conjunto {0, 1, 2, .. k-1} como 
            vértices intermedios.
            ----> Después del final de una iteración, el vértice 
            número k se agrega al conjunto de vértices intermedios 
            y el conjunto se convierte en {0, 1, 2, ... k} */k = 0
        while (k < V) {

            //Toma todos los vertices como inicio uno por uno
            i = 0
            while (i < V) {

                /* Toma todos los vertices como destino del
                    incio del origen seleccionado*/j = 0
                while (j < V) {

                    // Si vertice k esa en el camino más corto
                    // desde i a j, actualiza el valor de dist[i][j]
                    // No podemos viajar por un camino si no existe
                    if (dist[i][k] == INF || dist[k][j] == INF) {
                        j++
                        continue
                    }
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j]
                        next[i][j] = next[i][k]
                    }
                    j++
                }
                i++
            }
            k++
        }
        //Imprime la matriz de distancias cortas
        printSolution(dist)
    }

    fun constructPath(u: Int, v: Int): ArrayList<Int> {
        // si no hay camino devuelve una lista vacia
        var u = u
        if (next[u][v] == -1) {
            return ArrayList()
        }
        // Almacenando el camino en el vector
        val path = ArrayList<Int>()
        path.add(u)
        while (u != v) {
            u = next[u][v]
            path.add(u)
        }
        return path
    }

    fun printPath(path: ArrayList<Int>) {
        val n = path.size
        for (i in 0 until n - 1) {
            print(path[i].toString() + " -> ")
        }
        println(path[n - 1])
    }

    fun printSolution(dist: Array<IntArray>) {
        println(
            "La siguiente matriz muestra las distancias "
                    + "más cortas entre cada par de vertices"
        )
        for (i in 0 until V) {
            for (j in 0 until V) {
                if (dist[i][j] == INF) {
                    print("INF ")
                } else {
                    print(dist[i][j].toString() + " ")
                }
            }
            println()
        }
    }
}