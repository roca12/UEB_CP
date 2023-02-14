// circles touch each other or not.
object CircleIntersect {
    fun circle(
        x1: Int, y1: Int, x2: Int,
        y2: Int, r1: Int, r2: Int
    ): Int {
        val distSq = ((x1 - x2) * (x1 - x2)
                + (y1 - y2) * (y1 - y2))
        val radSumSq = (r1 + r2) * (r1 + r2)
        return if (distSq == radSumSq) {
            1
        } else if (distSq > radSumSq) {
            -1
        } else {
            0
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val x1 = -10
        val y1 = 8
        val x2 = 14
        val y2 = -24
        val r1 = 30
        val r2 = 10
        val t = circle(
            x1, y1, x2,
            y2, r1, r2
        )
        if (t == 1) {
            println(
                "Circle touch to"
                        + " each other."
            )
        } else if (t < 0) {
            println(
                "Circle not touch"
                        + " to each other."
            )
        } else {
            println(
                "Circle intersect"
                        + " to each other."
            )
        }
    }
}