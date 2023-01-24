import kotlin.jvm.JvmStatic

//b tal que (a*b) % mod = 1. Éste existe siempre y cuando a 
//y mod sean coprimos (gcd(a, mod) = 1).
//El inverso modular de a se utiliza para calcular (n/a) % mod como (n*b) % mod.
object ModularInverse {
    fun modInverse(a: Int, mod: Int): Long {
        val d = extendedEuclid(a, mod).toLong()
        return if (d > 1) {
            -1
        } else ((x % mod + mod) % mod).toLong()
    }

    // Si mod es un número primo, se puede calcular 
    //aplicando el pequeño teorema de Fermat. 
    //agregar Modular Exponentiation.
    //public static long modInverse(int a, int mod) {
    //    return modpow(a, mod - 2, mod);
    //}
    //* Calcular el inverso modular
    //para todos los numeros menores a mod.
    lateinit var inv: IntArray
    fun modInverse(mod: Int) {
        inv = IntArray(mod)
        inv[1] = 1
        for (i in 2 until mod) {
            inv[i] = (mod - mod / i * inv[mod % i] % mod) % mod
        }
    }

    //El algoritmo de Euclides extendido retorna el 
    //gcd(a, b) y calcula los coeficientes enteros 
    //X y Y que satisfacen la ecuación: a*X + b*Y = gcd(a, b).
    var x = 0
    var y = 0

    /// O(log(max(a, b)))
    fun extendedEuclid(a: Int, b: Int): Int {
        if (b == 0) {
            x = 1
            y = 0
            return a
        }
        val d = extendedEuclid(b, a % b)
        val aux = x
        x = y
        y = aux - a / b * y
        return d
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(modInverse(3, 7))
    }
}