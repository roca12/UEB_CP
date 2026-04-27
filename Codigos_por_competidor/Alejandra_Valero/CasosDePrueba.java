import java.util.Scanner;

public class CasosDePrueba {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ncasos = sc.nextInt();
		for(int i = 0; i<ncasos; i++) {
			int puntos=sc.nextInt();
			int casos=sc.nextInt();
			int div = puntos/10;
			int result = div*casos;
			System.out.println(result);
		}
	}
}
