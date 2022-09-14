import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Nov12 {

	public static int cont_nodos = 0, mayor_nodos = 0;

	public static Graph g;
	public static String salida = "";
	public static String rev1=""; 
	public static HashSet<String> ciudades;
	

	
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		ciudades= new HashSet<String>();
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			cont_nodos=0;
			mayor_nodos=0;
			salida ="";
			rev1="";
			int n = sc.nextInt();
			Graph g = new Graph(n);
			int cont = 0;
			int costo = 0;
			for (int j = 0; j < n - 1; j++) {

				String a = sc.next();
				String b = sc.next();
				ciudades.add(a);
				ciudades.add(b);

				String c = sc.next();
				costo += Integer.parseInt(c.substring(0, c.length() - 1));

				g.addEdge(a, b, c);
			}
			
			Iterator<String > it = ciudades.iterator();
			
			for (Iterator<String> iterator = ciudades.iterator(); iterator.hasNext();) {
				String a= iterator.next();
				g.DFS(a);
				if (cont_nodos > mayor_nodos) {
					mayor_nodos = cont_nodos;

					salida=rev1;
					rev1="";
				}
				cont_nodos = 0;
			}

			System.out.println(salida.subSequence(0, salida.length()-1));
			System.out.println(costo + "$");
		}
	}
	
	static class Graph {
		private int V;
		private LinkedList<Edge> adj[];

		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i) {
				adj[i] = new LinkedList();
			}
		}

		void addEdge(String v, String w, String peso) {
			adj[Arrays.binarySearch(ciudades.toArray(), v)].add(new Edge(w, peso));
		}
		
		
		void DFSUtil(String v, boolean visited[]) {
			visited[Arrays.binarySearch(ciudades.toArray(), v)] = true;
			cont_nodos++;
			Iterator<Edge> i = adj[Arrays.binarySearch(ciudades.toArray(), v)].listIterator();
			while (i.hasNext()) {
				Edge n = i.next();
				if (!visited[Arrays.binarySearch(ciudades.toArray(), v)]) {
//					System.out.print(v + " ");
//					System.out.print(n.u + " ");
//					System.out.println(n.w);
					
					rev1+=v + " ";
					rev1+=n.u + " ";
					rev1+=n.w+"\n";
					
					DFSUtil(n.u, visited);
				}
			}
			//System.out.println();
		}

		void DFS(String v) {
			boolean visited[] = new boolean[V];
			DFSUtil(v, visited);
		}

		static class Edge {
			String u;
			String w;

			public Edge(String u, String w) {
				super();
				this.u = u;
				this.w = w;
			}

		}

	}

}
