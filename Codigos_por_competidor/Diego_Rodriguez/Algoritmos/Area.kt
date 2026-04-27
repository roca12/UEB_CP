import java.awt.Point
import java.util.*

object Area {
    fun area(P: ArrayList<Point>): Double {
        var result = 0.0
        for (i in 0 until P.size - 1) {
            result += (P[i].x * P[i + 1].y - P[i + 1].x * P[i].y).toDouble()
        }
        return Math.abs(result) / 2.0
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val puntos = ArrayList<Point>()
        //los puntos deben ir en orden
        puntos.add(Point(0, 0))
        puntos.add(Point(0, 1))
        puntos.add(Point(1, 1))
        puntos.add(Point(1, 0))
        //Definir el ultimo punto igual que el primero para cerrar el poligono
        puntos.add(Point(0, 0))
        println(area(puntos))
    }
}