import java.util.Scanner;

public class ProblemaV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		
		
		for (int i = 0; i < casos; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			
			System.out.println(A+B+C+D);
		}	
	}
}
