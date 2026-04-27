// for solving equations
object Bisection {
    const val EPSILON = 0.01.toFloat()

    // An example function whose solution is determined using 
    // Bisection Method. The function is x^3 - x^2  + 2 
    fun func(x: Double): Double {
        return x * x * x - x * x + 2
    }

    // Prints root of func(x) with error of EPSILON 
    fun bisection(a: Double, b: Double) {
        var a = a
        var b = b
        if (func(a) * func(b) >= 0) {
            println(
                "You have not assumed"
                        + " right a and b"
            )
            return
        }
        var c = a
        while (b - a >= EPSILON) {
            // Find middle point 
            c = (a + b) / 2

            // Check if middle point is root 
            if (func(c) == 0.0) break else if (func(c) * func(a) < 0) b = c else a = c
        }
        //prints value of c upto 4 decimal places 
        System.out.printf(
            "The value of root is : %.4f", c
        )
    }

    // Driver program to test above function 
    @JvmStatic
    fun main(args: Array<String>) {
        // Initial values assumed 
        val a = -200.0
        val b = 300.0
        bisection(a, b)
    }
}