object A_mod_x_equals_b {
    fun modEquation(a: Int, b: Int) {
        if (a < b) {
            println("No hay solucion")
            return
        }
        if (a == b) {
            println("Hay infinitas soluciones")
        }
        var count = 0
        val n = a - b
        val y = Math.sqrt((a - b).toDouble()).toInt()
        for (i in 1..y) {
            if (n % i == 0) {
                if (n / i > b) {
                    count++
                    println(n / i)
                }
                if (i > b) {
                    count++
                    println(i)
                }
            }
        }
        if (y * y == n && y > b) {
            count--
        }
        println(count)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = 32
        val b = 2
        //21 % x = 5;
        modEquation(a, b)
    }
}