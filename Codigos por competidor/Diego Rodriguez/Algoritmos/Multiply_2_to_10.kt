import kotlin.jvm.JvmStatic

object Multiply_2_to_10 {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = 18
        println(multiplyByTwo(a))
        println(multiplyByThree(a))
        println(multiplyByFour(a))
        println(multiplyByFive(a))
        println(multiplyBySix(a))
        println(multiplyBySeven(a))
        println(multiplyByEight(a))
        println(multiplyByNine(a))
        println(multiplyByTen(a))
    }

    fun multiplyByTwo(n: Int): Int {
        return n shl 1
    }

    fun multiplyByThree(n: Int): Int {
        return (n shl 1) + n
    }

    fun multiplyByFour(n: Int): Int {
        return n shl 2
    }

    fun multiplyByFive(n: Int): Int {
        return (n shl 2) + n
    }

    fun multiplyBySix(n: Int): Int {
        return (n shl 3) - (n shl 1)
    }

    fun multiplyBySeven(n: Int): Int {
        return (n shl 3) - n
    }

    fun multiplyByEight(n: Int): Int {
        return n shl 3
    }

    fun multiplyByNine(n: Int): Int {
        return (n shl 3) + n
    }

    fun multiplyByTen(n: Int): Int {
        return (n shl 3) + (n shl 1)
    }
}