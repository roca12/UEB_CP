import kotlin.jvm.JvmStatic
import java.util.*

object TestCasesWeightedDirectedGraph {
    // Define the number of runs for the test data 
    // generated 
    var RUN = 5

    // Define the maximum number of vertices of the graph 
    var MAX_VERTICES = 20

    // Define the maximum number of edges 
    var MAX_EDGES = 20
    var MAXWEIGHT = 200
    fun getIndex(set: Set<Pair>, value: Pair): Int {
        var result = 0
        for (entry in set) {
            if (entry == value) {
                return result
            }
            result++
        }
        return set.size + 1
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val container: MutableSet<Pair> = HashSet()
        //For random values every time 
        val r = Random()
        var VERTICES: Int // Number of Vertices 
        var NUMEDGE: Int // Number of Edges 
        for (i in 1..RUN) {
            VERTICES = 1 + r.nextInt(MAX_VERTICES)
            // Define the maximum number of edges of the graph 
            // Since the most dense graph can have N*(N-1)/2 edges 
            // where N = nnumber of vertices in the graph 
            NUMEDGE = 1 + r.nextInt(MAX_EDGES)
            while (NUMEDGE > VERTICES * (VERTICES - 1) / 2) {
                NUMEDGE = 1 + r.nextInt(MAX_EDGES)
            }
            // First print the number of vertices and edges 
            System.out.printf("%d %d\n", VERTICES, NUMEDGE)
            // Then print the edges of the form (a b) 
            // where 'a' is connected to 'b' 
            for (j in 1..NUMEDGE) {
                var a = 1 + r.nextInt(VERTICES)
                var b = 1 + r.nextInt(VERTICES)
                var p = Pair(a, b)
                // Search for a random "new" edge everytime 
                // Note - In a tree the edge (a, b) is same 
                // as the edge (b, a) 
                while (getIndex(container, p) != container.size + 1) {
                    a = 1 + r.nextInt(VERTICES)
                    b = 1 + r.nextInt(VERTICES)
                    p = Pair(a, b)
                }
                container.add(p)
            }
            for (p in container) {
                val wt = 1 + r.nextInt(MAXWEIGHT)
                System.out.printf("%d %d %d\n", p.first - 1, p.second - 1, wt)
            }
            container.clear()
            System.out.printf("\n")
        }
    }

    class Pair(var first: Int, var second: Int)
}