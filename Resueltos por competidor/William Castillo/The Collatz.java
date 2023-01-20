import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caso = 0;
		while (sc.hasNext()) {
			int cont = 0;
			int aux = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int num = a;
			int tope = b;
			
			if (a < 0 || b < 0) {
				break;
			} else {
				caso++;
				while (true) {
					if (a == 1) {
						cont++;
						break;
					}
					if (a%2==0) {
						a = a/2;
						cont++;
						if (a == 1) {
							cont++;
							break;
						}
					} else {
					aux = (a*3)+1;
					
						if (b-aux<0) {
							cont++;
							break;
						}else {
							a = (a*3)+1;
							cont++;
						}
						
					}
					
				}
				
			}
			
			System.out.println("Case " + caso + ": A = " + num + ", limit = " + tope + ", number of terms = " + cont);
			
		}
		
	}

}