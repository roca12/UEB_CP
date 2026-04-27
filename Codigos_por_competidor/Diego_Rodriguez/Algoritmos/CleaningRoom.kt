import java.util.*

object CleaningRoom {
    // Matrix A stores the string 
    var A = Array(105) { IntArray(105) }

    // ans stores the pair of indices 
    // to be cleaned by the machine 
    var ans = ArrayList<Pair>()

    // Function for printing the 
    // vector of pair 
    fun print() {
        println("Yes, the house can be cleaned.")
        for (i in ans.indices) {
            println(ans[i].a.toString() + " " + ans[i].b)
        }
    }

    // Function performing calculations 
    fun solve(n: Int) {
        // push every first cell in 
        // each row containing '.' 
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (A[i][j] == ('.').toInt()) {
                    ans.add(Pair(i + 1, j + 1))
                    break
                }
            }
        }
        // If total number of cells are 
        // n then house can be cleaned 
        if (ans.size == n) {
            print()
            return
        }
        ans = ArrayList()

        // push every first cell in 
        // each column containing '.' 
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (A[i][j] == '.'.toInt()) {
                    ans.add(Pair(i + 1, j + 1))
                    break
                }
            }
        }
        // If total number of cells are 
        // n then house can be cleaned 
        if (ans.size == n) {
            print()
            return
        }
        println("house cannot be cleaned.")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 3
        var s = ""
        s += ".**"
        s += ".**"
        s += ".**"
        var k = 0
        //Loop to insert letters from 
        //string to array 
        for (i in 0 until n) {
            for (j in 0 until n) {
                A[i][j] = s[k].toInt()
                k += 1
            }
        }
        solve(n)
    }

    class Pair(var a: Int, var b: Int)
}