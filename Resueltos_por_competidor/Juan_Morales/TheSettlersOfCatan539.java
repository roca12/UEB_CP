/*
 * Autor: OtherSpanish
 * Problema: The Settlers of Catan
 * Juez online: UVA
 * Veredicto: Accepted
 * https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=0&problem=480&mosmsg=Submission+received+with+ID+31103595
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TheSettlersOfCatan539 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<ArrayList<int[]>> grafo = new ArrayList<>(); // Lista de adyacencia, cada arista guarda {vecino, id}
	static boolean[] visitados; // Aristas visitadas en el camino actual
	static StringTokenizer st;
	static int maxLen; // Longitud del camino mas largo encontrado

	public static void main(String[] args) throws IOException {
		String linea;
		while ((linea = br.readLine()) != null) {
			if (linea.isEmpty())
				continue;

			st = new StringTokenizer(linea); // Lee n y m
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			if (n == 0 && m == 0) // Fin de entrada
				break;

			grafo.clear(); // Se limpia la lista de ady por cada caso
			for (int i = 0; i < n; i++) {
				grafo.add(new ArrayList<>()); // Se añade la lista de ady de cada nodo
			}

			visitados = new boolean[m]; // Se setea el tamaño del arreglo de visitados (una por arista)
			maxLen = 0;

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine()); // Se lee nod1 y nod2
				int nod1 = Integer.parseInt(st.nextToken());
				int nod2 = Integer.parseInt(st.nextToken());

				int[] aristaDesdeNod1 = new int[2]; // Arista desde nod1 hacia nod2
				aristaDesdeNod1[0] = nod2;
				aristaDesdeNod1[1] = i; // Id de la arista

				int[] aristaDesdeNod2 = new int[2]; // Arista desde nod2 hacia nod1
				aristaDesdeNod2[0] = nod1;
				aristaDesdeNod2[1] = i; // Id de la arista (mismo, es no dirigido)

				grafo.get(nod1).add(aristaDesdeNod1); // Se añade en ambas direcciones
				grafo.get(nod2).add(aristaDesdeNod2);
			}

			for (int i = 0; i < n; i++) {
				dfs(i, 0); // Se intenta cada nodo como origen
			}

			System.out.println(maxLen); // Print camino mas largo
		}
	}

	static void dfs(int origen, int longitud) {
		maxLen = Math.max(maxLen, longitud); // Se actualiza el maximo

		for (int[] vecino : grafo.get(origen)) { // Por cada vecino del nodo actual
			int nod1 = vecino[0];
			int aristaIndex = vecino[1];

			if (!visitados[aristaIndex]) { // Si la arista no ha sido usada
				visitados[aristaIndex] = true; // Se marca la arista como usada
				dfs(nod1, longitud + 1); // Se explora el vecino
				visitados[aristaIndex] = false; // Backtrack, se desmarca la arista
			}
		}
	}
}