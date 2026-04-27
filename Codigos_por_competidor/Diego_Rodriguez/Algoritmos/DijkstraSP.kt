import java.util.*

object DijkstraSP {
    //similar a los defines de C++
    const val MAX = 10005 //maximo número de vértices
    const val INF = 1 shl 30 //definimos un valor 
    var sc = Scanner(System.`in`) //para lectura de datos
    var ady: MutableList<MutableList<Node>> = ArrayList() //lista de adyacencia
    var distancia = IntArray(MAX) // distancia de vértice inicial

    //vértice con ID = u
    var visitado = BooleanArray(MAX) //para vértices visitados
    var Q = PriorityQueue<Node>()

    //usamos el comparador definido para 
    //que el de menor valor este en el tope
    var V //número de vertices
            = 0
    var previo = IntArray(MAX) //para la impresion de caminos

    //función de inicialización
    fun init() {
        for (i in 0..V) {
            distancia[i] = INF //inicializamos todas 
            //las distancias con valor infinito
            visitado[i] = false //inicializamos todos 
            //los vértices como no visitados
            previo[i] = -1 //inicializamos el previo 
            //del vertice i con -1
        }
    }

    //Paso de relajacion
    fun relajacion(actual: Int, adyacente: Int, peso: Int) {
        //Si la distancia del origen al vertice actual + 
        //peso de su arista es menor a la distancia del
        //origen al vertice adyacente
        if (distancia[actual] + peso < distancia[adyacente]) {
            //relajamos el vertice actualizando la distancia
            distancia[adyacente] = distancia[actual] + peso
            //a su vez actualizamos el vértice previo
            previo[adyacente] = actual
            //agregamos adyacente a la cola de prioridad
            Q.add(Node(adyacente, distancia[adyacente]))
        }
    }

    //Impresion del camino más corto desde el vertice inicial y final ingresados
    fun print(destino: Int) {
        if (previo[destino] != -1) //si aun poseo un vertice previo
        {
            print(previo[destino]) //recursivamente sigo explorando
        }
        //terminada la recursion imprimo los vertices
        //recorridos
        System.out.printf("%d ", destino)
    }

    fun dijkstra(inicial: Int) {
        init() //inicializamos nuestros arreglos
        //Insertamos el vértice inicial en la Cola de Prioridad
        Q.add(Node(inicial, 0))
        //Este paso es importante, inicializamos la distancia del
        //inicial como 0
        distancia[inicial] = 0
        var actual: Int
        var adyacente: Int
        var peso: Int
        while (!Q.isEmpty()) { //Mientras cola no este vacia
            //Obtengo de la cola el nodo con menor peso, en un
            //comienzo será el inicial
            actual = Q.element().first
            Q.remove() //Sacamos el elemento de la cola
            if (visitado[actual]) {
                continue  //Si el vértice actual ya fue visitado entonces sigo
            } //sacando elementos de la cola
            visitado[actual] = true //Marco como visitado el vértice actual
            //reviso sus adyacentes del
            //vertice actual
            for (i in ady[actual].indices) {
                adyacente = ady[actual][i].first //id del vertice adyacente
                //peso de la arista que une actual
                //con adyacente ( actual , adyacente )
                peso = ady[actual][i].second
                //si el vertice adyacente no fue visitado
                if (!visitado[adyacente]) {
                    //realizamos el paso de relajacion
                    relajacion(actual, adyacente, peso)
                }
            }
        }
        System.out.printf("Distancias más cortas iniciando en vertice %d\n", inicial)
        for (i in 0..V) {
            System.out.printf("Vertice %d , distancia más corta = %d\n", i, distancia[i])
        }
        println("\n**************Impresion de camino más corto**************")
        System.out.printf("Ingrese vertice destino: ")
        val destino: Int
        destino = sc.nextInt()
        print(destino)
        System.out.printf("\n")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val E: Int
        var origen: Int
        var destino: Int
        var peso: Int
        val inicial: Int
        V = sc.nextInt()
        E = sc.nextInt()
        for (i in 0..V) {
            ady.add(ArrayList()) //inicializamos lista de
        } //adyacencia
        for (i in 0 until E) {
            origen = sc.nextInt()
            destino = sc.nextInt()
            peso = sc.nextInt()
            ady[origen].add(Node(destino, peso)) //grafo dirigido
            ady[destino].add(Node(origen, peso)) //no dirigido
        }
        print("Ingrese el vertice inicial: ")
        inicial = sc.nextInt()
        dijkstra(inicial)
    }

    //grande que represente la distancia infinita
    //inicial, basta conque sea superior al maximo 
    //valor del peso en alguna de las aristas
    //En el caso de java usamos una clase que 
    //representara el pair de C++
    class Node     //constructor
        (var first: Int, var second: Int) : Comparable<Node> {
        override fun compareTo(other: Node): Int { //es necesario 
            //definir un comparador para el
            //correcto funcionamiento del PriorityQueue
            if (second > other.second) {
                return 1
            }
            return if (second == other.second) {
                0
            } else -1
        }
    }
}