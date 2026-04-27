import kotlin.jvm.JvmStatic
import kotlin.Throws
import java.io.IOException
import java.util.*

object TestCasesGeneratingRandomMatrix {
    // the number of runs 
    // for the test data generated 
    var RUN = 5

    // miminum range of random numbers 
    var lowerBound = 0

    // maximum range of random numbers 
    var upperBound = 1000

    // maximum size of colomn 
    var maxColomn = 10

    // miminum size of colomn 
    var minColomn = 1

    // minimum size of row 
    var minRow = 1

    // maximum size of row 
    var maxRow = 10

    // Driver Code 
    fun randomArray() {
        val random = Random()
        for (i in 0 until RUN) {
            val row = (random.nextInt(maxRow - minRow)
                    + minRow)
            val colomn = (random.nextInt(maxColomn - minColomn)
                    + minColomn)
            val matrix = Array(row) { IntArray(colomn) }
            println("$row $colomn")
            for (j in 0 until row) {
                for (k in 0 until colomn) {
                    val a = (random.nextInt(upperBound - lowerBound)
                            + lowerBound)
                    print("$a ")
                }
                println()
            }
            println()
        }
    }

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        randomArray()
    }
}