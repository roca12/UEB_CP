import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RespresentacionGrafoListaDeAdyacencia {

	static Vertex [] G;
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		int V=sc.nextInt();
		int E=sc.nextInt();
		G=new Vertex[V];
		
		for (int i=0; i< V; i++) {
			G[i]=new Vertex();
			G[i].adj=new ArrayList<>();
		}
		
		for (int i=0; i< E; i++) {
			int desde=sc.nextInt();
			int hasta=sc.nextInt();
			int peso=sc.nextInt();
			
			G[desde].adj.add(new Edge(hasta, peso));
			G[hasta].adj.add(new Edge(desde, peso));
			
		}
		print();
	}
	static void print () {
		for (int i=0; i<G.length; i++) {
			System.out.print(i+"->");
			for (Edge e: G[i].adj) {
				System.out.print(e.hasta+" "+e.peso+"|");
			}
			System.out.println();
		}
	}
	
	static class Vertex{
		List<Edge>adj;
		public Vertex() {
			adj=new ArrayList<>();
		}
	}
	static class Edge{
		int hasta, peso;
		public Edge(int hasta, int peso) {
			this.hasta=hasta;
			this.peso=peso;
		}
	}
}