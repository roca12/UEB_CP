import kotlin.jvm.JvmStatic

object RabinKarp {
    const val d = 256
    fun RabinKarpFunction(pat: String, txt: String, q: Int) {
        val M = pat.length
        val N = txt.length
        var i: Int
        var j: Int
        var p = 0
        var t = 0
        var h = 1
        i = 0
        while (i < M - 1) {
            h = h * d % q
            i++
        }
        i = 0
        while (i < M) {
            p = (d * p + pat[i].toInt()) % q
            t = (d * t + txt[i].toInt()) % q
            i++
        }
        i = 0
        while (i <= N - M) {
            if (p == t) {
                j = 0
                while (j < M) {
                    if (txt[i + j] != pat[j]) {
                        break
                    }
                    j++
                }
                if (j == M) {
                    println("Patron encontrado en el indice " + i + " - " + (i + M - 1))
                }
            }
            if (i < N - M) {
                t = (d * (t - txt[i].toInt() * h) + txt[i + M].toInt()) % q
                if (t < 0) {
                    t += q
                }
            }
            i++
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val txt = "anitalavalatinacontinaynita"
        val pat = "ni"
        RabinKarpFunction(pat, txt, d)
    }
}