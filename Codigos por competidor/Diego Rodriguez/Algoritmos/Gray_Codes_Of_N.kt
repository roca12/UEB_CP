import java.util.*

object Gray_Codes_Of_N {
    fun generateGrayArr(n: Int) {
        if (n <= 0) {
            return
        }
        val arr = ArrayList<String>()
        arr.add("0")
        arr.add("1")
        var i: Int
        var j: Int
        i = 2
        while (i < 1 shl n) {
            j = i - 1
            while (j >= 0) {
                arr.add(arr[j])
                j--
            }
            j = 0
            while (j < i) {
                arr[j] = "0" + arr[j]
                j++
            }
            j = i
            while (j < 2 * i) {
                arr[j] = "1" + arr[j]
                j++
            }
            i = i shl 1
        }
        i = 0
        while (i < arr.size) {
            println(arr[i])
            i++
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val numero = sc.nextInt()
        generateGrayArr(numero)
    }
}