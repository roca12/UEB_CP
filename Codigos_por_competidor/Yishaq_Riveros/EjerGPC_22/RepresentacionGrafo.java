//ESTE ES MATRIZ DE ADYACENCIA  
import java.util.Scanner;

public class RepresentacionGrafo {
	
	static int [][] G;
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		int V=sc.nextInt(); //V = Vertex - Caminos
		int E=sc.nextInt(); //E = Nodos
		G= new int [V][V];
		for (int i = 0; i < E; i++) {
			int desde, hasta, peso;
			desde=sc.nextInt();
			hasta=sc.nextInt();
			peso=sc.nextInt();
			
			//si es dirigido
			G[desde][hasta]=peso;
			
			//no dirigido
			G[hasta][desde]=peso;
		}
		print(V);
		
	}
	static void print (int V){
		for (int i = 0; i < V; i++) { //va bajando por filas
			for (int j = 0; j < V; j++) { //baja por columnas de cada fila
				System.out.print(G[i][j]+" ");
			}
			System.out.println();
		}
	}

}
