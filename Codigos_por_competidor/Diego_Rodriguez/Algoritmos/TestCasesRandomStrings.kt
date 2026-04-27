import kotlin.jvm.JvmStatic
import java.util.*

// random strings 
object TestCasesRandomStrings {
    // Define the number of runs for the test data 
    // generated 
    var RUN = 5

    // Define the range of the test data generated 
    // Here it is 'a' to 'z' 
    var MAX = 25

    // Define the maximum length of string 
    var MAXLEN = 100
    fun randString() {
        //For random values every time 
        val r = Random()
        var LEN: Int // Length of string 
        for (i in 1..RUN) {
            LEN = 1 + r.nextInt(MAXLEN)
            // First print the length of string 
            System.out.printf("%d\n", LEN)
            // Then print the characters of the string 
            for (j in 1..LEN) {
                System.out.printf("%c", ('a'.toInt() + r.nextInt(MAX)).toChar())
            }
            System.out.printf("\n")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        randString()
    }
}