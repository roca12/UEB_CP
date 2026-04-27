import kotlin.jvm.JvmStatic

// possible timings. 
object PossibleTimings {
    // Array storing different 
    // numbers of digits a particular 
    // digit can be replaced with 
    var num = intArrayOf(2, 7, 2, 3, 3, 4, 2, 5, 1, 2)

    // Function performing calculations 
    fun possibleTimings(n: String) {
        println(
            num[n[0] - '0']
                    * num[n[1] - '0']
        )
    }

    // Driver function 
    @JvmStatic
    fun main(args: Array<String>) {
        val n = "05"
        // Calling function 
        possibleTimings(n)
    }
}