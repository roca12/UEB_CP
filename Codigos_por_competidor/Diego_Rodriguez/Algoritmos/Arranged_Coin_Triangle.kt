object Arranged_Coin_Triangle {
    fun squareRoot(n: Float): Float {
        var x = n
        var y = 1f
        val e = 0.000001f
        while (x - y > e) {
            x = (x + y) / 2
            y = n / x
        }
        return x
    }

    fun findMaximumHeight(N: Int): Int {
        val n = 1 + 8 * N
        return (-1 + squareRoot(n.toFloat())).toInt() / 2
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val N = 12
        println(findMaximumHeight(N))
    }
}