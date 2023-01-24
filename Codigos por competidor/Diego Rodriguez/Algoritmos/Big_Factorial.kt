object Big_Factorial {
    fun multiply(x: Int, res: IntArray, res_size: Int): Int {
        var res_size = res_size
        var carry = 0
        for (i in 0 until res_size) {
            val prod = res[i] * x + carry
            res[i] = prod % 10
            carry = prod / 10
        }
        while (carry != 0) {
            res[res_size] = carry % 10
            carry /= 10
            res_size++
        }
        return res_size
    }

    fun factorial(n: Int) {
        val res = IntArray(10000)
        res[0] = 1
        var res_size = 1
        for (i in 2..n) {
            res_size = multiply(i, res, res_size)
        }
        println("Factorial del numero dado es:")
        for (i in res_size - 1 downTo 0) {
            print(res[i])
        }
        println("")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        factorial(100)
    }
}