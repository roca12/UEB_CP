import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BellamanFord {

	
	static final int MAX = 105;
	static final int INF = 1 << 30;
	static int [] previo = new int [MAX];
	static int [] distacia = new int [MAX];
	static int vertices;
	static List<List<Nodo>> ady = new ArrayList<List<Nodo>>();
	
	static Scanner sc = new Scanner (System.in);
	
	static class Nodo{
		int hasta, peso;
		
		public Nodo(int hasta, int peso) {
			this.hasta = hasta;
			this.peso = peso;
		}
	}
	
	static void init() {
		for (int i = 0; i < vertices; i++) {
			distacia[i]=INF;
			previo[i]=-1;
		}
	}
	
	static void print (int destino) {
		if (previo [destino]!=-1) {
			print(previo[destino]);
		}
		System.out.printf("%d ",destino);
	}
	
	static boolean relajacion(int actual, int adyacente, int peso) {
		if (distacia[actual]+peso<distacia[adyacente]) {
			distacia[adyacente]=distacia[actual]+peso;
			previo[adyacente]=actual;
			return true;
		}
		return false;
	}
	static void bf(int inicial) {
		init();
		distacia[inicial]=0;
		for (int i = 0; i < vertices-1; i++) {
			for (int actual = 0; actual < vertices; actual++) {
				for (int j = 0; j < ady.get(actual).size();j++) {
					int adyacente = ady.get(actual).get(j).hasta;
					int peso = ady.get(actual).get(j).peso;
					relajacion(actual, adyacente, peso);
				}				
			}			
		}
		//solo si se necesita buscar ciclo negativo
		for (int actual = 0; actual < vertices; actual++) {
			for (int i = 0; i < ady.get(actual).size(); i++) {
				int adyacente = ady.get(actual).get(i).hasta;
				int peso = ady.get(actual).get(i).peso;
				if (relajacion(actual, adyacente, peso)) {
					System.out.println("Existe un ciclo negativo");
					return;
				}
			}
		}
		System.out.println("No existe ciclo negativo");
		System.out.printf("distacias mas cortas iniciand desde el nodo %d \n", inicial);
		for (int i = 0; i < vertices; i++) {
			System.out.printf("Nodo %d, distacia mas corta = %d\n",i,distacia[i]);
		}
		System.out.println("\n camino mas corto");
		System.out.println("ingrese el vertice o nodo destino");
		int destino=sc.nextInt();
		print(destino);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int E, origen, destino, peso, inicial;
		vertices=sc.nextInt();
		E=sc.nextInt();
		for (int i = 0; i < vertices; i++) {
			ady.add(new ArrayList<>());
		}
		
		for (int i=0; i<E; i++) {
			origen=sc.nextInt();
			destino=sc.nextInt();
			peso=sc.nextInt();
			ady.get(origen).add(new Nodo(destino, peso));
			//ady.get(destino).add(new Nodo(origen, peso));
		}
		
		inicial=sc.nextInt();
		bf(inicial);
	}
	
}
