object Find_Duplicates_Bit_Array {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(10, 10, 1, 1, 2, 3)
        val ba = BitArray(32000)
        ba.checkDuplicates(arr, ba)
    }

    internal class BitArray(n: Int) {
        var arr: IntArray
        operator fun get(pos: Int): Boolean {
            val index = pos shr 5
            val bitNo = pos and 0x1F
            return arr[index] and (1 shl bitNo) != 0
        }

        fun set(pos: Int) {
            val index = pos shr 5
            val bitNo = pos and 0x1F
            arr[index] = arr[index] or (1 shl bitNo)
        }

        fun checkDuplicates(arr: IntArray, ba: BitArray) {
            for (i in arr.indices) {
                val num = arr[i] - 1
                if (ba[num]) {
                    println((num + 1).toString() + " ")
                } else {
                    ba.set(num)
                }
            }
        }

        init {
            arr = IntArray((n shr 5) + 1)
        }
    }
}