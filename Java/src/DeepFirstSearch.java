import java.util.Iterator;
import java.util.LinkedList;

public class DeepFirstSearch {

	public static void main(String[] args) {
		Grafo g1 = new Grafo(6);
		g1.agregarCamino(0, 1);
		g1.agregarCamino(1, 2);
		g1.agregarCamino(2, 3);
		g1.agregarCamino(3, 4);
		g1.agregarCamino(4, 3);
		g1.agregarCamino(1, 4);
		g1.agregarCamino(5, 1);
		g1.agregarCamino(5, 0);
		g1.agregarCamino(5, 4);
		int desde=3;
		System.out.println("conectividad con dfs desde el nodo "
		+desde);
		g1.DFS(desde);
		
	}

	static class Grafo {
		int V;
		LinkedList<Integer> adj[];

		public Grafo(int V) {
			this.V = V;
			adj = new LinkedList[V];
			for (int i = 0; i < adj.length; i++) {
				adj[i] = new LinkedList<Integer>();
			}
		}

		void agregarCamino(int inicial, int hasta) {
			adj[inicial].add(hasta);
		}

		void DFS(int V) {
			boolean[] visitado = new boolean[this.V];
			DFSutil(V, visitado);
		}

		void DFSutil(int v, boolean[] visitados) {
			visitados[v] = true;
			System.out.print(v + "->");
			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visitados[n]) {
					DFSutil(n, visitados);
				}

			}

		}

	}

}
