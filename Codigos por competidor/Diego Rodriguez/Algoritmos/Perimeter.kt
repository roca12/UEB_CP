import kotlin.jvm.JvmStatic
import java.awt.Point
import java.util.ArrayList

object Perimeter {
    fun perimeter(P: ArrayList<Point>): Double {
        var result = 0.0
        for (i in 0 until P.size - 1) {
            result += euclideanDistance(P[i], P[i + 1])
        }
        return result
    }

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
        val polygon = ArrayList<Point>()
        polygon.add(Point(0, 0))
        polygon.add(Point(1, 0))
        polygon.add(Point(1, 1))
        polygon.add(Point(0, 1))
        polygon.add(Point(0, 0))
        println(perimeter(polygon))
    }
}