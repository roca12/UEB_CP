import kotlin.jvm.JvmStatic

// Newton Raphson Method for solving  
// equations 
object NewtonRaphsonRoot {
    const val EPSILON = 0.001

    // An example function whose solution 
    // is determined using Bisection Method. 
    // The function is x^3 - x^2 + 2 
    fun func(x: Double): Double {
        return x * x * x - x * x + 2
    }

    // Derivative of the above function  
    // which is 3*x^x - 2*x 
    fun derivFunc(x: Double): Double {
        return 3 * x * x - 2 * x
    }

    // Function to find the root 
    fun newtonRaphson(x: Double) {
        var x = x
        var h = func(x) / derivFunc(x)
        while (Math.abs(h) >= EPSILON) {
            h = func(x) / derivFunc(x)

            // x(i+1) = x(i) - f(x) / f'(x)  
            x = x - h
        }
        print(
            "The value of the"
                    + " root is : "
                    + Math.round(x * 100.0) / 100.0
        )
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {

        // Initial values assumed 
        val x0 = -20.0
        newtonRaphson(x0)
    }
}