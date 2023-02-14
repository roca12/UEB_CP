import kotlin.jvm.JvmStatic
import kotlin.Throws
import java.lang.Exception

// Bipartite matching. 
object MaximumBipartiteMatching {
    // M is number of applicants 
    // and N is number of jobs 
    const val M = 6
    const val N = 6

    // A DFS based recursive function that  
    // returns true if a matching for  
    // vertex u is possible 
    fun bpm(
        bpGraph: Array<BooleanArray>, u: Int,
        seen: BooleanArray, matchR: IntArray
    ): Boolean {
        // Try every job one by one 
        for (v in 0 until N) {
            // If applicant u is interested  
            // in job v and v is not visited 
            if (bpGraph[u][v] && !seen[v]) {

                // Mark v as visited 
                seen[v] = true

                // If job 'v' is not assigned to 
                // an applicant OR previously 
                // assigned applicant for job v (which 
                // is matchR[v]) has an alternate job available. 
                // Since v is marked as visited in the  
                // above line, matchR[v] in the following 
                // recursive call will not get job 'v' again 
                if (matchR[v] < 0 || bpm(
                        bpGraph, matchR[v],
                        seen, matchR
                    )
                ) {
                    matchR[v] = u
                    return true
                }
            }
        }
        return false
    }

    // Returns maximum number  
    // of matching from M to N 
    fun maxBPM(bpGraph: Array<BooleanArray>): Int {
        // An array to keep track of the  
        // applicants assigned to jobs.  
        // The value of matchR[i] is the  
        // applicant number assigned to job i,  
        // the value -1 indicates nobody is assigned. 
        val matchR = IntArray(N)

        // Initially all jobs are available 
        for (i in 0 until N) {
            matchR[i] = -1
        }

        // Count of jobs assigned to applicants 
        var result = 0
        for (u in 0 until M) {
            // Mark all jobs as not seen  
            // for next applicant. 
            val seen = BooleanArray(N)
            for (i in 0 until N) {
                seen[i] = false
            }

            // Find if the applicant 'u' can get a job 
            if (bpm(bpGraph, u, seen, matchR)) {
                result++
            }
        }
        return result
    }

    // Driver Code 
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        // Let us create a bpGraph shown 
        // in the above example 
        val bpGraph = arrayOf(
            booleanArrayOf(
                false, true, true,
                false, false, false
            ), booleanArrayOf(
                true, false, false,
                true, false, false
            ), booleanArrayOf(
                false, false, true,
                false, false, false
            ), booleanArrayOf(
                false, false, true,
                true, false, false
            ), booleanArrayOf(
                false, false, false,
                false, false, false
            ), booleanArrayOf(
                false, false, false,
                false, false, true
            )
        )
        println(
            "Maximum number of applicants that can"
                    + " get job is " + maxBPM(bpGraph)
        )
    }
}