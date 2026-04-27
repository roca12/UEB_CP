// smallest sequence with rotations.
object LexoSmallest {
    // Function to compare lexicographically 
    // two sequence with different starting 
    // indexes. It returns true if sequence 
    // beginning with y is lexicographically 
    // greater. 
    fun compareSeq(S: CharArray, x: Int, y: Int, n: Int): Boolean {
        var x = x
        var y = y
        for (i in 0 until n) {
            if (S[x] < S[y]) {
                return false
            } else if (S[x] > S[y]) {
                return true
            }
            x = (x + 1) % n
            y = (y + 1) % n
        }
        return true
    }

    // Function to find starting index 
    // of lexicographically smallest sequence 
    fun smallestSequence(S: CharArray, n: Int): Int {
        var index = 0
        for (i in 1 until n)  // if new sequence is smaller 
        {
            if (compareSeq(S, index, i, n)) // change index of current min 
            {
                index = i
            }
        }
        return index
    }

    // Function to print lexicographically 
    // smallest sequence 
    fun printSmallestSequence(str: String, n: Int) {
        val S = str.toCharArray()
        val starting_index = smallestSequence(S, n)
        for (i in 0 until n) {
            print(S[(starting_index + i) % n])
        }
    }

    // driver code 
    @JvmStatic
    fun main(args: Array<String>) {
        val S = "DCACBCAA"
        val n = 8
        printSmallestSequence(S, n)
    }
}