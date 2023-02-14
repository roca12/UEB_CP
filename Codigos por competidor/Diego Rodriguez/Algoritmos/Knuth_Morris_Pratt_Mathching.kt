object Knuth_Morris_Pratt_Mathching {
    fun KMPsearch(pat: String, txt: String) {
        val M = pat.length
        val N = txt.length
        val lps = IntArray(M)
        var j = 0
        computeLPSArray(pat, M, lps)
        var i = 0
        while (i < N) {
            if (pat[j] == txt[i]) {
                i++
                j++
            }
            if (j == M) {
                println("Encontrado patrón (" + pat + ") en el indice " + (i - j) + "-" + (i - j + M - 1))
                j = lps[j - 1]
            } else if (i < N && pat[j] != txt[i]) {
                if (j != 0) {
                    j = lps[j - 1]
                } else {
                    i++
                }
            }
        }
    }

    fun computeLPSArray(pat: String, M: Int, lps: IntArray) {
        var len = 0
        var i = 1
        while (i < M) {
            if (pat[i] == pat[len]) {
                len++
                lps[i] = len
                i++
            } else {
                if (len != 0) {
                    len = lps[len - 1]
                } else {
                    lps[i] = len
                    i++
                }
            }
        }
    }

    fun variasBusquedas(arr: Array<String>, txt: String) {
        for (i in arr.indices) {
            KMPsearch(arr[i], txt)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val txt = "she-said-he-said-she-said-he-said-his"
        val arr = arrayOf("he", "she", "sher", "his", "hers")
        variasBusquedas(arr, txt)
    }
}