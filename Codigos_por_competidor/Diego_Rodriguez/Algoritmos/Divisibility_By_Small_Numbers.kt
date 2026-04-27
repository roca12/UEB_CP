object Divisibility_By_Small_Numbers {
    fun divisibility(num: Int): BooleanArray {
        val M = num.toString()
        val n = M.length
        var sum = 0
        val isMultipleOf = BooleanArray(13)
        for (c in M.toCharArray()) {
            sum += c - '0'
        }
        val lastDigit = M[n - 1] - '0'
        isMultipleOf[1] = true
        isMultipleOf[2] = lastDigit % 2 == 0
        isMultipleOf[3] = sum % 3 == 0
        if (n > 1) {
            isMultipleOf[4] = M.substring(n - 2, n).toInt() % 4 == 0
        } else {
            isMultipleOf[4] = lastDigit % 4 == 0
        }
        isMultipleOf[5] = lastDigit == 0 || lastDigit == 5
        isMultipleOf[6] = isMultipleOf[2] && isMultipleOf[3]
        var altsum = 0
        val pattern = intArrayOf(1, 3, 2, -1, -3, -2)
        var j = 0
        for (i in n - 1 downTo 0) {
            altsum += pattern[j] * (M[i] - '0')
            j = (j + 1) % 6
        }
        isMultipleOf[7] = Math.abs(altsum) % 7 == 0
        if (n > 2) {
            isMultipleOf[8] = M.substring(n - 3, n).toInt() % 8 == 0
        } else {
            isMultipleOf[8] = M.toInt() % 8 == 0
        }
        isMultipleOf[9] = sum % 8 == 0
        isMultipleOf[10] = lastDigit == 0
        altsum = 0
        var s = 1
        for (i in n - 1 downTo 0) {
            altsum += s * (M[i] - '0')
            s = -s
        }
        isMultipleOf[11] = Math.abs(altsum) % 11 == 0
        isMultipleOf[12] = isMultipleOf[2] && isMultipleOf[4]
        return isMultipleOf
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val res = divisibility(100)
        for (i in res.indices) {
            println(i.toString() + " :" + res[i])
        }
    }
}