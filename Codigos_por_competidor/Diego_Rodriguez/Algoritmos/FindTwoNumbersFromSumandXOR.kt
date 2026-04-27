// given Sum and XOR such that value of
// first number is minimum.  
object FindTwoNumbersFromSumandXOR {
    // Function that takes in the sum and XOR  
    // of two numbers and generates the two  
    // numbers such that the value of X is  
    // minimized  
    fun compute(S: Long, X: Long) {
        val A = (S - X) / 2
        var a = 0
        var b = 0
        val LONG_FIELD_SIZE = 8

        // Traverse through all bits  
        for (i in 0 until 8 * LONG_FIELD_SIZE) {
            val Xi = X and (1 shl i).toLong()
            val Ai = A and (1 shl i).toLong()
            if (Xi == 0L && Ai == 0L) {
                // Let us leave bits as 0.  
            } else if (Xi == 0L && Ai > 0) {
                a = 1 shl i or a
                b = 1 shl i or b
            } else if (Xi > 0 && Ai == 0L) {
                a = 1 shl i or a

                // We leave i-th bit of b as 0.  
            } else  // (Xi == 1 && Ai == 1)  
            {
                println("Not Possible")
                return
            }
        }
        println("a = $a\nb = $b")
    }

    // Driver function  
    @JvmStatic
    fun main(args: Array<String>) {
        val S: Long = 17
        val X: Long = 13
        compute(S, X)
    }
}