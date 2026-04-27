import kotlin.jvm.JvmStatic
import java.util.*

object Matriz_De_Adyacencia {
    lateinit var G: Array<IntArray>
    var sc = Scanner(System.`in`)
    @JvmStatic
    fun main(args: Array<String>) {
        val Vertices: Int
        val Caminos: Int
        Vertices = sc.nextInt()
        Caminos = sc.nextInt()
        G = Array(Vertices) { IntArray(Vertices) }
        for (i in 0 until Vertices) {
            Arrays.fill(G[i], Int.MAX_VALUE)
        }
        for (i in 0 until Vertices) {
            G[i][i] = 0
        }
        for (i in 0 until Caminos) {
            var desde: Int
            var hasta: Int
            var peso: Int
            desde = sc.nextInt()
            hasta = sc.nextInt()
            peso = sc.nextInt()
            // Grafo dirigido
            G[desde][hasta] = peso
            // Complementar con la siguiente linea para no dirigido
            G[hasta][desde] = peso
        }
        for (i in 0 until Vertices) {
            for (j in 0 until Vertices) {
                if (G[i][j] == Int.MAX_VALUE) {
                    print("inf" + "\t")
                } else {
                    print(G[i][j].toString() + "\t")
                }
            }
            println()
        }
    }
}