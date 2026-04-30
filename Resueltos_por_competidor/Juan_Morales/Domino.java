/*
 * Autor: OtherSpanish
 * Problema: Dominos 2 
 * Juez online: UVA
 * Veredicto: Accepted
 * http://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=2513
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Domino {
	
	static boolean[] visited; //Lista de visitados
	static ArrayList<ArrayList<Integer>> grafo = new ArrayList<>(); //Lista de adyacencia

	//Depth first search
	static void dfs(int node) {
		visited[node] = true; //Visita el nodo
		for (int veci : grafo.get(node)) { //Por cada nodo vecino
			if (!visited[veci]) { //Si no ha sido visitado
				dfs(veci); //Hagale dfs
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Lectura rápida de datos
		int tc, n, m, l, x, y, z; //Test Cases, n dominos, m edges, l falling dominos, x nodo 1, y nodo 2, z domino tirado
		tc = Integer.parseInt(br.readLine().trim()); //Test cases

		for (int i = 0; i < tc; i++) {
			grafo.clear(); //Se limpia la lista de ady por cada caso
			StringTokenizer st = new StringTokenizer(br.readLine()); //Lee n m y l
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());

			for (int j = 0; j < n + 1; j++) {
				grafo.add(new ArrayList<>()); //Se añade la lista de ady de cada nodo
			}

			visited = new boolean[n + 1]; //Se setea el tamaño del arreglo de visitados

			for (int j = 0; j < m; j++) {
				st = new StringTokenizer(br.readLine()); //se lee x y y
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				grafo.get(x).add(y); //Se añade el nodo 2 al nodo 1 (es direccionado)
			}

			for (int j = 0; j < l; j++) {
				z = Integer.parseInt(br.readLine().trim()); //Se tira un domino
				dfs(z); //Se ve cuantos dominos estan conectados al base
			}

			int cont = 0; //Contador de caidas
			for (boolean bol : visited) { //Por cada nodo mirar si fue visitado
				if (bol) { //Si el nodo fue visitado se suma un domino caido
					cont++;
				}
			}
			System.out.println(cont); //Print dominos caidos
		}
	}
}