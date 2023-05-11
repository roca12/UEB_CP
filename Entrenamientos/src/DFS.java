import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	
	public static void main(String[] args) {
		Grafo g = new Grafo(5);
		g.agregarCamino(0, 1);
		g.agregarCamino(1, 0);
		g.agregarCamino(1, 3);
		g.agregarCamino(3, 2);
		g.agregarCamino(3, 0);
		g.agregarCamino(2, 4);
		g.deepFirstSearch(0);

	}
	
	static class Grafo{
		int nodos;
		LinkedList<Integer> adyacencia[];
		
		public Grafo(int v) {
			this.nodos=v;
			adyacencia = new LinkedList[nodos];
			for (int i = 0; i < adyacencia.length; i++) {
				adyacencia[i]= new LinkedList<>();
			}
		}
		
		void agregarCamino(int origen, int destino) {
			adyacencia[origen].add(destino);
		}
		
		void deepFirstSearch(int origen) {
			boolean[] visitado= new boolean[nodos];
			dfsUtil(origen,visitado);
		}
		
		void dfsUtil(int origen, boolean [] visitado) {
			visitado[origen]=true;
			System.out.print(origen+"->");
			
			Iterator<Integer> it = adyacencia[origen].listIterator();
			while(it.hasNext()) {
				int n = it.next();
				if (!visitado[n]) {
					dfsUtil(n, visitado);
				}
			}
		}
		
	}
	
}
