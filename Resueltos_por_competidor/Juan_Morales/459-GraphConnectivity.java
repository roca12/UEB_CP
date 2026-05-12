/*
 * Autor: OtherSpanish
 * Problema: 459 - Graph Connectivity
 * Juez online: UVA
 * Veredicto: Accepted
 * URL: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=400
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class GraphConnectivity {
	
	//Grafo con HashMap -> unicamente lo uso para apropiarme del concepto
	static HashMap<Integer, ArrayList<Integer>> graph = new HashMap<Integer, ArrayList<Integer>>();
	//Arreglo de visitados
	static boolean[] visitado;
	//Lectura rápida
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static int maxNode, cont;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int tc = Integer.parseInt(br.readLine()); //Test cases

		br.readLine(); //Quema linea
		for (int i = 0; i < tc; i++) {
			//Restablecer valores x cada test case
			cont = 0;
			graph.clear();

			String ln;
			//Mientras no se le ingrese una linea en blanco:
			while ((ln = br.readLine()) != null && !ln.equals("")) {
				//Verifica que estemos en las demás iteraciones 
				if (!(ln.length() == 1)) { 
					int node1 = ln.charAt(0);
					int node2 = ln.charAt(1);
					
					//Si es la primera vez que se ingresa el nodo, crea su lista de adyacencia
					if (graph.get(node1) == null)
						graph.put(node1, new ArrayList<>());
					if (graph.get(node2) == null)
						graph.put(node2, new ArrayList<>());
					
					//Evita repetidos
					if (!(graph.get(node1).contains(node2)))
						graph.get(node1).add(node2);
					if (!(graph.get(node2).contains(node1)))
						graph.get(node2).add(node1);
				} else { //Se recibe el nodo mas grande e instancia el tamaño del arreglo de visitados
					maxNode = ln.charAt(0);
					visitado = new boolean[maxNode - 64];
				}

			}

			for (int j = 0; j < visitado.length; j++) {
				//Por cada nodo no visitado hacer un dfs y sumar al contador
				if (!visitado[j]) {
					cont++;
					dfs(j);
				}

			}

			System.out.println(cont);

			if (i != tc - 1)
				System.out.println();

		}

	}

	//Al hacer dfs se marca como visitados todos los nodos de un sub grafo
	//DFS que permite char
	static void dfs(int nodoOrigen) {

		visitado[nodoOrigen] = true;
		//Si no existe termina el dfs
		if (graph.get(nodoOrigen + 65) == null)
			return;
		for (int vecino : graph.get(nodoOrigen + 65)) {
			if (!visitado[vecino - 65]) {
				dfs(vecino - 65);
			}
		}

	}

}
