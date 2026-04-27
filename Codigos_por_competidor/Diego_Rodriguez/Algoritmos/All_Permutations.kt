import java.util.*

object All_Permutations {
    var permutaciones: MutableSet<String>? = null
    var result: MutableSet<String> = HashSet()
    var cont = 0
    fun permWithRepUtil(str: String, data: CharArray, last: Int, index: Int) {
        val length = str.length
        for (i in 0 until length) {
            data[index] = str[i]
            if (index == last) {
                cont++
                println(String(data))
            } else {
                permWithRepUtil(str, data, last, index + 1)
            }
        }
    }

    fun permWithRep(str: String) {
        var str = str
        val length = str.length
        val data = CharArray(length + 1)
        val temp = str.toCharArray()
        Arrays.sort(temp)
        str = String(temp)
        permWithRepUtil(str, data, length - 1, 0)
    }

    fun shuffle(c: Char) {
        if (permutaciones!!.isEmpty()) {
            permutaciones!!.add(c.toString())
        } else {
            val it: Iterator<String> = permutaciones!!.iterator()
            for (i in permutaciones!!.indices) {
                var temp1: String
                while (it.hasNext()) {
                    temp1 = it.next()
                    for (k in 0 until temp1.length + 1) {
                        val sb = StringBuilder(temp1)
                        sb.insert(k, c)
                        result.add(sb.toString())
                    }
                }
            }
            permutaciones = result
            result = HashSet()
        }
    }

    fun permutation(string: String): Set<String> {
        permutaciones = HashSet()
        val n = string.length
        for (i in n - 1 downTo 0) {
            shuffle(string[i])
        }
        val aux: MutableSet<String> = HashSet()
        val it: Iterator<String> = (permutaciones as HashSet<String>).iterator()
        while (it.hasNext()) {
            val aux2 = it.next()
            //Entre mas aumente r, mas pequeñas seran las permutaciones
            val r = 0
            aux.add(aux2.substring(0, aux2.length - 0))
        }
        return aux
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val entrada = "1234"
        val res = permutation(entrada)
        println("Hay en total " + res.size + " permutaciones sin repetición de " + entrada)
        val it = res.iterator()
        while (it.hasNext()) {
            println(it.next())
        }
        println("\n")
        val entrada2 = "1234"
        permWithRep(entrada2)
        println("Hay en total " + cont + " permutaciones con repetición de " + entrada2)
    }
}