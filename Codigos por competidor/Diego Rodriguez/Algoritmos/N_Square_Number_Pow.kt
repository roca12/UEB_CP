import kotlin.jvm.JvmStatic

object NSquareNoPow {
    fun square(n: Int): Int {
        var n = n
        if (n == 0) {
            return 0
        }
        if (n < 0) {
            n = -n
        }
        val x = n shr 1
        return if (n and 1 > 0) {
            (square(x) shl 2) + (x shl 2) + 1
        } else {
            square(x) shl 2
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        for (i in -10..10) {
            val a = i and 1
            if (a > 0) {
                println("impar")
            } else {
                println("par")
            }
            println(i.toString() + " -> " + square(i))
            println("")
        }
    }
}