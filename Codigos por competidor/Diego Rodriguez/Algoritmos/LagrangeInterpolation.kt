// of Lagrange's Interpolation
object LagrangeInterpolation {
    // function to interpolate the given 
    // data points using Lagrange's formula 
    // xi corresponds to the new data point 
    // whose value is to be obtained n  
    // represents the number of known data points 
    fun interpolate(f: Array<Data>, xi: Int, n: Int): Double {
        var result = 0.0 // Initialize result 
        for (i in 0 until n) {
            // Compute individual terms of above formula 
            var term = f[i].y.toDouble()
            for (j in 0 until n) {
                if (j != i) {
                    term = term * (xi - f[j].x) / (f[i].x - f[j].x)
                }
            }

            // Add current term to result 
            result += term
        }
        return result
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        // creating an array of 4 known data points 
        val f = arrayOf(
            Data(0, 2), Data(1, 3),
            Data(2, 12), Data(5, 147)
        )

        // Using the interpolate function to obtain  
        // a data point corresponding to x=3 
        print(
            "Value of f(3) is : "
                    + interpolate(f, 3, 4).toInt()
        )
    }

    // To represent a data point  
    // corresponding to x and y = f(x) 
    class Data(var x: Int, var y: Int)
}