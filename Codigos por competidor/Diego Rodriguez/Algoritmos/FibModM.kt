object FibModM {
    fun fib(n: Long, m: Long): Long {
        var a: Long = 0
        var b: Long = 1
        var c: Long
        val log2 = (Math.log(n.toDouble()) / Math.log(2.0)).toInt()
        for (i in log2 downTo 0) {
            c = a
            a = c % m * (2 * (b % m) - c % m + m) % m
            b = (c % m * (c % m) + b % m * (b % m)) % m
            if (n shr i and 1 != 0L) {
                c = (a + b) % m
                a = b
                b = c
            }
        }
        return a
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(fib(20, 4))
    }
}