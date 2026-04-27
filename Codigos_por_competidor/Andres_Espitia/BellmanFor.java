import java.util.*;

public class BellmanFor {

	static final int MAX = 105;
	static final int INF = 1<<30;
	static int[] previo = new int[MAX];
	static int[] distancia = new int[MAX];
	static int vertices;
	static List<List<Nodo>> ady = new ArrayList<List<Nodo>>();
	static Scanner sc = new Scanner(System.in);
	
	static class Nodo{
		int hasta, peso;
		
		public Nodo(int hasta, int peso) {
			this.hasta = hasta;
			this.peso = peso;
		}
	}
	
	static void init() {
		for(int i=0; i<=vertices; i++) {
			distancia[i] = INF;
			previo[i] = -1;
		}
	}
	
	static void print (int destino) {
		if(previo[destino] != -1) {
			print(previo[destino]);
		}
		System.out.printf("%d ",destino);
	}
	
	static boolean relajacion(int actual, int adyacente, int peso) {
		if(distancia[actual]+peso < distancia[adyacente]) {
			distancia[adyacente] = distancia[actual]+peso;
			previo[adyacente] = actual;
			return true;
		}
		return false;
	}
	
	static void bf(int inicial) {
		init();
		distancia[inicial]=0;
		for (int i = 0; i < vertices-1; i++) {
			for (int actual = 0; actual < vertices; actual++) {
				for (int j = 0; j < ady.get(actual).size(); j++) {
					int adyacente = ady.get(actual).get(j).hasta;
					int peso = ady.get(actual).get(j).peso;
					relajacion(actual, adyacente, peso);
				}
			}
		}
		
		// si se necesita un ciclo negativo
		
		for (int actual = 0; actual < vertices; actual++) {
			for (int i = 0; i < ady.get(actual).size(); i++) {
				int adyacente = ady.get(actual).get(i).hasta;
				int peso = ady.get(actual).get(i).peso;
				if(relajacion(actual, adyacente, peso)) {
					System.out.println("Existe un ciclo negativo");
					return;
				}
			}
		}
		
		System.out.println("No existe ciclo negativo");
		System.out.printf("Distancias mas cortas iniciando desde el nodo %d\n",inicial);
		for (int i = 0; i < distancia.length; i++) {
			System.out.printf("Nodo %d, distancia mas corta = %d\n",i,distancia[i]);
		}
		
		System.out.println("\n Camino mas corto");
		System.out.println("Ingrese el nodo destino");
		int destino = sc.nextInt();
		print(destino);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		int E, origen, destino, peso, inicial;
		E = sc.nextInt();
		for (int i = 0; i < vertices; i++) {
			ady.add(new ArrayList<>());
		}
		
		for (int i = 0; i < E; i++) {
			origen = sc.nextInt();
			destino = sc.nextInt();
			peso = sc.nextInt();
			ady.get(origen).add(new Nodo(destino, peso));
			//no dirigido
			//ady.get(destino).add(new Nodo(origen, peso));
		}
		
		inicial = sc.nextInt();
		bf(inicial);
	}
}
