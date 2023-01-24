import kotlin.jvm.JvmStatic
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.Throws
import java.io.IOException

object TreeSort {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val entrada = br.readLine().split(" ").toTypedArray()
        val arr = IntArray(entrada.size)
        for (i in entrada.indices) {
            arr[i] = entrada[i].toInt()
        }
        treeInsert(arr)
        inOrderRec(root)
    }

    var root: Nodo? = null
    fun init() {
        root = null
    }

    fun insert(key: Int) {
        root = insertRec(root, key)
    }

    fun insertRec(root: Nodo?, key: Int): Nodo {
        var root = root
        if (root == null) {
            root = Nodo(key)
            return root
        }
        if (key < root.key) {
            root.izquierda = insertRec(root.izquierda, key)
        } else if (key >= root.key) {
            root.derecha = insertRec(root.derecha, key)
        }
        return root
    }

    fun inOrderRec(root: Nodo?) {
        if (root != null) {
            inOrderRec(root.izquierda)
            print(root.key.toString() + " ")
            inOrderRec(root.derecha)
        }
    }

    fun treeInsert(arr: IntArray) {
        for (i in arr.indices) {
            insert(arr[i])
        }
    }

    class Nodo(var key: Int) {
        var izquierda: Nodo?
        var derecha: Nodo? = null

        init {
            izquierda = derecha
        }
    }
}