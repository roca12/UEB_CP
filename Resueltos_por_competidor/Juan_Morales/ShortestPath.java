import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Clase que representa un nodo del grafo con su destino y peso de la arista
class NodeShort {
	int valor; // Vértice destino
	long peso; // Peso de la arista hacia ese vértice

	public NodeShort(int valor, long peso) {
		this.valor = valor;
		this.peso = peso;
	}
}

public class ShortestPath {

	// Lista de adyacencia
	static ArrayList<ArrayList<NodeShort>> listaAdj = new ArrayList<>();

	// Entrada rápida de datos
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// Arreglo de distancias mínimas desde el origen hasta cada vértice
	static long[] dist;

	// Arreglo de previos
	static int[] prev;

	// Arreglo de visitados
	static boolean[] visitado;

	public static void main(String[] args) throws IOException {
		int n, m;

		// Leer número de vértices (n) y aristas (m)
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		// Inicializar la lista de adyacencia con listas vacías
		for (int i = 0; i <= n; i++) {
			listaAdj.add(new ArrayList<NodeShort>());
		}

		// Leer cada arista y agregarla en ambas direcciones
		for (int i = 0; i < m; i++) {
			int a, b;
			long w;
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken()); // nodo 1
			b = Integer.parseInt(st.nextToken()); // nodo 2
			w = Long.parseLong(st.nextToken()); // Peso

			// Ignorar loops
			if (a != b) {
				listaAdj.get(a).add(new NodeShort(b, w));
				listaAdj.get(b).add(new NodeShort(a, w));
			}
		}

		// Inicializar arreglos
		dist = new long[n + 1];
		prev = new int[n + 1];
		visitado = new boolean[n + 1];
		inicializarArreglos(n);

		// Ejecutar Dijkstra desde el vértice 1 hasta el vértice n
		dijkstra(1, n);

		// Mostrar la distancia mínima y el camino encontrado
		mostrarResultado(n);
	}

	// Busca el vértice no visitado con menor distancia acumulada
	static int extraerMinimo(int n) {
		long minDist = Long.MAX_VALUE;
		int minNodo = -1;

		for (int i = 1; i <= n; i++) {
			if (!visitado[i] && dist[i] < minDist) {
				minDist = dist[i];
				minNodo = i;
			}
		}
		return minNodo; // Retorna -1 si todos los nodos restantes son inalcanzables
	}

	// Algoritmo de Dijkstra
	// Calcula la distancia mínima desde origen a todos los vértices alcanzables
	static void dijkstra(int origen, int n) {

		// La distancia al origen es 0
		dist[origen] = 0;

		// Repetir n veces: cada iteración fija un vértice como visitado
		for (int iter = 0; iter < n; iter++) {

			// Extraer el nodo no visitado con menor distancia
			int nodo = extraerMinimo(n);

			// Si no hay nodo alcanzable, terminar
			if (nodo == -1)
				break;

			// Marcar el nodo como visitado para no procesarlo de nuevo
			visitado[nodo] = true;

			// Relajar cada arista hacia los vecinos del nodo actual
			for (NodeShort vecino : listaAdj.get(nodo)) {
				long nuevaDist = dist[nodo] + vecino.peso;

				// Si encontramos un camino más corto hacia el vecino, actualizar
				if (nuevaDist < dist[vecino.valor]) {
					dist[vecino.valor] = nuevaDist;
					prev[vecino.valor] = nodo; // Registrar predecesor para reconstruir camino
				}
			}
		}
	}

	// Reconstruye y muestra el camino más corto hasta el destino
	// Si no existe camino, imprime -1
	static void mostrarResultado(int destino) {

		// Si la distancia sigue siendo infinito, no hay camino al destino
		if (dist[destino] == Long.MAX_VALUE) {
			System.out.println(-1);
			return;
		}

		// Reconstruir el camino siguiendo los predecesores desde destino hasta origen
		ArrayList<Integer> camino = new ArrayList<Integer>();
		for (int v = destino; v != -1; v = prev[v]) {
			camino.add(v);
		}

		// Imprimir el camino en orden correcto (de origen a destino)
		StringBuilder sb = new StringBuilder();
		for (int i = camino.size() - 1; i >= 0; i--) {
			sb.append(camino.get(i));
			if (i > 0)
				sb.append(" "); // Separar vértices con espacio
		}
		System.out.println(sb);
	}

	// Inicializar distancias en infinito y predecesores en -1 (sin predecesor)
	static void inicializarArreglos(int n) {
		for (int i = 0; i <= n; i++) {
			dist[i] = Long.MAX_VALUE;
			prev[i] = -1;
			visitado[i] = false;
		}
	}
}