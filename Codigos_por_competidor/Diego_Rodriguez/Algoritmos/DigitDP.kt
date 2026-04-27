import java.util.*

object DigitDP {
    // Memoization for the state results 
    var dp = Array(20) { Array(180) { LongArray(2) } }
    var digitA = ArrayList<Long>()
    var digitB = ArrayList<Long>()

    // Stores the digits in x in a vector digit 
    fun getDigits(x: Long): ArrayList<Long> {
        var x = x
        val digit = ArrayList<Long>()
        while (x != 0L) {
            digit.add(x % 10)
            x /= 10
        }
        return digit
    }

    // Return sum of digits from 1 to integer in 
    // digit vector 
    fun digitSum(idx: Int, sum: Int, tight: Int, digit: ArrayList<Long>): Long {
        // base case 
        if (idx == -1) {
            return sum.toLong()
        }
        // checking if already calculated this state 
        if (dp[idx][sum][tight] != -1L && tight != 1) {
            return dp[idx][sum][tight]
        }
        var ret: Long = 0
        // calculating range value 
        val k = if (tight > 0) digit[idx] else 9
        for (i in 0..k) {
            // caclulating newTight value for next state 
            val newTight = if (digit[idx] == i) tight else 0
            // fetching answer from next state 
            ret += digitSum(idx - 1, (sum + i).toInt(), newTight, digit)
        }
        if (tight == 0) {
            dp[idx][sum][tight] = ret
        }
        return ret
        // Returns sum of digits in numbers from a to b. 
    }

    fun rangeDigitSum(a: Long, b: Long): Long {
        // initializing dp with -1
        for (dp1 in dp) {
            for (dp11 in dp1) {
                for (k in dp11.indices) {
                    dp11[k] = -1
                }
            }
        }
        // storing digits of a-1 in digit vector 
        digitA = getDigits(a - 1)
        // Finding sum of digits from 1 to "a-1" which is passed 
        // as digitA. 
        val ans1 = digitSum(digitA.size - 1, 0, 1, digitA)
        // Storing digits of b in digit vector 
        digitB = getDigits(b)
        // Finding sum of digits from 1 to "b" which is passed 
        // as digitB. 
        val ans2 = digitSum(digitB.size - 1, 0, 1, digitB)
        return ans2 - ans1
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a: Long = 10
        val b: Long = 20
        println(
            "digit sum for given range : "
                    + rangeDigitSum(a, b)
        )
    }
}