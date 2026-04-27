object Code_Conversion_Gray_to_Binary_And_Reverse {
    fun binaryToGray(binary: String): String {
        var gray = ""
        gray += binary[0]
        for (i in 1 until binary.length) {
            gray += xor_c(binary[i - 1], binary[i])
        }
        return gray
    }

    fun xor_c(a: Char, b: Char): Char {
        return if (a == b) '0' else '1'
    }

    fun grayToBinary(gray: String): String {
        var binary = ""
        binary += gray[0]
        for (i in 1 until gray.length) {
            binary += if (gray[i] == '0') {
                binary[i - 1]
            } else {
                flip(binary[i - 1])
            }
        }
        return binary
    }

    fun flip(c: Char): Char {
        return if (c == '0') '1' else '0'
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val b1 = "01001"
        val res = binaryToGray(b1)
        println("Binario a Gray: $res")
        val res2 = grayToBinary(res)
        println("Gray a Binario: $res2")
    }
}