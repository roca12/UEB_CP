import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Greategg {
	static int time=0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int nodes=sc.nextInt();
		Graph g = new Graph(nodes);
		for (int i = 0; i < nodes-1; i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			g.addEdge(u-1, v-1);
			g.addEdge(v-1, u-1);
			
		}
		for (int i = 0; i < nodes; i++) {
			g.DFS(i);
			time=0;
			
		}
	}

	static class Graph {
		private int V;
		private LinkedList<Integer> adj[];

		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i) {
				adj[i] = new LinkedList();
			}
		}

		
		void addEdge(int v, int w) {
			adj[v].add(w);
		}

		void DFSUtil(int v, boolean visited[]) {
			
			
			System.out.print(v + " ");
			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					time++;
					DFSUtil(n, visited);
				}
			}
		}

		void DFS(int v) {
			boolean visited[] = new boolean[V];
			DFSUtil(v, visited);
			System.out.println();
			System.out.println(time);
			System.out.println("--------------------");
		}

	}

}
