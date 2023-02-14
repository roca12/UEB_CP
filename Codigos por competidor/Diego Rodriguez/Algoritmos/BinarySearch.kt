import java.util.*

object BinarySearch {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val arr = intArrayOf(1, 2, 3, 4, 5, 6)
        val tam = arr.size
        val numerobuscado = 5
        val resultado = binarySearch(arr, 0, tam - 1, numerobuscado)
        if (resultado == -1) {
            println("Elemento no encontrado")
        } else {
            println("Elemento encontrado en el indice $resultado")
        }
    }

    fun binarySearch(arr: IntArray, inicio: Int, tamfinal: Int, numerobuscado: Int): Int {
        if (tamfinal >= inicio) {
            val medio = inicio + (tamfinal - 1) / 2
            if (arr[medio] == numerobuscado) {
                return medio
            }
            return if (arr[medio] > numerobuscado) {
                binarySearch(arr, inicio, medio - 1, numerobuscado)
            } else {
                binarySearch(arr, medio + 1, tamfinal, numerobuscado)
            }
        }
        return -1
    }
}