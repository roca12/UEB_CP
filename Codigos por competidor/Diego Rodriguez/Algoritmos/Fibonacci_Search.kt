object FibonacciSearch {
    fun min(x: Int, y: Int): Int {
        return if (x <= y) x else y
    }

    fun fibonacciSearch(arr: IntArray, x: Int, n: Int): Int {
        if (x > arr[n - 1]) {
            return -1
        }
        var fib2 = 0
        var fib1 = 1
        var fibM = fib2 + fib1
        while (fibM < n) {
            fib2 = fib1
            fib1 = fibM
            fibM = fib2 + fib1
        }
        var offset = -1
        while (fibM > 1) {
            val i = min(offset + fib2, n - 1)
            if (arr[i] < x) {
                fibM = fib1
                fib1 = fib2
                fib2 = fibM - fib1
                offset = i
            } else if (arr[i] > x) {
                fibM = fib2
                fib1 = fib1 - fib2
                fib2 = fibM - fib1
            } else {
                return i
            }
        }
        return if (fib1 == 1 && arr[offset + 1] == x) {
            offset + 1
        } else -1
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100)
        val tam = 11
        val buscado = 45
        val resultado = fibonacciSearch(arr, buscado, tam)
        if (resultado < 0) {
            println("No encontrado")
        } else {
            println("Elemento encontrado en la posicion: $resultado")
        }
    }
}