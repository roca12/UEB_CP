import java.util.*

object Bipartite_Graph {
    const val V = 4
    fun isBipartite(G: Array<IntArray>, src: Int): Boolean {
        val colorArr = IntArray(V)
        Arrays.fill(colorArr, -1)
        colorArr[src] = 1
        val q = LinkedList<Int>()
        q.add(src)
        while (!q.isEmpty()) {
            val u = q.poll()
            if (G[u][u] == 1) {
                return false
            }
            for (v in 0 until V) {
                if (G[u][v] == 1 && colorArr[v] == -1) {
                    colorArr[v] = 1 - colorArr[u]
                    q.add(v)
                } else if (G[u][v] == 1 && colorArr[v] == colorArr[u]) {
                    return false
                }
            }
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val G = arrayOf(intArrayOf(0, 1, 0, 1), intArrayOf(1, 0, 1, 0), intArrayOf(0, 1, 0, 1), intArrayOf(1, 0, 1, 0))
        if (isBipartite(G, 0)) {
            println("Es bipartito")
        } else {
            println("No es bipartito")
        }
    }
}