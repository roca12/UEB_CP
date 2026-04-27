object JumpSearch {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610)
        val x = 5
        val resultado = jumpSearch(arr, x)
        if (resultado == -1) {
            println("no encontrado")
        } else {
            println("Encontrado en el indice $resultado")
        }
    }

    fun jumpSearch(arr: IntArray, x: Int): Int {
        val n = arr.size
        var step = Math.floor(Math.sqrt(n.toDouble())).toInt()
        var prev = 0
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step
            step += Math.floor(Math.sqrt(n.toDouble())).toInt()
            if (prev >= n) {
                return -1
            }
        }
        while (arr[prev] < x) {
            prev++
            if (prev == Math.min(step, n)) {
                return -1
            }
        }
        return if (arr[prev] == x) {
            prev
        } else -1
    }
}