object Closest_Number_Same_Bits {
    fun getNext(n: Int): Int {
        var n = n
        var c = n
        var c0 = 0
        var c1 = 0
        while (c and 1 == 0 && c != 0) {
            c0++
            c = c shr 1
        }
        while (c and 1 == 1) {
            c1++
            c = c shr 1
        }
        if (c0 + c1 == 31 || c0 + c1 == 0) {
            return -1
        }
        val p = c0 + c1
        n = n or (1 shl p)
        n = n and ((1 shl p) - 1).inv()
        n = n or (1 shl c1 - 1) - 1
        return n
    }

    fun getPrev(n: Int): Int {
        var n = n
        var temp = n
        var c0 = 0
        var c1 = 0
        while (temp and 1 == 1) {
            c1++
            temp = temp shr 1
        }
        if (temp == 0) {
            return -1
        }
        while (temp and 1 == 0
            && temp != 0
        ) {
            c0++
            temp = temp shr 1
        }
        // posicion de el cero no final de 
        // mas a la derecha
        val p = c0 + c1
        //limpia del bit c hacia adelante 
        n = n and (0.inv() shl p + 1)
        // Secuencia de (c1+1) unos
        val mask = (1 shl c1 + 1) - 1
        n = n or mask shl c0 - 1
        return n
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 9
        println(n.toString() + "->" + Integer.toString(n, 2) + " " + getPrev(n))
        println(n.toString() + "->" + Integer.toString(n, 2) + " " + getNext(n))
    }
}