import java.util.*

object Convex_Hull {
    fun orientation(p: Point?, q: Point?, r: Point?): Int {
        val `val` = ((q!!.y - p!!.y) * (r!!.x - q.x)
                - (q.x - p.x) * (r.y - q.y))
        if (`val` == 0) {
            return 0
        }
        return if (`val` > 0) 1 else 2
    }

    fun convexHull(points: Array<Point?>, n: Int) {
        if (n < 3) {
            return
        }
        val hull = ArrayList<Point?>()
        var l = 0
        for (i in 1 until n) {
            if (points[i]!!.x < points[l]!!.x) {
                l = i
            }
        }
        var p = l
        var q: Int
        do {
            hull.add(points[p])
            q = (p + 1) % n
            for (i in 0 until n) {
                if (orientation(points[p], points[i], points[q])
                    == 2
                ) {
                    q = i
                }
            }
            p = q
        } while (p != l)
        for (temp in hull) {
            println(
                "(" + temp!!.x + ", "
                        + temp.y + ")"
            )
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val points = arrayOfNulls<Point>(7)
        points[0] = Point(0, 3)
        points[1] = Point(2, 3)
        points[2] = Point(1, 1)
        points[3] = Point(2, 1)
        points[4] = Point(3, 0)
        points[5] = Point(0, 0)
        points[6] = Point(3, 3)
        val n = points.size
        convexHull(points, n)
    }

    class Point(var x: Int, var y: Int)
}