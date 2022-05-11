import java.util.Arrays;
import java.util.Scanner;

public class MatrizAdyacencia {
	
	static int[][] grafo;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v=sc.nextInt();
		int a=sc.nextInt();
		//tiene que estar incializada en inf
		grafo= new int[v][v];
		for (int i = 0; i < v; i++) {
			//memset(grafo,MAX_INT,V)
			Arrays.fill(grafo[i], Integer.MAX_VALUE);
		}
		
		for (int i = 0; i < a; i++) {
			int desde,hasta,peso;
			desde=sc.nextInt();
			hasta=sc.nextInt();
			peso=sc.nextInt();
			grafo[desde][hasta]=peso;
			grafo[hasta][desde]=peso;
		}
		print(grafo);
	}
	
	static void print(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]==Integer.MAX_VALUE) {
					System.out.print("inf"+"\t");
					continue;
				}
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	

}
