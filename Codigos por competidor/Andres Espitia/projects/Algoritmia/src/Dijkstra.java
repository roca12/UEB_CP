import java.util.ArrayList;
import java.util.*;

public class Dijkstra {
	static final int MAX = 10005;
	static final int INF=1<<30;
	
	static class Nodo implements Comparable<Nodo>{
		int hasta, peso;
		
		public Nodo(int hasta, int peso) {
			this.hasta = hasta;
			this.peso = peso;
		}

		@Override
		public int compareTo(Nodo otro) {
			if(peso>otro.peso) {
				return 1;
			}
			
			if(peso<otro.peso) {
				return -1;
			}
			
			return 0;
		}
		
		
	}
	
	static Scanner sc = new Scanner(System.in);
	static List<List<Nodo>> ady = new ArrayList<>();
	static int distancia[] = new int[MAX];
	static boolean visitado[] = new boolean[MAX];
	static PriorityQueue<Nodo> Q = new PriorityQueue<>();
	static int V; //nodos del grafo
	static int previo[] = new int[MAX];
	
	static void init() {
		for (int i = 0; i < V; i++) {
			distancia[i] = INF;
			visitado[i]=false;
			previo[i]=-1;
		}
	}
	
	static void relajacion(int actual, int adyacente, int peso) {
		if(distancia[actual]+peso < distancia[adyacente]) {
			distancia[adyacente] = distancia[actual]+peso;
			previo[adyacente] = actual;
			Q.add(new Nodo(adyacente, distancia[adyacente]));
		}
	}

	static void print(int destino) {
		if(previo[destino]!=-1) {
			print(previo[destino]);
		}System.out.printf("%d ",destino);
	}
	
	static void dijkstra(int inicial) {
		init();
		Q.add(new Nodo(inicial, 0));
		distancia[inicial]=0;
		int actual, adyacente, peso;
		while(!Q.isEmpty()) {
			actual = Q.element().hasta;
			Q.remove();
			if(visitado[actual]) {
				continue;
			}
			visitado[actual] = true;
			for (int i = 0; i < ady.get(actual).size(); i++) {
				adyacente = ady.get(actual).get(i).hasta;
				peso = ady.get(actual).get(i).peso;
				if(!visitado[adyacente]) {
					relajacion(actual, adyacente, peso);
				}
			}
		}
		
		for (int i = 0; i < V; i++) {
			System.out.printf("Vertice %d, ditancia mas corta = %d\n",i,distancia[i]);
		}
		
		System.out.printf("Ingrese vertice destino: ");
		int destino = sc.nextInt();
		print(destino);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int E, origen, destino, peso, inicial;
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		for (int i = 0; i < V; i++) {
			ady.add(new ArrayList<>());
		}
		
		for (int i = 0; i < E; i++) {
			origen = sc.nextInt();
			destino = sc.nextInt();
			peso = sc.nextInt();
			ady.get(origen).add(new Nodo(destino, peso));
			//No dirigido:
			//ady.get(destino).add(new Nodo(origen, peso));
		}
		System.out.println("Ingrese nodo de destino");
		inicial = sc.nextInt();
		dijkstra(inicial);
	}
}
