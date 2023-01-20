package domjudgev2;
import java.util.Scanner;
public class MainAB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int r=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int cont=0;
			if (a==r) {
				cont=cont+1;
			}
			if (b==r) {
				cont=cont+1;
			}
			if (c==r) {
				cont=cont+1;
			}
			if (d==r) {
				cont=cont+1;
			}
			if (e==r) {
				cont=cont+1;
			}
			
			
		System.out.println(cont);	
		}

	}

}
