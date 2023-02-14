object All_Subsets_Of_A_Set {
    fun printSubsets(set: Array<String>) {
        val n = set.size
        for (i in 0 until (1 shl n)) {
            print("{")
            for (j in 0 until n) {
                if (i and (1 shl j) > 0) {
                    print(set[j] + " ")
                }
            }
            println("}")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val colores = arrayOf("negro", "blanco", "amarrillo", "morado")
        //char set[] = {'a', 'b', 'c'};
        printSubsets(colores)
    }
}