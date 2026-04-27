import java.util.*

object BellmandFord_SP {
    var sc = Scanner(System.`in`)
    const val MAX = 105
    var INF = 1 shl 30
    var previo = IntArray(MAX)
    var distancia = IntArray(MAX)
    var vertices = 0
    var adyacencia: MutableList<MutableList<Camino>> = ArrayList()

    //inicializacion de variables de acuerdo al numero de vertices
    fun init() {
        for (i in 0..vertices) {
            distancia[i] = INF
            previo[i] = -1
        }
    }

    //impresion de caminos
    fun printPath(destino: Int) {
        if (previo[destino] != -1) {
            printPath(previo[destino])
        }
        System.out.printf("%d ", destino)
    }

    //verificacion de los caminos mas cortos haciendo uso de funcion de relajacion
    fun relajacion(actual: Int, adyacente: Int, peso: Int): Boolean {
        if (distancia[actual] + peso < distancia[adyacente]) {
            distancia[adyacente] = distancia[actual] + peso
            previo[adyacente] = actual
            return true
        }
        return false
    }

    fun bellmandFord(inicial: Int) {
        init()
        distancia[inicial] = 0
        //verificacion de todos los caminos
        for (i in 0 until vertices) {
            for (actual in 0 until vertices) {
                for (j in adyacencia[actual].indices) {
                    val adyacente = adyacencia[actual][j].destino
                    val peso = adyacencia[actual][j].peso
                    relajacion(actual, adyacente, peso)
                }
            }
        }
        //verificacion de ciclo negativo
        for (actual in 0 until vertices) {
            for (j in adyacencia[actual].indices) {
                val adyacente = adyacencia[actual][j].destino
                val peso = adyacencia[actual][j].peso
                if (relajacion(actual, adyacente, peso)) {
                    println("Existe ciclo negativo")
                    return
                }
            }
        }
        println("No existe ciclo negativo")
        println("Distancias más cortas desde el nodo $inicial")
        for (i in 0..vertices) {
            System.out.printf("nodo %d, distancia mas corta = %d\n", i, distancia[i])
        }
        println("Camino más corto hasta un destino:")
        val destino = sc.nextInt()
        printPath(destino)
        println("")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val E: Int
        var origen: Int
        var destino: Int
        var peso: Int
        val inicial: Int
        vertices = sc.nextInt()
        E = sc.nextInt()
        for (i in 0..vertices) {
            adyacencia.add(ArrayList())
        }
        for (i in 0 until E) {
            origen = sc.nextInt()
            destino = sc.nextInt()
            peso = sc.nextInt()
            adyacencia[origen].add(Camino(destino, peso)) //dirigido
            adyacencia[destino].add(Camino(origen, peso)) // no dirigido
        }
        println("Nodo incial:")
        inicial = sc.nextInt()
        bellmandFord(inicial)
    }

    //estructura camino
    class Camino(var destino: Int, var peso: Int)
}