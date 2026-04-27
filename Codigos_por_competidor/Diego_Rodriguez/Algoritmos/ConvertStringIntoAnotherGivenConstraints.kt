object ConvertStringIntoAnotherGivenConstraints {
    // Function to check is it possible to convert 
    // first String into another String or not. 
    fun isItPossible(
        str1: CharArray, str2: CharArray,
        m: Int, n: Int
    ): Boolean {
        // To Check Length of Both String is Equal or Not 
        if (m != n) {
            return false
        }
        // To Check Frequency of A's and B's are 
        // equal in both Strings or not. 
        if (count(str1, 'A')
            != count(str2, 'A')
            || count(str1, 'B')
            != count(str2, 'B')
        ) {
            return false
        }
        // Start traversing 
        for (i in 0 until m) {
            if (str1[i] != '#') {
                for (j in 0 until n) {
                    // To Check no two elements cross each other. 
                    if (str2[j] != str1[i] && str2[j] != '#') {
                        return false
                    }
                    if (str2[j] == str1[i]) {
                        str2[j] = '#'
                        // To Check Is it Possible to Move 
                        // towards Left or not. 
                        if (str1[i] == 'A' && i < j) {
                            return false
                        }
                        // To Check Is it Possible to Move  
                        // towards Right or not. 
                        if (str1[i] == 'B' && i > j) {
                            return false
                        }
                        break
                    }
                }
            }
        }
        return true
    }

    private fun count(str1: CharArray, c: Char): Int {
        var count = 0
        for (temp in str1) {
            if (c == temp) {
                count++
            }
        }
        return count
    }

    // Drivers code 
    @JvmStatic
    fun main(args: Array<String>) {
        val str1 = "A#B#"
        val str2 = "A##B"
        val m = str1.length
        val n = str2.length
        print(if (isItPossible(str1.toCharArray(), str2.toCharArray(), m, n)) "Yes\n" else "No\n")
    }
}