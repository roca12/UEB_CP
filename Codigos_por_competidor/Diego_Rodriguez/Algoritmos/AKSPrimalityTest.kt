// Java code to check if number is prime. This
// program demonstrates concept behind AKS 
// algorithm and doesn't implement the actual 
// algorithm (This works only till n = 64) 
object AKSPrimalityTest {
    // array used to store coefficients . 
    var c = LongArray(100)

    // function to calculate the coefficients 
    // of (x - 1)^n - (x^n - 1) with the help 
    // of Pascal's triangle . 
    fun coef(n: Int) {
        c[0] = 1
        var i = 0
        while (i < n) {
            c[1 + i] = 1
            for (j in i downTo 1) {
                c[j] = c[j - 1] - c[j]
            }
            c[0] = -c[0]
            i++
        }
    }

    // function to check whether 
    // the number is prime or not 
    fun isPrime(n: Int): Boolean {
        // Calculating all the coefficients by 
        // the function coef and storing all 
        // the coefficients in c array . 
        coef(n)
        // subtracting c[n] and adding c[0] by 1 
        // as ( x - 1 )^n - ( x^n - 1), here we 
        // are subtracting c[n] by 1 and adding 
        // 1 in expression. 
        c[0]++
        c[n]--
        // checking all the coefficients whether 
        // they are divisible by n or not. 
        // if n is not prime, then loop breaks 
        // and (i > 0). 
        var i = n
        while (i-- > 0 && c[i] % n == 0L);
        // Return true if all coefficients are 
        // divisible by n. 
        return i < 0
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 37
        if (isPrime(n)) {
            println("Prime")
        } else {
            println("Not Prime")
        }
    }
}