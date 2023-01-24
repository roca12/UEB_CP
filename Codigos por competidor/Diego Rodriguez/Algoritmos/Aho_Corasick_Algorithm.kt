import java.util.*

//para matching de strings
object Aho_Corasick_Algorithm {
    //Maximo numero de estados en la maquina de cotejamiento
    //debe ser igual a la suma del tamaño de todas las palablas clave
    const val MAXS = 500

    //numero maximo de caracteres en el alfabeto de entrada
    const val MAXC = 26

    //La funcion Output esta implementada usando out[]
    // bit i de esta mascara es uno si la palabra en el 
    // indice i aparece cuando la maquina entra en este estado
    var out = IntArray(MAXS)

    //función de fallo 
    var f = IntArray(MAXS)

    //implementación de las tries
    var g = Array(MAXS) { IntArray(MAXC) }

    // Construye la maquina de cotejado
    /* "out[state] & (1 << i)" es > 0 si encontramos la
    palabra de word[i] en el texto
    arr-> vector de palabras, el incide de cada palabla clave
    es importante */
    // retorna el numero de estados que la maquina tiene construidos
    // los estados estan numerados desde 0 hasta el valor de retorno - 1
    fun buildMatchingMachine(arr: Array<String>, k: Int): Int {
        //Inicializar todos los valores de out en 0. 
        Arrays.fill(out, 0)
        // Inicializar todos los valores de g en -1.
        for (i in 0 until MAXS) {
            Arrays.fill(g[i], -1)
        }
        // Inicialmente tenemos 0 estados 
        var states = 1
        //Esto es lo mismo que construir un Trie para arr[] 
        for (i in 0 until k) {
            val word = arr[i]
            var currentState = 0
            // Insertar todos los caracteres de la palabra actual
            // en arr[]
            for (j in 0 until word.length) {
                val ch = word[j] - 'a'
                // crea un nuevo nodo (estado) si un nodo
                // para ch no existe
                if (g[currentState][ch] == -1) {
                    g[currentState][ch] = states++
                }
                currentState = g[currentState][ch]
            }
            // agrega la palabra actual a la función de salida
            out[currentState] = out[currentState] or (1 shl i)
        }
        // para todos los caracteres que no tengan un camino desde
        // la raiz (El estado 0) en el trie, agregar un camino
        // hacia el estado 0 mismo
        for (ch in 0 until MAXC) {
            if (g[0][ch] == -1) {
                g[0][ch] = 0
            }
        }
        //Inicializamos los valores en la funcion de fallo
        Arrays.fill(f, -1)
        // Se usa BFS y una cola para calcular los fallos
        val q: Queue<Int> = LinkedList()
        // Se itera por lo que se encuentre
        for (ch in 0 until MAXC) {
            // Todos los nodos de profundidad 1 tienen una funcion de fallo
            // como 0.
            if (g[0][ch] != 0) {
                f[g[0][ch]] = 0
                q.offer(g[0][ch])
            }
        }
        while (!q.isEmpty()) {
            // Tomamos el nodo o estado del frente de la cola
            val state = q.poll()
            // Se busca la funcion de fallo de todos los caracteres del estado
            // removido para cuales funcion g no esta definido
            for (ch in 0 until MAXC) {
                if (g[state][ch] != -1) {
                    //Encontrar el valor de la funcion de fallo
                    var failure = f[state]
                    // encuentra el nodo mas profundo con el sufijo
                    // apropiado del string desde el nodo raiz al estado actual
                    while (g[failure][ch] == -1) {
                        failure = f[failure]
                    }
                    failure = g[failure][ch]
                    f[g[state][ch]] = failure
                    //Junta los valores de salida
                    out[g[state][ch]] = out[g[state][ch]] or out[failure]
                    //Inserta el nodo del siguiente nivel del trie
                    q.offer(g[state][ch])
                }
            }
        }
        return states
    }

    // currentState - El estado actual de la maquina 
    //                 entre 0 y el total de estados -1  
    // nextInput - El siguiente caracter que entra en la maquina. 
    fun findNextState(currentState: Int, nextInput: Char): Int {
        var answer = currentState
        val ch = nextInput - 'a'
        // Si g no esta definido, use la funcion de fallo 
        while (g[answer][ch] == -1) {
            answer = f[answer]
        }
        return g[answer][ch]
    }

    //Función que busca las ocurrencias en el texto
    fun searchWords(arr: Array<String>, k: Int, text: String) {
        // Preprocesar patrones
        // Construir los tries como una maquina de estado finito
        buildMatchingMachine(arr, k)
        // Inicializar los estados
        var currentState = 0
        //Atravesamos el texto buscando las ocurrencias
        for (i in 0 until text.length) {
            currentState = findNextState(currentState, text[i])
            // Si no se encuentra cotejado, pasa al siguiente estado
            if (out[currentState] == 0) {
                continue
            }
            // cotejado encontrado, imprimir todas las palabras de 
            // arr[] que se encontraron 
            for (j in 0 until k) {
                val aux = out[currentState] and (1 shl j)
                if (aux > 0) {
                    println(
                        "La palabra " + arr[j] + " aparece de "
                                + (i - arr[j].length + 1) + " a " + i
                    )
                }
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = arrayOf("he", "she", "hers", "his")
        val text = "ahishers"
        val k = arr.size
        searchWords(arr, k, text)
    }
}