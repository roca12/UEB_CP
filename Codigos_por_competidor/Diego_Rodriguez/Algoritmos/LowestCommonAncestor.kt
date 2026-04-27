import java.util.*
import kotlin.collections.ArrayList

object LowestCommonAncestor {
    const val MAX = 100005 //Cantidad maxima de nodos
    const val LOG2 = 17 //log2(MAX)+1

    //ArrayList<edge> g[] = new ArrayList[MAX]; //Lista de adyacencia
    var g: Array<ArrayList<Int>> = Array(MAX){ i-> ArrayList<Int>() }

    //Lista de adyacencia
    var dep = IntArray(MAX) //Almacena la profundidad de cada nodo
    var par = Array(MAX) { IntArray(LOG2) } //Almacena los padres para responder las consultas

    //int rmq[][] = new int[MAX][LOG2]; //Almacena los pesos para responder las consultas
    var nodos = 0
    var aristas //Cantidad de nodos y aristas 
            = 0

    /*static class edge {
    int v, w; 
    
    edge(int _v, int _w){
        v = _v;
        w = _w;
    }
};*/
    fun lca(u: Int, v: Int): Int {
        //int ans = -1;
        var u = u
        var v = v
        if (dep[u] < dep[v]) {
            val aux = u
            u = v
            v = aux
        }
        val diff = dep[u] - dep[v]
        for (i in LOG2 - 1 downTo 0) {
            if (diff and (1 shl i) > 0) {
                //ans = Math.max(ans, rmq[u][i]);
                u = par[u][i]
            }
        }
        //if (u == v) return ans;
        if (u == v) {
            return u
        }
        for (i in LOG2 - 1 downTo 0) {
            if (par[u][i] != par[v][i]) {
                //ans = Math.max(ans, Math.max(rmq[u][i], rmq[v][i]));
                u = par[u][i]
                v = par[v][i]
            }
        }
        //return Math.max(ans, Math.max(rmq[u][0], rmq[v][0]));
        return par[u][0]
    }

    fun dfs(u: Int, p: Int, d: Int) {
        dep[u] = d
        par[u][0] = p
        for (v /* edge ed*/ in g[u]) {
            //int v = ed.v;
            if (v != p) {
                //rmq[v][0] = ed.w;
                dfs(v, u, d + 1)
            }
        }
    }

    fun build() {
        for (i in 0 until nodos) {
            dep[i] = -1
        }
        for (i in 0 until nodos) {
            if (dep[i] == -1) {
                //rmq[i][0] = -1;
                dfs(i, i, 0)
            }
        }
        for (j in 0 until LOG2 - 1) {
            for (i in 0 until nodos) {
                par[i][j + 1] = par[par[i][j]][j]
                //rmq[i][j+1] = Math.max(rmq[ par[i][j] ][j], rmq[i][j]);
            }
        }
    }

    fun init() {
        for (i in 0..nodos) {
            g[i] = ArrayList()
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        nodos = 5
        aristas = 4
        init()
        g[0].add(1)
        g[0].add(2)
        g[2].add(3)
        g[3].add(4)
        build()
        println(lca(2, 1))
    }
}