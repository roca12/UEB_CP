/*
 * Autor: OtherSpanish
 * Problema: 336 - A Node Too Far
 * Juez online: UVA
 * Veredicto: Accepted
 * URL: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=272
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	//Grafo representado con HashMap para poder ingresar cualquier nodo sin necesidad de ser predecesor de otro
	static HashMap<Integer, ArrayList<Integer>> grafo = new HashMap<>();
	//Alternativa a Visited[], tiene la longitud del TTL
	static HashMap<Integer, Integer> mejorTTL = new HashMap<>();
	//Casos
	static int tc = 1;
	//Cuantos nodos si alcanza a visitar con la longitud pedida
	static int cont;

	public static void main(String[] args) {
		//Numero de aristas del grafo
		int nc;
		Scanner sc = new Scanner(System.in);
		//Mientras el dato ingresado no sea 0
		while ((nc = sc.nextInt()) != 0) {
			//Limpiar el grafo por cada caso
			grafo.clear();
			//Por cada arista unir los nodos en su adj list
			for (int i = 0; i < nc; i++) {
				int node1 = sc.nextInt();
				int node2 = sc.nextInt();
				//Inicializar las listas de ady
				if (grafo.get(node1) == null)
					grafo.put(node1, new ArrayList<>());
				if (grafo.get(node2) == null)
					grafo.put(node2, new ArrayList<>());
				//Añadir los nodos sin dirección
				grafo.get(node1).add(node2);
				grafo.get(node2).add(node1);
			}
			//Mientras no nos ingrese la condicion de salida
			while (true) {
				int origen = sc.nextInt();
				int length = sc.nextInt();
				//Condicion de salida
				if (origen == 0 && length == 0)
					break;
				
				//Se limpia el camino despues de cada iteración
				mejorTTL.clear();
				//Reinicia el contador
				cont = 0;
				//DFS modificado
				dfs(origen, length);
				//Tamaño del grafo - nodos visitados
				int notR = grafo.size() - cont;
				//Output
				System.out.println("Case " + tc + ": " + notR + " nodes not reachable from node " + origen
						+ " with TTL = " + length + ".");
				//Caso++
				tc++;
			}

		}

	}
	
	//DFS modificado que dado una longitud definida te dice cuantos vecinos del nodo origen alcanza a visitar
	private static void dfs(int origen, int length) {
		
		//Si no se habia visitado este nodo pero ya estamos fuera del rango de longitud salir del DFS.
		if (mejorTTL.get(origen) != null && mejorTTL.get(origen) >= length)
			return;
		//Si no se habia visitado este nodo Y seguimos dentro del rango de longitud, sumamos los nodos viables
		if (mejorTTL.get(origen) == null)
			cont++;
		//Y lo marcamos como vistado
		mejorTTL.put(origen, length);
		if (length == 0)
			return;
		//Por cada vecino (DFS normal)
		for (int veci : grafo.get(origen)) {
			/*Si el vecino no ha sido visitado o todavia estamos a 2 posiciones del rango de viabilidad de la longitud
			 * hacer dfs con el vecino (se revisan los vecinos del vecino si es viable aun).
			 * */
			if (mejorTTL.get(veci) == null || mejorTTL.get(veci) >= length - 1) {
				dfs(veci, length - 1);
			}

		}

	}

}
