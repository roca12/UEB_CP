object BigIntegerMod {
    fun mod(n: String, m: Int): Int {
        var r = 0
        for (i in 0 until n.length) {
            r = (r * 10 + (n[i] - '0')) % m
        }
        return r
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(mod("9564784542", 10))
    }
}