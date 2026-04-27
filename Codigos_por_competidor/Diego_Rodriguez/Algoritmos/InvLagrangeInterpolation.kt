object InvLagrangeInterpolation {
    // Function to calculate 
    // the inverse interpolation 
    fun inv_interpolate(d: Array<Data>, n: Int, y: Double): Double {
        // Initialize final x 
        var x = 0.0
        var i: Int
        var j: Int
        i = 0
        while (i < n) {


            // Calculate each term 
            // of the given formula 
            var xi = d[i].x
            j = 0
            while (j < n) {
                if (j != i) {
                    xi = (xi
                            * (y - d[j].y)
                            / (d[i].y - d[j].y))
                }
                j++
            }

            // Add term to final result 
            x += xi
            i++
        }
        return x
    }

    // Driver Code 
    @JvmStatic
    fun main(args: Array<String>) {

        // Sample dataset of 4 points 
        // Here we find the value 
        // of x when y = 4.5 
        val d = arrayOf(
            Data(1.27, 2.3),
            Data(2.25, 2.95),
            Data(2.5, 3.5),
            Data(3.6, 5.1)
        )

        // Size of dataset 
        val n = 4

        // Sample y value 
        val y = 4.5

        // Using the Inverse Interpolation 
        // function to find the 
        // value of x when y = 4.5 
        System.out.printf(
            "Value of x at y = 4.5 : %.5f",
            inv_interpolate(d, n, y)
        )
    }

    // Consider a structure 
    // to keep each pair of 
    // x and y together 
    class Data(var x: Double, var y: Double)
}