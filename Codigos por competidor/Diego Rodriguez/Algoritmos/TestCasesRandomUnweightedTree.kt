import kotlin.jvm.JvmStatic
import java.util.*
import kotlin.collections.ArrayList

object TestCasesRandomUnweightedTree {
    // Define the number of runs for the test data 
    // generated 
    var RUN = 5

    // Define the maximum number of nodes of the tree 
    var MAXNODE = 20

    //array containing adjacency lists
    var adj: Array<ArrayList<Int>> =   Array(200){i->
        ArrayList<Int>()
        }

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
        val container = HashSet<Pair>()
        //For random values every time 
        val r = Random()
        Arrays.fill(adj, ArrayList<Any>())
        var NUM: Int // Number of Vertices/Nodes 
        for (i in 1..RUN) {
            NUM = 1 + r.nextInt(MAXNODE)
            // First print the number of vertices/nodes 
            System.out.printf("%d\n", NUM)
            val t = Tree()
            t.V = NUM
            // Then print the edges of the form (a b) 
            // where 'a' is parent of 'b' 
            for (j in 1..NUM - 1) {
                var a = r.nextInt(NUM)
                var b = r.nextInt(NUM)
                var p = Pair(a, b)
                t.addEdge(a, b)
                // Search for a random "new" edge everytime 
                while (getIndex(container, p) != container.size + 1 || t.isCyclic == true) {
                    t.removeEdge(a, b)
                    a = r.nextInt(NUM)
                    b = r.nextInt(NUM)
                    p = Pair(a, b)
                    t.addEdge(a, b)
                }
                container.add(p)
            }
            for (p in container) {
                System.out.printf("%d %d\n", p.first, p.second)
            }
            container.clear()
            System.out.printf("\n")
        }
    }

    internal class Tree {
        var V // No. of vertices 
                = 0

        // used by isCyclic() 
        fun isCyclicUtil(v: Int, visited: BooleanArray, recStack: BooleanArray): Boolean {
            if (visited[v] == false) {
                // Mark the current node as visited and part of 
                // recursion stack 
                visited[v] = true
                recStack[v] = true
                // Recur for all the vertices adjacent to this vertex 
                val it: Iterator<Int> = adj[v].iterator()
                while (it.hasNext()) {
                    val aux = it.next()
                    if (!visited[aux] && isCyclicUtil(aux, visited, recStack)) {
                        return true
                    } else if (recStack[aux]) {
                        return true
                    }
                }
            }
            recStack[v] = false // remove the vertex from recursion stack 
            return false
        }

        // adds an edge 
        fun addEdge(v: Int, w: Int) {
            adj[v].add(w) // Add w to v’s list. 
        }

        // removes an edge 
        fun removeEdge(v: Int, w: Int) {
            val it: Iterator<Int> = adj[v].iterator()
            while (it.hasNext()) {
                val aux = it.next()
                if (aux == w) {
                    adj[v].removeAt(adj[v].indexOf(aux))
                    break
                }
            }
            return
        }// Mark all the vertices as not visited and not part of recursion 

        // stack 
        // Call the recursive helper function to detect cycle in different 
        // DFS trees 
        // returns true if there is a cycle in this graph 
        val isCyclic: Boolean
            get() {
                // Mark all the vertices as not visited and not part of recursion 
                // stack 
                val visited = BooleanArray(V)
                val recStack = BooleanArray(V)
                for (i in 0 until V) {
                    visited[i] = false
                    recStack[i] = false
                }
                // Call the recursive helper function to detect cycle in different 
                // DFS trees 
                for (i in 0 until V) {
                    if (isCyclicUtil(i, visited, recStack)) {
                        return true
                    }
                }
                return false
            }
    }

    class Pair(var first: Int, var second: Int)
}