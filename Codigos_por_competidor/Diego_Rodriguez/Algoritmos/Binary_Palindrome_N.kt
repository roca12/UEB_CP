object Binary_Palindrome_N {
    var INT_MAX = Int.MAX_VALUE
    fun isKThBitSet(x: Int, k: Int): Int {
        return if (x and (1 shl k - 1) > 0) 1 else 0
    }

    fun leftMostSetBit(x: Int): Int {
        var x = x
        var count = 0
        while (x > 0) {
            count++
            x = x shr 1
        }
        return count
    }

    fun isPalindrome(x: Int): Int {
        var l = leftMostSetBit(x)
        var r = 1
        while (l > r) {
            if (isKThBitSet(x, l) != isKThBitSet(x, r)) {
                return 0
            }
            l--
            r++
        }
        return 1
    }

    fun findNThPalindrome(n: Int): Int {
        var pal_count = 0
        var i = 0
        i = 1
        while (i <= INT_MAX) {
            if (isPalindrome(i) > 0) {
                pal_count++
            }
            if (pal_count == n) {
                break
            }
            i++
        }
        return i
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 14
        val res = findNThPalindrome(n)
        println(res.toString() + " " + Integer.toString(res, 2))
    }
}