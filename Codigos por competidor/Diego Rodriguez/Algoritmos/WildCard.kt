import kotlin.jvm.JvmStatic
import java.util.Arrays

object WildCard {
    fun strMatch(str: String, pattern: String, n: Int, m: Int): Boolean {
        if (m == 0) {
            return n == 0
        }
        val lookup = Array(n + 1) { BooleanArray(m + 1) }
        for (i in 0 until n + 1) {
            Arrays.fill(lookup[i], false)
        }
        lookup[0][0] = true
        for (j in 1..m) {
            if (pattern[j - 1] == '*') {
                lookup[0][j] = lookup[0][j - 1]
            }
        }
        for (i in 1..n) {
            for (j in 1..m) {
                if (pattern[j - 1] == '*') {
                    lookup[i][j] = lookup[i][j - 1] || lookup[i - 1][j]
                } else if (pattern[j - 1] == '?' || str[i - 1] == pattern[j - 1]) {
                    lookup[i][j] = lookup[i - 1][j - 1]
                } else {
                    lookup[i][j] = false
                }
            }
        }
        return lookup[n][m]
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val str = "baaababa"
        val pat = "b*ba"
        if (strMatch(str, pat, str.length, pat.length)) {
            println("Si")
        } else {
            println("No")
        }
    }
}