import kotlin.jvm.JvmStatic

object PointClass {
    @JvmStatic
    fun main(args: Array<String>) {
        //coordenadas en x y y
        val A = Point(0.0, 0.0)
    }

    internal class Point {
        var x: Double
        var y: Double

        constructor() {
            y = 0.0
            x = y
        }

        constructor(_x: Double, _y: Double) {
            x = _x
            y = _y
        }

        fun equals(other: Point): Boolean {
            return if (Math.abs(x - other.x) < 1e-9 && Math.abs(y - other.y) < 1e-9) {
                true
            } else false
        }
    }
}