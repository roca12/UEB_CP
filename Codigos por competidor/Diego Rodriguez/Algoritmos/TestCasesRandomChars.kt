import kotlin.jvm.JvmStatic
import java.util.*

object TestCasesRandomChars {
    // Define the number of runs for the test data 
    // generated 
    var RUN = 5

    // Define the range of the test data generated 
    // Here it is 'a' to 'z' 
    var MAX = 25
    fun randomChars() {
        // For random values every time 
        val r = Random()
        for (i in 1..RUN) {
            System.out.printf("%c\n", ('a'.toInt() + r.nextInt(25)).toChar())
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        randomChars()
    }
}