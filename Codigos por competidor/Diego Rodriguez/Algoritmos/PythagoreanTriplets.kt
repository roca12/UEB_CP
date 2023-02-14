import kotlin.jvm.JvmStatic

// triplets smaller than a given limit 
object PythagoreanTriplets {
    // Function to generate pythagorean 
    // triplets smaller than limit 
    fun pythagoreanTriplets(limit: Int) {

        // triplet: a^2 + b^2 = c^2 
        var a: Int
        var b: Int
        var c = 0

        // loop from 2 to max_limitit 
        var m = 2

        // Limiting c would limit 
        // all a, b and c 
        while (c < limit) {

            // now loop on j from 1 to i-1 
            for (n in 1 until m) {
                // Evaluate and print 
                // triplets using 
                // the relation between 
                // a, b and c 
                a = m * m - n * n
                b = 2 * m * n
                c = m * m + n * n
                if (c > limit) {
                    break
                }
                println("$a $b $c")
            }
            m++
        }
    }

    // Driver Code 
    @JvmStatic
    fun main(args: Array<String>) {
        val limit = 20
        pythagoreanTriplets(limit)
    }
}