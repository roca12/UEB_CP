object Line_Through_Two_Points {
    @JvmStatic
    fun main(args: Array<String>) {
        val P = Pair(3, 2)
        val Q = Pair(2, 6)
        lineFromPoints(P, Q)
    }

    fun lineFromPoints(P: Pair, Q: Pair) {
        val a = (Q.second - P.second).toDouble()
        val b = (P.first - Q.first).toDouble()
        val c = a * P.first + b * P.second
        if (b < 0) {
            println(
                "La linea que pasa a traves de "
                        + "los puntos P y Q es: "
                        + a + "x " + b + "y = " + c
            )
        } else {
            println(
                "La linea que pasa a traves de l"
                        + "os puntos P y Q es: "
                        + a + "x + " + b + "y = " + c
            )
        }
    }

    class Pair(var first: Int, var second: Int)
}