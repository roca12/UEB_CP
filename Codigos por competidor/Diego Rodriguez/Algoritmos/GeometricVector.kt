import java.awt.Point

//Es llamado Vec para no confundirlo con vector 
//como colección de elementos.
object GeometricVector {
    fun toVector(a: Point, b: Point): Vec {
        return Vec((b.x - a.x).toDouble(), (b.y - a.y).toDouble())
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = Point(0, 0)
        val b = Point(5, 5)
        val segmento = toVector(a, b)
    }

    class Vec(var x: Double, var y: Double)
}