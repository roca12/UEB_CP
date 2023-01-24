import kotlin.jvm.JvmStatic
import java.awt.Point
import java.util.ArrayList

object PointtInPolygon {
    fun ccw(p: Point, q: Point, r: Point): Boolean {
        return cross(toVector(p, q), toVector(p, r)) > 0
    }

    fun inPolygon(pt: Point, P: ArrayList<Point>): Boolean {
        if (P.isEmpty()) {
            return false
        }
        var sum = 0.0
        for (i in 0 until P.size - 1) {
            if (ccw(pt, P[i], P[i + 1])) {
                sum += angle(P[i], pt, P[i + 1])
            } else {
                sum -= angle(P[i], pt, P[i + 1])
            }
        }
        return if (Math.abs(Math.abs(sum) - 2 * Math.acos(-1.0)) < 1e-9) {
            true
        } else false
    }

    fun cross(a: Vec, b: Vec): Double {
        return a.x * b.y - a.y * b.x
    }

    fun collinear(p: Point, q: Point, r: Point): Boolean {
        return Math.abs(cross(toVector(p, q), toVector(p, r))) < 1e-9
    }

    fun angle(a: Point, b: Point, c: Point): Double {
        val ba = toVector(b, a)
        val bc = toVector(b, c)
        return Math.acos((ba.x * bc.x + ba.y * bc.y) / Math.sqrt((ba.x * ba.x + ba.y * ba.y) * (bc.x * bc.x + bc.y * bc.y)))
    }

    fun toVector(a: Point, b: Point): Vec {
        return Vec((b.x - a.x).toDouble(), (b.y - a.y).toDouble())
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val polygon = ArrayList<Point>()
        polygon.add(Point(0, 0))
        polygon.add(Point(2, 0))
        polygon.add(Point(2, 2))
        polygon.add(Point(0, 2))
        polygon.add(Point(0, 0))
        val punto = Point(1, 1)
        if (inPolygon(punto, polygon)) {
            println("Si")
        } else {
            println("No")
        }
    }

    class Vec(var x: Double, var y: Double)
}