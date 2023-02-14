import java.awt.Point

object Angle {
    fun angle(a: Point, b: Point, c: Point): Double {
        val ba = toVector(b, a)
        val bc = toVector(b, c)
        return Math.acos((ba.x * bc.x + ba.y * bc.y) / Math.sqrt((ba.x * ba.x + ba.y * ba.y) * (bc.x * bc.x + bc.y * bc.y)))
    }

    fun toVector(a: Point, b: Point): Vec {
        return Vec((b.x - a.x).toDouble(), (b.y - a.y).toDouble())
    }

    fun DegToRad(d: Double): Double {
        return d * Math.PI / 180.0
    }

    fun RadToDeg(r: Double): Double {
        return r * 180.0 / Math.PI
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val puntos = arrayOf(
            Point(0, 0),
            Point(1, 0), Point(0, 1)
        )
        val res = angle(puntos[0], puntos[1], puntos[2])
        println(res)
        println(RadToDeg(res))
    }

    class Vec(var x: Double, var y: Double)
}