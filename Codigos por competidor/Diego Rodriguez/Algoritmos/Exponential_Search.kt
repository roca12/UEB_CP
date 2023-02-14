import java.util.*

object Exponential_Search {
    @JvmStatic
    fun main(args: Array<String>) {
        val lista = ArrayList<Int>()
        lista.add(1)
        lista.add(2)
        lista.add(3)
        lista.add(4)
        lista.add(5)
        val numerobuscado = 1
        val arr = arrayOfNulls<Int>(lista.size)
        val resultado = exponentialSearch(lista.toArray(arr), lista.size, numerobuscado)
        println(if (resultado < 0) "El elemento no esta presente en el array" else "El elemento esta en la posicion: $resultado")
    }

    fun exponentialSearch(arr: Array<Int?>, n: Int, x: Int): Int {
        if (arr[0] == x) {
            return 0
        }
        var i = 1
        while (i < n && arr[i]!! <= x) {
            i = i * 2
        }
        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x)
    }
}