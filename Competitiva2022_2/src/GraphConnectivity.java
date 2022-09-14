import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class GraphConnectivity {
	static HashSet<String> set;
	static String nodos[] = { "A", "B", "C", "D", 
			"E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R",
			"S", "T", "U", "V", "W", "X", "Y", "Z" };
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		sc.nextLine();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			set = new HashSet<String>();
			String inicial = sc.nextLine();
			int nodes = checkPos(inicial) + 1;
			Graph g = new Graph(nodes);
			String camino;
			while (sc.hasNextLine() && !(camino = sc.nextLine()).equals("")) {

				int a = checkPos(camino.charAt(0) + "");
				int b = checkPos(camino.charAt(1) + "");
				g.addEdge(a, b);
				g.addEdge(b, a);
			}
			for (int j = 0; j < nodes; j++) {
				g.DFS(j);
			}
			System.out.println(set.size());
			if (i != t - 1)
				System.out.println();
		}

	}

	static int checkPos(String letra) {
		return Arrays.binarySearch(nodos, letra);
	}

	static class Graph {
		private int V;
		private LinkedList<Integer> adj[];

		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i) {
				adj[i] = new LinkedList<Integer>();
			}
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
		}

		void DFSUtil(int v, boolean visited[]) {
			visited[v] = true;
			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					DFSUtil(n, visited);
				}
			}
		}

		void DFS(int v) {
			boolean[] visited = new boolean[V];
			DFSUtil(v, visited);
			set.add(Arrays.toString(visited));
		}

	}

}
