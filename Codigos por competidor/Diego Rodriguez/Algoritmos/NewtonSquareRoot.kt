import kotlin.jvm.JvmStatic

object NewtonSquareRoot {
    // Function to return the square root of  
    // a number using Newtons method  
    fun squareRoot(n: Double, l: Double): Double {
        // Assuming the sqrt of n as n only  
        var x = n

        // The closed guess will be stored in the root  
        var root: Double

        // To count the number of iterations  
        var count = 0
        while (true) {
            count++

            // Calculate more closed x  
            root = 0.5 * (x + n / x)

            // Check for closeness  
            if (Math.abs(root - x) < l) {
                break
            }

            // Update root  
            x = root
        }
        return root
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 327.0
        val l = 0.00001
        println(squareRoot(n, l))
    }
}