import kotlin.jvm.JvmStatic
import java.lang.Exception

object Manacher_Algorithm {
    lateinit var text: CharArray
    fun min(a: Int, b: Int): Int {
        var res = a
        if (b < a) {
            res = b
        }
        return res
    }

    fun findLPS() {
        var N = text.size
        if (N == 0) {
            return
        }
        N = 2 * N + 1 //Conteo de posición
        val L = IntArray(N) //LPS tamaño de array
        L[0] = 0
        L[1] = 1
        var C = 1 //Posición central
        var R = 2 //posición Centro derecho
        var i = 0 //Posición actual derecho
        var iMirror: Int //Posición actual izquierda
        var maxLPSLength = 0
        var maxLPSCenterPosition = 0
        var start = -1
        var end = -1
        var diff = -1
        //Descomentar para imprimir tamaño del arreglo LPS
        //printf("%d %d ", L[0], L[1]); 
        i = 2
        while (i < N) {
            iMirror = 2 * C - i
            L[i] = 0
            diff = R - i
            if (diff > 0) {
                L[i] = min(L[iMirror], diff)
            }
            /*Intente expandir palíndromo centrado en currentRightPosition i
            Aquí para posiciones impares, comparamos caracteres y
            si coinciden, aumente la longitud de LPS en UNO
            Si la posición es igual, solo incrementamos LPS en UNO sin*/try {
                while (i + L[i] < N && i - L[i] > 0
                    && ((i + L[i] + 1) % 2 == 0
                            || text[(i + L[i] + 1) / 2] == text[(i - L[i] - 1) / 2])
                ) {
                    L[i]++
                }
            } catch (e: Exception) {
            }
            //Comparación de cualquier caracter
            if (L[i] > maxLPSLength) {
                maxLPSLength = L[i]
                maxLPSCenterPosition = i
            }
            if (i + L[i] > R) {
                C = i
                R = i + L[i]
            }
            i++
        }
        start = (maxLPSCenterPosition - maxLPSLength) / 2
        end = start + maxLPSLength - 1
        println("LPS del string es " + String(text) + ": ")
        i = start
        while (i <= end) {
            System.out.printf("%c", text[i])
            i++
        }
        println("")
        for (j in L.indices) {
            print(L[j].toString() + " ")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        text = "ANITALAVALATINA".toCharArray()
        findLPS()
    }
}