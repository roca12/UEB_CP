object Heron_Formula {
    @JvmStatic
    fun main(args: Array<String>) {
        println(heron(1.0, 0.0, -1.0, 0.0, 0.0, 2.0))
    }

    fun heron(
        x1: Double, y1: Double, x2: Double,
        y2: Double, x3: Double, y3: Double
    ): Double {
        val a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
        val b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3))
        val c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2))
        val s = (a + b + c) / 2.0
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }
}