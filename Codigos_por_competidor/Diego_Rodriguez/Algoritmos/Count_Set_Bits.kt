import java.util.*

object Count_Set_Bits {
    fun countSetBitsUtil(x: Int): Int {
        return if (x <= 0) {
            0
        } else (if (x and 1 == 0) 0 else 1) + countSetBitsUtil(x shr 1)
    }

    fun countSetBits(n: Int): Int {
        var bitCount = 0
        for (i in 0..n) {
            println(i.toString() + " -> " + Integer.toString(i, 2))
            bitCount += countSetBitsUtil(i)
        }
        return bitCount
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        println("Conteo total del set de bits es: " + countSetBits(n))
    }
}