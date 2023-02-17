
import java.util.*;

public class Catan {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int nodos, caminos;
		nodos = sc.nextInt();
		caminos = sc.nextInt();
		while (nodos != 0 && caminos != 0) {
			Graph g = new Graph(nodos);
			for (int i = 0; i < caminos; i++) {
				int desde = sc.nextInt(), hasta = sc.nextInt();
				g.addEdge(desde, hasta);
			}
			for (int i = 0; i < nodos; i++) {
				g.DFS(i);
			}
			System.out.println(g.maxactual);

			nodos = sc.nextInt();
			caminos = sc.nextInt();
		}
	}

	static class Graph {

		int V, max = 0, maxactual = -1;
		LinkedList<Integer> adj[];

		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i) {
				adj[i] = new LinkedList();
			}
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
			adj[w].add(v);
		}

		void DFSUtil(int v, boolean visited[]) {
			
			maxactual = max > maxactual ? max : maxactual;
			visited[v] = true;
			//System.out.print(v + " ");

			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					DFSUtil(n, visited);
					max++;
				}
				max--;
			}
		}

		void DFS(int v) {
			// Marca todos los vertices como no visitados (Falso)
			boolean visited[] = new boolean[V];
			DFSUtil(v, visited);
		}

	}
}
