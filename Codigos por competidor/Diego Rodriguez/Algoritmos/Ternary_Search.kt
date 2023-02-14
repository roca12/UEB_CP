import kotlin.jvm.JvmStatic

object Ternary_Search {
    @JvmStatic
    fun main(args: Array<String>) {
        val x: Int
        val r: Int
        val resultado: Int
        val key: Int
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        x = 0
        r = arr.size - 1
        key = 6
        resultado = ternarySearch(x, r, key, arr)
        if (resultado < 0) {
            println("Elemento no presente en el arreglo")
        } else {
            println("Elemento encontrado en la posicion $resultado")
        }
    }

    fun ternarySearch(x: Int, r: Int, key: Int, arr: IntArray): Int {
        if (r >= x) {
            val mid1 = x + (r - x) / 3
            val mid2 = r - (r - x) / 3
            if (arr[mid1] == key) {
                return mid1
            }
            if (arr[mid2] == key) {
                return mid2
            }
            return if (key < arr[mid1]) {
                ternarySearch(x, mid1 - 1, key, arr)
            } else if (key > arr[mid2]) {
                ternarySearch(mid2 + 1, r, key, arr)
            } else {
                ternarySearch(mid1 + 1, mid2 - 1, key, arr)
            }
        }
        return -1
    }
}