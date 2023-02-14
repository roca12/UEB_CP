object Count_A_To_B {
    fun countSetBit(n: Int): Int {
        var n = n
        var count = 0
        while (n != 0) {
            count += n and 1
            n = n shr 1
        }
        return count
    }

    fun flippedCount(a: Int, b: Int): Int {
        return countSetBit(a xor b)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = 10
        val b = 20
        val res = flippedCount(a, b)
        println("(" + a + ", " + b + ") -> " + res + ": " + Integer.toString(res, 2))
    }
}