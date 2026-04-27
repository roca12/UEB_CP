import java.util.Scanner;

public class ClasesBiryani {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ncasos = sc.nextInt();
		for(int i = 0; i<ncasos; i++) {
			int semanas = sc.nextInt();
			int monedas = sc.nextInt();
			int result;
			result = semanas * monedas;
		    System.out.println(result);
		}
	}

}
