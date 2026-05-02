
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){

		int T = sc.nextInt();
		int casos = 1;
		for (int i = 0; i < T; i++) {
			int acumulador = 0;
			int n = sc.nextInt(); 
			int P = sc.nextInt(); 
			int J = sc.nextInt(); 
			int contador = 0;
			for (int j = 0; j < n; j++) {
				int Q = sc.nextInt();
				if((acumulador + Q <= J) && (contador < P)) {
					acumulador += Q;
					contador ++;
				}
				
			}
			System.out.println("Case " + casos + ": " +contador);
			casos ++;
		}
	}

}
