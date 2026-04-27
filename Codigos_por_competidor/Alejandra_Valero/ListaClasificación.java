import java.util.Scanner;

public class ListaClasificación {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
           int ncasos = sc.nextInt();
		for (int i = 0; i < ncasos; i++) {
			int num = sc.nextInt();
			if(num % 25 == 0) {
			   int result = num/25;
			   System.out.println(result);
			} else {
				int resultt = Math.round(num/25);
				System.out.println(resultt+1);
			}
		}
	}
}
