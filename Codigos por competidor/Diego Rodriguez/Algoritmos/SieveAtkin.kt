import kotlin.jvm.JvmStatic

// of Atkin 
object SieveAtkin {
    fun SieveOfAtkin(limit: Int): Int {
        // 2 and 3 are known to be prime 
        if (limit > 2) print(2.toString() + " ")
        if (limit > 3) print(3.toString() + " ")

        // Initialise the sieve array with 
        // false values 
        val sieve = BooleanArray(limit)
        for (i in 0 until limit) sieve[i] = false

        /* Mark siev[n] is true if one of the 
        following is true: 
        a) n = (4*x*x)+(y*y) has odd number  
           of solutions, i.e., there exist  
           odd number of distinct pairs  
           (x, y) that satisfy the equation  
           and    n % 12 = 1 or n % 12 = 5. 
        b) n = (3*x*x)+(y*y) has odd number  
           of solutions and n % 12 = 7 
        c) n = (3*x*x)-(y*y) has odd number  
           of solutions, x > y and n % 12 = 11 */
        var x = 1
        while (x * x < limit) {
            var y = 1
            while (y * y < limit) {


                // Main part of Sieve of Atkin 
                var n = 4 * x * x + y * y
                if (n <= limit && (n % 12 == 1 || n % 12 == 5)) sieve[n] = sieve[n] xor true
                n = 3 * x * x + y * y
                if (n <= limit && n % 12 == 7) sieve[n] = sieve[n] xor true
                n = 3 * x * x - y * y
                if (x > y && n <= limit && n % 12 == 11) sieve[n] = sieve[n] xor true
                y++
            }
            x++
        }

        // Mark all multiples of squares as 
        // non-prime 
        var r = 5
        while (r * r < limit) {
            if (sieve[r]) {
                var i = r * r
                while (i < limit) {
                    sieve[i] = false
                    i += r * r
                }
            }
            r++
        }

        // Print primes using sieve[] 
        for (a in 5 until limit) if (sieve[a]) print("$a ")
        return 0
    }

    // Driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        val limit = 20
        SieveOfAtkin(limit)
    }
}