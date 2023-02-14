object GCD_LCM {
    fun GCD(a: Int, b: Int): Int {
        return if (b == 0) a else GCD(b, a % b)
    }

    fun LCM(a: Int, b: Int): Int {
        return a * (b / GCD(a, b))
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = 7
        val b = 13
        println("GCD de a y b es: " + GCD(a, b))
        println("LCM de a y b es: " + LCM(a, b))
    }
}