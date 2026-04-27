import kotlin.jvm.JvmStatic
import kotlin.Throws
import java.io.IOException
import java.util.*

object TestCasesGeneratingRandomNumbers {
    // the number of runs 
    // for the test data generated 
    var requiredNumbers = 5

    // miminum range of random numbers 
    var lowerBound = 0

    // maximum range of random numbers 
    var upperBound = 1000
    fun randomNumbers() {
        val random = Random()
        for (i in 0 until requiredNumbers) {
            val a = (random.nextInt(upperBound - lowerBound)
                    + lowerBound)
            println(a)
        }
    }

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        randomNumbers()
    }
}