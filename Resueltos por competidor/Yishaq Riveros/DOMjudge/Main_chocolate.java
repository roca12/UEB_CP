import java.util.Scanner;

public class Main_chocolate {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
	
		int producto;
	
		while (lector.hasNext()) {
			int m=lector.nextInt();
			int n=lector.nextInt();

			producto=m*n;
			
			int resultado= producto - 1;
			System.out.println(resultado);
		}
		
		
	}
}
