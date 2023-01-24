import java.util.*

object GaussianElimination {
    var MAX = 100
    var n = 3
    var matrix = Array(MAX) { DoubleArray(MAX) }
    var result = DoubleArray(MAX)
    fun gauss(): ArrayList<Double> {
        val ans = ArrayList<Double>()
        for (i in 0 until n) {
            ans.add(0.0)
        }
        var temp: Double
        for (i in 0 until n) {
            var pivot = i
            for (j in i + 1 until n) {
                temp = Math.abs(matrix[j][i]) - Math.abs(matrix[pivot][i])
                if (temp > 0.000001) {
                    pivot = j
                }
            }
            val temp2 = DoubleArray(n)
            System.arraycopy(matrix[i], 0, temp2, 0, n)
            System.arraycopy(matrix[pivot], 0, matrix[i], 0, n)
            System.arraycopy(temp2, 0, matrix[pivot], 0, n)
            temp = result[i]
            result[i] = result[pivot]
            result[pivot] = temp
            if (Math.abs(matrix[i][i]) >= 0.000001) {
                for (k in i + 1 until n) {
                    temp = -matrix[k][i] / matrix[i][i]
                    matrix[k][i] = 0.0
                    for (l in i + 1 until n) {
                        matrix[k][l] += matrix[i][l] * temp
                    }
                    result[k] += result[i] * temp
                }
            }
        }
        for (m in n - 1 downTo 0) {
            temp = result[m]
            for (i in n - 1 downTo m + 1) {
                temp -= ans[i] * matrix[m][i]
            }
            ans[m] = temp / matrix[m][m]
        }
        return ans
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val r = Random()
        for (i in 0 until n) {
            for (j in 0 until n) {
                matrix[i][j] = r.nextInt(20).toDouble()
            }
        }
        for (i in 0 until n) {
            result[i] = r.nextInt(10).toDouble()
        }
        for (i in 0 until n) {
            for (j in 0 until n) {
                print(matrix[i][j].toString() + " ")
            }
            print("= " + result[i])
            println("")
        }
        val res = gauss()
        for (re in res) {
            print("$re ")
        }
    }
}