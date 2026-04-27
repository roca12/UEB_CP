import kotlin.jvm.JvmStatic

object Opposite_Signs {
    fun opposite(a: Int, b: Int): Boolean {
        return a xor b < 0
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = 123
        val b = -123
        if (opposite(a, b)) {
            println("Distintos signos")
        } else {
            println("Iguales signos")
        }
    }
}