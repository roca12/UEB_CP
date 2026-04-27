import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS {
	static class Grafo {
		int nodos;
		LinkedList<Integer> adj[];
		
		Grafo(int v){
			this.nodos = v;
			adj = new LinkedList[this.nodos];
			for (int i = 0; i < adj.length; i++) {
				adj[i] = new LinkedList<Integer>();
			}
		}
		
		void agregarCamino(int desde, int hasta) {
			adj[desde].add(hasta);
		}
		
		void DFS(int origen) {
			boolean visitado[] = new boolean[nodos];
			DFSUtil(origen, visitado);
		}
		
		void DFSUtil(int actual, boolean visitado[]) {
			visitado[actual] = true;
			System.out.print(actual+" -> ");
			Iterator<Integer> i = adj[actual].listIterator();
			while(i.hasNext()) {
				int nuevoactual = i.next();
				if(!visitado[nuevoactual]) {
					DFSUtil(nuevoactual, visitado);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nodos = sc.nextInt();
		int caminos = sc.nextInt();
		
		Grafo g = new Grafo(nodos);
		for (int i = 0; i < caminos; i++) {
			int desde = sc.nextInt(), hasta = sc.nextInt();
			g.agregarCamino(desde, hasta);
		}
		g.DFS(sc.nextInt());
	}
	
	
}
