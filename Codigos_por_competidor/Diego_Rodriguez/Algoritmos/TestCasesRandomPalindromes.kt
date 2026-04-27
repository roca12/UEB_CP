import kotlin.jvm.JvmStatic
import java.util.*

object TestCasesRandomPalindromes {
    var RUN = 5
    var MAX = 25
    var MAXLEN = 50
    fun randPalindrome() {
        // For random values every time 
        val r = Random()
        // A container for storing the palindromes 
        val container = LinkedList<Char>()
        var LEN: Int // Length of string 
        for (i in 1..RUN) {
            LEN = 1 + r.nextInt(MAXLEN)
            // First print the length of string 
            System.out.printf("%d\n", LEN)
            // If it is an odd-length palindrome 
            if (LEN % 2 == 1) {
                container.addLast(('a'.toInt() + r.nextInt(MAX)).toChar())
            }
            // Then print the characters of the palindromic 
            // string 
            for (j in 1..LEN / 2) {
                val ch = ('a'.toInt() + r.nextInt(MAX)).toChar()
                container.addLast(ch)
                container.addFirst(ch)
            }
            for (c in container) {
                System.out.printf("%c", c)
            }
            container.clear()
            System.out.printf("\n")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        randPalindrome()
    }
}