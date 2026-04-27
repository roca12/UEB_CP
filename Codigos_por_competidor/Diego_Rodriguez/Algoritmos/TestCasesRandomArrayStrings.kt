import kotlin.jvm.JvmStatic
import java.util.*

// random strings 
object TestCasesRandomArrayStrings {
    // Define the number of runs for the test data 
    // generated 
    var RUN = 1000

    // Define the range of the test data generated 
    // Here it is 'a' to 'z' 
    var MAX = 25

    // Define the range of number of strings in the array 
    var MAXNUM = 20

    // Define the maximum length of string 
    var MAXLEN = 20
    fun randomStrArr() {
        val r = Random()
        // Uncomment the below line to store 
        // the test data in a file 
        // freopen ("Test_Cases_Array_of_Strings.in", "w", stdout); 
        var NUM: Int // Number of strings in array 
        var LEN: Int // Length of string 
        for (i in 1..RUN) {
            NUM = 1 + r.nextInt(MAXNUM)
            System.out.printf("%d\n", NUM)
            for (k in 1..NUM) {
                LEN = 1 + r.nextInt(MAXLEN)
                // Then print the characters of the string 
                for (j in 1..LEN) {
                    System.out.printf("%c", 'a'.toInt() + r.nextInt(MAX))
                }
                System.out.printf(" ")
            }
            System.out.printf("\n")
        }
        // Uncomment the below line to store 
        // the test data in a file 
        // fclose(stdout); 
    }

    @JvmStatic
    fun main(args: Array<String>) {
        randomStrArr()
    }
}