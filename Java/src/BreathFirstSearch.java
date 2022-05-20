import java.util.Iterator;
import java.util.LinkedList;

public class BreathFirstSearch {
	
	static class Grafo{
		private final int V;
		private LinkedList<Integer> adj[];
		
		public Grafo(int nodos) {
			V=nodos;
			adj=new LinkedList[nodos];
			for (int i = 0; i < adj.length; i++) {
				adj[i]= new LinkedList<Integer>();
			}
		}
		
		void agregarCamino(int desde,int hasta) {
			adj[desde].add(hasta);
		}
		void BFS(int origen) {
			boolean [] visitados= new boolean[V];
			LinkedList<Integer> cola = new LinkedList<Integer>();
			visitados[origen]=true;
			cola.add(origen);
			while (!cola.isEmpty()) {
				origen=cola.poll();
				System.out.print(origen+" ");
				Iterator<Integer> i = adj[origen].listIterator();
				while (i.hasNext()) {
					int n=i.next();
					if(!visitados[n]) {
						visitados[n]=true;
						cola.add(n);
					}
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		Grafo G= new Grafo(5);
		G.agregarCamino(1, 0);
		G.agregarCamino(1, 3);
		G.agregarCamino(0, 2);
		G.agregarCamino(2, 4);
		G.agregarCamino(3, 4);
		G.BFS(1);

	}

}
