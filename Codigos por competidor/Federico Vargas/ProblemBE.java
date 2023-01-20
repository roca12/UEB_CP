import java.util.Scanner;

public class ProblemBE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Amplitud;
		int Frecuencia;
		
		
		int casos = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < casos; i++) {
			String resultado = ""; 
			Amplitud = sc.nextInt();
			Frecuencia = sc.nextInt();
			sc.nextLine();
			
			for (int j = 0; j < Frecuencia; j++) {
				//Primera parte
				for (int k = 1; k <= Amplitud; k++) {
					for (int p = 0; p < k; p++) {
						resultado += k;
					}
					resultado += "\n";
				}
				
				//Segunda parte
				for (int o = Amplitud-1; o > 0; o--) {
					for (int s = o; s > 0; s--) {
						resultado += o;
					}
					resultado += "\n";
				}
				resultado += "\n";
			}
			System.out.println(resultado);
		}
	}
}
