import java.util.Iterator;
import java.util.LinkedList;

public class BusquedaEnAnchura {

	public static void main(String[] args) {
		Grafo g = new Grafo(6);
		g.agregarCamino(0, 1);
		g.agregarCamino(0, 2);
		g.agregarCamino(2, 0);
		g.agregarCamino(1, 2);
		g.agregarCamino(1, 3);
		g.agregarCamino(2, 4);
		g.BFS(0);

	}

	static class Grafo {
		int nodos;
		LinkedList<Integer> adj[];

		public Grafo(int nodos) {
			this.nodos = nodos;
			adj = new LinkedList[nodos];
			for (int i = 0; i < adj.length; i++) {
				adj[i] = new LinkedList<>();
			}
		}

		void agregarCamino(int desde, int hasta) {
			// dirigido
			adj[desde].add(hasta);
			// no dirigido
			//adj[hasta].add(desde);
		}

		void BFS(int s) {
			boolean visitado[] = new boolean[nodos];
			LinkedList<Integer> cola = new LinkedList<>();
			visitado[s] = true;
			cola.add(s);
			while (!cola.isEmpty()) {
				s = cola.poll();
				System.out.println(s + " ");
				Iterator<Integer> i = adj[s].listIterator();
				while (i.hasNext()) {
					int n = i.next();
					if (!visitado[n]) {
						visitado[n] = true;
						cola.add(n);
					}
				}
			}

		}
	}

}
