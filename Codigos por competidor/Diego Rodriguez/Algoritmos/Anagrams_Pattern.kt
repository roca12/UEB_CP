object Anagrams_Pattern {
    const val MAX = 256
    fun compare(arr1: CharArray, arr2: CharArray): Boolean {
        for (i in 0 until MAX) {
            if (arr1[i] != arr2[i]) {
                return false
            }
        }
        return true
    }

    fun anagramsSearch(pat: String, txt: String) {
        val M = pat.length
        val N = txt.length
        val countP = CharArray(MAX)
        val countTX = CharArray(MAX)
        for (i in 0 until M) {
            countP[pat[i].toInt()]++
            countTX[txt[i].toInt()]++
        }
        for (i in M until N) {
            if (compare(countP, countTX)) {
                println("Encontrado en el indice " + (i - M) + " Anagrama: " + txt.substring(i - M, i))
            }
            countTX[txt[i].toInt()]++
            countTX[txt[i - M].toInt()]--
        }
        if (compare(countP, countTX)) {
            println("Encontrado en el indice " + (N - M) + " Anagrama: " + txt.substring(N - M, N))
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val txt = "anitalavalatinaanilegustviajarnitatani"
        val pat = "anita"
        anagramsSearch(pat, txt)
    }
}