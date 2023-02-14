import kotlin.jvm.JvmStatic
import kotlin.Throws
import java.io.IOException
import java.util.*

object TestCasesGeneratingRandomArrays {
    var RUN = 5

    // miminum range of random numbers 
    var lowerBound = 0

    // maximum range of random numbers 
    var upperBound = 1000

    // miminum size of reqd array 
    var minSize = 10

    // maximum size of reqd array 
    var maxSize = 20
    fun randomArray() {
        val random = Random()
        for (i in 0 until RUN) {
            val size = (random.nextInt(maxSize - minSize)
                    + minSize)
            val array = IntArray(size)
            println(size)
            for (j in 0 until size) {
                val a = (random.nextInt(upperBound - lowerBound)
                        + lowerBound)
                print("$a ")
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