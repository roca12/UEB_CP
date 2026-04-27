object Finite_Automata {
    var NO_OF_CHARS = 256
    fun getNextState(pat: CharArray, M: Int, state: Int, x: Int): Int {
        if (state < M && x == pat[state].toInt()) {
            return state + 1
        }
        var ns: Int
        var i: Int
        ns = state
        while (ns > 0) {
            if (pat[ns - 1] == x.toChar()) {
                i = 0
                while (i < ns - 1) {
                    if (pat[i] != pat[state - ns + 1 + i]) {
                        break
                    }
                    i++
                }
                if (i == ns - 1) {
                    return ns
                }
            }
            ns--
        }
        return 0
    }

    fun computeTF(pat: CharArray, M: Int, TF: Array<IntArray>) {
        var state: Int
        var x: Int
        state = 0
        while (state <= M) {
            x = 0
            while (x < NO_OF_CHARS) {
                TF[state][x] = getNextState(pat, M, state, x)
                x++
            }
            state++
        }
    }

    fun search(pat: CharArray, txt: CharArray) {
        val M = pat.size
        val N = txt.size
        val TF = Array(M + 1) { IntArray(NO_OF_CHARS) }
        computeTF(pat, M, TF)
        var i: Int
        var state = 0
        i = 0
        while (i < N) {
            state = TF[state][txt[i].toInt()]
            if (state == M) {
                println("Patron encontrado en el indice " + (i - M + 1))
            }
            i++
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val txt = "anitalavalatina".toCharArray()
        val pat = "ala".toCharArray()
        search(pat, txt)
    }
}