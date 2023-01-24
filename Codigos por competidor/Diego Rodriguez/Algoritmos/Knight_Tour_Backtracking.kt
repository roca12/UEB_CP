object Knight_Tour_Backtracking {
    var N = 8

    /* Una función que verifica si i.j es
    indice valido para un tablero n*n*/
    fun isSafe(x: Int, y: Int, sol: Array<IntArray>): Boolean {
        return x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1
    }

    /* Imprimir la solución*/
    fun printSolution(sol: Array<IntArray>) {
        for (x in 0 until N) {
            for (y in 0 until N) {
                print(sol[x][y].toString() + "\t")
            }
            println()
        }
    }

    /*Esta función resuelve el problema de Knight Tour.
       utilizando Backtracking. Esta función principalmente
       utiliza solveKTUtil () para resolver el problema. Eso
       devuelve falso si no es posible realizar un recorrido completo,
       De lo contrario, devuelve true e imprime el recorrido.
       Tenga en cuenta que puede haber más de una
       soluciones, esta función imprime una de las
       soluciones viables.*/
    fun solveKT(): Boolean {
        val sol = Array(N) { IntArray(N) }
        /* Inicializando la matriz de solución*/for (x in 0 until N) {
            for (y in 0 until N) {
                sol[x][y] = -1
            }
        }
        /* xMove[] y yMove[] define el siguiente movimiento del caballo 
          xMove[] para siguiente valor en x
          yMove[] para siguiente valor en y */
        val xMove = intArrayOf(2, 1, -1, -2, -2, -1, 1, 2)
        val yMove = intArrayOf(1, 2, 2, 1, -1, -2, -2, -1)
        //Desde que el caballero inicie en el primer bloque
        sol[0][0] = 0
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            println("No existe la solución")
            return false
        } else {
            printSolution(sol)
        }
        return true
    }

    fun solveKTUtil(
        x: Int, y: Int, movei: Int,
        sol: Array<IntArray>, xMove: IntArray,
        yMove: IntArray
    ): Boolean {
        var k: Int
        var next_x: Int
        var next_y: Int
        if (movei == N * N) {
            return true
        }
        /* Intenta todos los movimientos desde la coordenada
        x  y y*/k = 0
        while (k < 8) {
            next_x = x + xMove[k]
            next_y = y + yMove[k]
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei
                if (solveKTUtil(
                        next_x, next_y, movei + 1,
                        sol, xMove, yMove
                    )
                ) {
                    return true
                } else {
                    sol[next_x][next_y] = -1 // backtracking 
                }
            }
            k++
        }
        return false
    }

    @JvmStatic
    fun main(args: Array<String>) {
        solveKT()
    }
}