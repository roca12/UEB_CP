object Line_Intersection {
    fun lineLineIntersection(A: Point, B: Point, C: Point, D: Point): Point {
        val a1 = B.y - A.y
        val b1 = A.x - B.x
        val c1 = a1 * A.x + b1 * A.y
        val a2 = D.y - C.y
        val b2 = C.x - D.x
        val c2 = a2 * C.x + b2 * C.y
        val determinant = a1 * b2 - a2 * b1
        return if (determinant == 0.0) {
            Point(Double.MAX_VALUE, Double.MAX_VALUE)
        } else {
            val x = (b2 * c1 - b1 * c2) / determinant
            val y = (a1 * c2 - a2 * c1) / determinant
            Point(x, y)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val A = Point(1.0, 1.0)
        val B = Point(4.0, 4.0)
        val C = Point(1.0, 8.0)
        val D = Point(2.0, 4.0)
        val intersection = lineLineIntersection(A, B, C, D)
        if (intersection.x == Double.MAX_VALUE
            && intersection.y == Double.MAX_VALUE
        ) {
            println("la linea AB y CD son paralelas.")
        } else {
            print("La intersección de las lineas AB " + "y CD es: ")
            Point.displayPoint(intersection)
        }
    }

    class Point(var x: Double, var y: Double) {
        companion object {
            fun displayPoint(p: Point) {
                println("(" + p.x + ", " + p.y + ")")
            }
        }
    }
}