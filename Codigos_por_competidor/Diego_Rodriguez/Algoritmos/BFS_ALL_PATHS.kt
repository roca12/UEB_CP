import java.util.*
import kotlin.collections.ArrayList

object BFS_ALL_PATHS {
    @JvmStatic
    fun main(args: Array<String>) {
        initGraph(4)
        addEdge(0, 1)
        addEdge(0, 2)
        addEdge(0, 3)
        addEdge(2, 0)
        addEdge(2, 1)
        addEdge(1, 3)
        val inicio = 2
        val destino = 3
        println("los siguientes son todos los diferentes caminos desde $inicio a $destino")
        printAllPaths(inicio, destino)
    }

    var v = 0
    lateinit var adjlist: Array<ArrayList<Int>>
    fun initGraph(vertices: Int) {
        v = vertices
        initAdjList()
    }

    fun initAdjList() {
        // Constructor
            adjlist = Array(v){i->
                ArrayList()
            }

    }

    fun addEdge(u: Int, v: Int) {
        adjlist[u].add(v)
        //adjlist[v].add(u);
    }

    fun printAllPaths(s: Int, d: Int) {
        val isvisited = BooleanArray(v)
        val pathList = ArrayList<Int>()
        pathList.add(s)
        printAllPathsUtil(s, d, isvisited, pathList)
    }

    fun printAllPathsUtil(u: Int, d: Int, isvisited: BooleanArray, localPathList: MutableList<Int>) {
        isvisited[u] = true
        if (u == d) {
            println(localPathList)
            isvisited[u] = false
            return
        }
        for (i in adjlist[u]) {
            if (!isvisited[i]) {
                localPathList.add(i)
                printAllPathsUtil(i, d, isvisited, localPathList)
                localPathList.remove(i)
            }
        }
        isvisited[u] = false
    }
}