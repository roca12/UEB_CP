import java.util.*

object Lista_De_Adyacencia {
    lateinit var G: Array<Vertex?>
    var sc = Scanner(System.`in`)
    @JvmStatic
    fun main(args: Array<String>) {
        val V: Int
        val E: Int
        V = sc.nextInt()
        E = sc.nextInt()
        G = arrayOfNulls(V)
        for (i in 0 until V) {
            G[i] = Vertex()
            G[i]!!.adj = ArrayList()
        }
        for (i in 0 until E) {
            var desde: Int
            var hasta: Int
            var peso: Int
            desde = sc.nextInt()
            hasta = sc.nextInt()
            peso = sc.nextInt()
            G[desde]!!.adj.add(Edge(hasta, peso))
            G[hasta]!!.adj.add(Edge(desde, peso))
        }
        for (i in G.indices) {
            print("$i-> ")
            for (e in G[i]!!.adj) {
                print(e.to.toString() + " " + e.w + "|")
            }
            println()
        }
    }

    class Vertex {
        var adj: MutableList<Edge>

        init {
            adj = ArrayList()
        }
    }

    class Edge(var to: Int, var w: Int)
}