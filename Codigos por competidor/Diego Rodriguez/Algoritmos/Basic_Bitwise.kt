object Basic_Bitwise {
    @JvmStatic
    fun main(args: Array<String>) {
//        bitApagadoMasALaDerecha();
///        encenderBitMasALaDerecha();
///        apagarBitMasALaDerecha();
///        busquedaDelPrimerbitEncendido();
///        cambiarSigno();
///        verificarSiEsImparONo();
///        encenderK_EsimoBit();
///        verificarK_EsimoBitSiEstaEncendidoONo();
///        apagarK_EsimoBit();
///        invertirK_EsimoBit();
    }

    fun invertirK_EsimoBit() {
        for (i in 1..10) {
            val res = i xor (1 shl 1)
            if (res != 0) {
                println("$i Se invirtio el bit 2 -> $res")
                println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
            }
        }
    }

    fun apagarK_EsimoBit() {
        for (i in 1..10) {
            val res = i and (1 shl 1).inv()
            if (res != 0) {
                println("$i Se apago el bit 2 -> $res")
                println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
            }
        }
    }

    fun verificarK_EsimoBitSiEstaEncendidoONo() {
        for (i in 1..10) {
            val res = i and (1 shl 1)
            if (res != 0) {
                println("$i Tiene el bit 2 encendido")
                println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
            }
        }
    }

    fun encenderK_EsimoBit() {
        for (i in 1..10) {
            val res = i or (1 shl 1)
            if (res != 0) {
                println("$i El 2 bit se encendio -> $res")
                println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
            }
        }
    }

    fun bitApagadoMasALaDerecha() {
        for (i in 1..10) {
            val res = i.inv() and i + 1
            println("$i -> $res:")
            println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
        }
    }

    fun apagarBitMasALaDerecha() {
        for (i in 0..10) {
            val res = i and i - 1
            println("$i -> $res:")
            println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
        }
    }

    fun encenderBitMasALaDerecha() {
        for (i in 0..10) {
            val res = i or i + 1
            println("$i -> $res:")
            println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
        }
    }

    fun busquedaDelPrimerbitEncendido() {
        for (i in 1..10) {
            val res = i and -i
            println("$i -> $res:")
            println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
        }
    }

    fun cambiarSigno() {
        for (i in 1..30) {
            val res = i.inv() + 1
            println("$i -> $res:")
            println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
        }
    }

    fun verificarSiEsImparONo() {
        for (i in 1..30) {
            val res = i and 1
            if (res != 0) {
                println("$i Es impar")
                println(Integer.toString(i, 2) + " -> " + Integer.toString(res, 2))
            }
        }
    }
}