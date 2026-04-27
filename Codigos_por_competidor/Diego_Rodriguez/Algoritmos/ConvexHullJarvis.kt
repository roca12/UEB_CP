import java.util.*

internal object ConvexHullJarvis {
    // To find orientation of ordered triplet (p, q, r). 
    // The function returns following values 
    // 0 --> p, q and r are colinear 
    // 1 --> Clockwise 
    // 2 --> Counterclockwise 
    fun orientation(p: Point?, q: Point?, r: Point?): Int {
        val `val` = ((q!!.y - p!!.y) * (r!!.x - q.x)
                - (q.x - p.x) * (r.y - q.y))
        if (`val` == 0) {
            return 0 // collinear 
        }
        return if (`val` > 0) 1 else 2 // clock or counterclock wise 
    }

    // Prints convex hull of a set of n points. 
    fun convexHull(points: Array<Point?>, n: Int) {
        // There must be at least 3 points 
        if (n < 3) {
            return
        }

        // Initialize Result 
        val hull = Vector<Point?>()

        // Find the leftmost point 
        var l = 0
        for (i in 1 until n) {
            if (points[i]!!.x < points[l]!!.x) {
                l = i
            }
        }

        // Start from leftmost point, keep moving  
        // counterclockwise until reach the start point 
        // again. This loop runs O(h) times where h is 
        // number of points in result or output. 
        var p = l
        var q: Int
        do {
            // Add current point to result 
            hull.add(points[p])

            // Search for a point 'q' such that  
            // orientation(p, x, q) is counterclockwise  
            // for all points 'x'. The idea is to keep  
            // track of last visited most counterclock- 
            // wise point in q. If any point 'i' is more  
            // counterclock-wise than q, then update q. 
            q = (p + 1) % n
            for (i in 0 until n) {
                // If i is more counterclockwise than  
                // current q, then update q 
                if (orientation(points[p], points[i], points[q])
                    == 2
                ) {
                    q = i
                }
            }

            // Now q is the most counterclockwise with 
            // respect to p. Set p as q for next iteration,  
            // so that q is added to result 'hull' 
            p = q
        } while (p != l) // While we don't come to first  
        // point 

        // Print Result 
        for (temp in hull) {
            println(
                "(" + temp!!.x + ", "
                        + temp.y + ")"
            )
        }
    }

    /* Driver program to test above function */
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

    internal class Point(var x: Int, var y: Int)
}