import kotlin.jvm.JvmStatic
import java.util.Arrays

object TravelingSalesmanProblem {
    var N = 4

    // final_path[] stores the final solution ie, the 
    // path of the salesman. 
    var final_path = IntArray(N + 1)

    // visited[] keeps track of the already visited nodes 
    // in a particular path 
    var visited = BooleanArray(N)

    // Stores the final minimum weight of shortest tour. 
    var final_res = Int.MAX_VALUE

    // Function to copy temporary solution to 
    // the final solution 
    fun copyToFinal(curr_path: IntArray) {
        for (i in 0 until N) {
            final_path[i] = curr_path[i]
        }
        final_path[N] = curr_path[0]
    }

    // Function to find the minimum edge cost 
    // having an end at the vertex i 
    fun firstMin(adj: Array<IntArray>, i: Int): Int {
        var min = Int.MAX_VALUE
        for (k in 0 until N) {
            if (adj[i][k] < min && i != k) {
                min = adj[i][k]
            }
        }
        return min
    }

    // function to find the second minimum edge cost 
    // having an end at the vertex i 
    fun secondMin(adj: Array<IntArray>, i: Int): Int {
        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE
        for (j in 0 until N) {
            if (i == j) {
                continue
            }
            if (adj[i][j] <= first) {
                second = first
                first = adj[i][j]
            } else if (adj[i][j] <= second
                && adj[i][j] != first
            ) {
                second = adj[i][j]
            }
        }
        return second
    }

    // function that takes as arguments: 
    // curr_bound -> lower bound of the root node 
    // curr_weight-> stores the weight of the path so far 
    // level-> current level while moving in the search 
    //		 space tree 
    // curr_path[] -> where the solution is being stored which 
    //			 would later be copied to final_path[] 
    fun TSPRec(
        adj: Array<IntArray>, curr_bound: Int, curr_weight: Int,
        level: Int, curr_path: IntArray
    ) {
        // base case is when we have reached level N which 
        // means we have covered all the nodes once 
        var curr_bound = curr_bound
        var curr_weight = curr_weight
        if (level == N) {
            // check if there is an edge from last vertex in 
            // path back to the first vertex 
            if (adj[curr_path[level - 1]][curr_path[0]] != 0) {
                // curr_res has the total weight of the 
                // solution we got 
                val curr_res = (curr_weight
                        + adj[curr_path[level - 1]][curr_path[0]])

                // Update final result and final path if 
                // current result is better. 
                if (curr_res < final_res) {
                    copyToFinal(curr_path)
                    final_res = curr_res
                }
            }
            return
        }

        // for any other level iterate for all vertices to 
        // build the search space tree recursively 
        for (i in 0 until N) {
            // Consider next vertex if it is not same (diagonal 
            // entry in adjacency matrix and not visited 
            // already) 
            if (adj[curr_path[level - 1]][i] != 0
                && visited[i] == false
            ) {
                val temp = curr_bound
                curr_weight += adj[curr_path[level - 1]][i]

                // different computation of curr_bound for 
                // level 2 from the other levels 
                curr_bound -= if (level == 1) {
                    (firstMin(adj, curr_path[level - 1])
                            + firstMin(adj, i)) / 2
                } else {
                    (secondMin(adj, curr_path[level - 1])
                            + firstMin(adj, i)) / 2
                }

                // curr_bound + curr_weight is the actual lower bound 
                // for the node that we have arrived on 
                // If current lower bound < final_res, we need to explore 
                // the node further 
                if (curr_bound + curr_weight < final_res) {
                    curr_path[level] = i
                    visited[i] = true

                    // call TSPRec for the next level 
                    TSPRec(
                        adj, curr_bound, curr_weight, level + 1,
                        curr_path
                    )
                }

                // Else we have to prune the node by resetting 
                // all changes to curr_weight and curr_bound 
                curr_weight -= adj[curr_path[level - 1]][i]
                curr_bound = temp

                // Also reset the visited array 
                Arrays.fill(visited, false)
                for (j in 0..level - 1) {
                    visited[curr_path[j]] = true
                }
            }
        }
    }

    // This function sets up final_path[] 
    fun TSP(adj: Array<IntArray>) {
        val curr_path = IntArray(N + 1)

        // Calculate initial lower bound for the root node 
        // using the formula 1/2 * (sum of first min + 
        // second min) for all edges. 
        // Also initialize the curr_path and visited array 
        var curr_bound = 0
        Arrays.fill(curr_path, -1)
        Arrays.fill(visited, false)

        // Compute initial bound 
        for (i in 0 until N) {
            curr_bound += (firstMin(adj, i)
                    + secondMin(adj, i))
        }

        // Rounding off the lower bound to an integer 
        curr_bound = if (curr_bound == 1) curr_bound / 2 + 1 else curr_bound / 2

        // We start at vertex 1 so the first vertex 
        // in curr_path[] is 0 
        visited[0] = true
        curr_path[0] = 0

        // Call to TSPRec for curr_weight equal to 
        // 0 and level 1 
        TSPRec(adj, curr_bound, 0, 1, curr_path)
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        //Adjacency matrix for the given graph 
        val adj = arrayOf(
            intArrayOf(0, 10, 15, 20),
            intArrayOf(10, 0, 35, 25),
            intArrayOf(15, 35, 0, 30),
            intArrayOf(20, 25, 30, 0)
        )
        TSP(adj)
        System.out.printf("Minimum cost : %d\n", final_res)
        System.out.printf("Path Taken : ")
        for (i in 0..N) {
            System.out.printf("%d ", final_path[i])
        }
    }
}