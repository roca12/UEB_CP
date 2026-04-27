object E_POW_X {
    fun exp(n: Int, x: Double): Double {
        var sum = 1.0
        for (i in n - 1 downTo 1) {
            sum = 1 + x * sum / i
        }
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 10
        val x = 2.0
        println("exp: " + exp(n, x))
        println("exp: " + exp(n + 10, x))
    }
}