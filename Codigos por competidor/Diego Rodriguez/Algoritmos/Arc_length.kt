object Arc_Length {
    fun arcLength(diameter: Double, angle: Double): Double {
        val pi = 22.0 / 7.0
        val arc: Double
        return if (angle >= 360) {
            println("Angulo no puede ser formado")
            0.0
        } else {
            arc = pi * diameter * (angle / 360.0)
            arc
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val diameter = 25.0
        val angle = 45.0
        val arc_len = arcLength(diameter, angle)
        println(arc_len)
    }
}