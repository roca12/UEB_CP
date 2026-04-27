import java.awt.Point

object EuclideanDistance {
    /*Trabajando con la clase Point*/
    fun euclideanDistance(p1: Point, p2: Point): Double {
        return Math.hypot((p1.x - p2.x).toDouble(), (p1.y - p2.y).toDouble())
    }

    /*Trabajando con los valores x y y de cada punto*/
    fun euclideanDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
        return Math.hypot(x2 - x1, y2 - y1)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(euclideanDistance(Point(0, 0), Point(20, 20)))
        println(euclideanDistance(0.0, 0.0, 20.0, 20.0))
    }
}