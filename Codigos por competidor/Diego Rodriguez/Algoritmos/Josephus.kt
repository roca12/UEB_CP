import java.util.*

object Josephus {
    fun next(a: Int, k: Int, d: IntArray): Int {
        var j = a - 1 //posicion anterior de "a"
        var i = 0
        while (i < k) {
            j = (j + 1) % d.size
            if (d[j] != -1) {
                i++
            }
        }
        println("next: $j")
        return j
    }

    fun josephus(n: Int, k: Int): Int {
        val d = IntArray(n + 1)
        d[0] = -1 //Cuando comienza desde 1
        for (i in 1..n) {
            d[i] = i
        }
        var indice = n
        var a = 0 //calculo de la posición siguiente a saltar
        while (indice != 1) {
            indice--
            a = next(a, k, d)
            d[a] = -1
            a++
        }
        indice = 0
        while (d[indice] == -1) {
            indice++
        }
        return d[indice]
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        while (sc.hasNext()) {
            println(josephus(sc.nextInt(), sc.nextInt()))
        }
    }
}