import java.util.*

object Boyer_Moore {
    var NO_OF_CHARS = 256
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun badCharHeuristic(str: CharArray, size: Int, badChar: IntArray) {
        var i: Int
        Arrays.fill(badChar, -1)
        i = 0
        while (i < size) {
            badChar[str[i].toInt()] = i
            i++
        }
    }

    fun boyerMoore(txt: CharArray, pat: CharArray) {
        val m = pat.size
        val n = txt.size
        val badchar = IntArray(NO_OF_CHARS)
        badCharHeuristic(pat, m, badchar)
        var s = 0
        while (s <= n - m) {
            var j = m - 1
            while (j >= 0 && pat[j] == txt[s + j]) {
                j--
            }
            s += if (j < 0) {
                println("Patron encontrado en el indice: $s")
                if (s + m < n) m - badchar[txt[s + m].toInt()] else 1
            } else {
                max(1, j - badchar[txt[s + j].toInt()])
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val txt = "holacomoestasholahola".toCharArray()
        val pat = "hola".toCharArray()
        boyerMoore(txt, pat)
    }
}