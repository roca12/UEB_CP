object ax_plusby_c {
    fun solution(a: Int, b: Int, n: Int) {
        var i = 0
        while (i * a <= n) {
            if ((n - i * a) % b == 0) {
                println("x= " + i + ", y= " + (n - i * a) / b)
                return
            }
            i++
        }
        println("Sin solucion")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = 2
        val b = 3
        val n = 16
        solution(a, b, n)
    }
}