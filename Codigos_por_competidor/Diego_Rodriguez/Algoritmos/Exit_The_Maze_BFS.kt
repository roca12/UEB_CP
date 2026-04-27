import java.util.*

object Exit_The_Maze_BFS {
    const val MAX = 100
    var sc = Scanner(System.`in`)
    var ady = Array(MAX) { CharArray(MAX) }
    var visitado = Array(MAX) { BooleanArray(MAX) }
    var dx = intArrayOf(0, 0, 1, -1)
    var dy = intArrayOf(1, -1, 0, 0)
    var h = 0
    var w = 0
    var prev = Array(MAX) { arrayOfNulls<Estado>(MAX) }
    fun BFS(x: Int, y: Int, h: Int, w: Int): Int {
        val incial = Estado(x, y, 0)
        val Q: Queue<Estado> = LinkedList()
        Q.offer(incial)
        for (i in 0 until MAX) {
            Arrays.fill(visitado[i], false)
        }
        prev[x][y] = Estado(-1, -1, -1)
        while (!Q.isEmpty()) {
            val actual = Q.poll()
            if (ady[actual.x][actual.y] == 'S') {
                print(actual.x, actual.y)
                return actual.d
            }
            visitado[actual.x][actual.y] = true
            for (i in 0..3) {
                val nx = dx[i] + actual.x
                val ny = dy[i] + actual.y
                if (nx >= 0 && nx < h && ny >= 0 && ny < w && ady[nx][ny] != '#' && !visitado[nx][ny]) {
                    val adyacente = Estado(nx, ny, actual.d + 1)
                    Q.offer(adyacente)
                    prev[nx][ny] = actual
                }
            }
        }
        return -1
    }

    fun print(x: Int, y: Int) {
        var x = x
        var y = y
        println("imprimiendo camino con asteriscos")
        run {
            var i = x
            var j = y
            while (prev[i][j]!!.d != -1) {
                ady[i][j] = '*'
                x = i
                y = j
                i = prev[x][y]!!.x
                j = prev[x][y]!!.y
            }
        }
        println("Camino con el menor numero de pasos")
        for (i in 0 until h) {
            for (j in 0 until w) {
                System.out.printf("%c", ady[i][j])
            }
            println("")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var x = 0
        var y = 0
        //System.out.println("Altura del laberinto");
        h = sc.nextInt()
        //System.out.println("Anchura del laberinto");
        w = sc.nextInt()
        sc.nextLine()
        for (i in 0 until h) {
            val aux = sc.nextLine()
            for (j in 0 until w) {
                ady[i][j] = aux[j]
                if (ady[i][j] == 'I') {
                    x = i
                    y = j
                }
            }
        }
        println("Vista previa")
        for (i in 0 until h) {
            for (j in 0 until w) {
                System.out.printf("%c", ady[i][j])
            }
            println("")
        }
        val min = BFS(x, y, h, w)
        if (min != -1) {
            println("Menor numero de pasos: $min")
        } else {
            println("No se pudo llegar a ese destino")
        }
    }

    class Estado(var x: Int, var y: Int, var d: Int)
}