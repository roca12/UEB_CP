import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

	public static void main(String[] args) {
		Grafo g = new Grafo(6);
		g.agregarCamino(0, 2);
		g.agregarCamino(0, 4);
		g.agregarCamino(2, 3);
		g.agregarCamino(4, 5);
		g.agregarCamino(3, 1);
		g.agregarCamino(5, 1);
		g.BFS(0);

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
		
		
		void BFS(int origen) {
			boolean visitados[]= new boolean[nodos];
			LinkedList<Integer> cola= new LinkedList<>();
			visitados[origen]=true;
			cola.add(origen);
			while (!cola.isEmpty()) {
				origen=cola.poll();
				System.out.print(origen+"->");
				Iterator<Integer> it = adyacencia[origen].listIterator();
				while(it.hasNext()) {
					
					int n = it.next();
					if(!visitados[n]) {
						visitados[n]=true;
						cola.add(n);
					}
					
				}
			}
			
		}
	}

}
