import java.util.ArrayList;
import java.util.Scanner;

public class ListaAdyacencia {
	
	static class Vertice{
		ArrayList<Camino> adj;
		public Vertice() {
			adj= new ArrayList<>();
		}
	}
	
	static class Camino{
		int hasta,peso;
		public Camino(int hasta,int peso) {
			this.hasta=hasta;
			this.peso=peso;
		}
	}

	static Vertice[] grafo;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int v=sc.nextInt(); int c=sc.nextInt();
		grafo = new Vertice[v];
		for (int i = 0; i < grafo.length; i++) {
			grafo[i]= new Vertice();
			grafo[i].adj=new ArrayList<>();
		}
		for (int i = 0; i < c; i++) {
			int desde=sc.nextInt();
			int hasta=sc.nextInt();
			int peso=sc.nextInt();
			grafo[desde].adj.add(new Camino(hasta, peso));
			grafo[hasta].adj.add(new Camino(desde, peso));
		}
		print();

	}
	
	static void print() {
		for (int i = 0; i < grafo.length; i++) {
			for (int j = 0; j < grafo[i].adj.size(); j++) {
				System.out.print(grafo[i].adj.get(j).peso+"\t");
			}
			System.out.println();
		}
	}

}
