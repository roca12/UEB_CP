import java.util.Scanner;
 /*
	 * Autor: Carlos Eduardo Cobaleda Moreno
	 * Problema: A juice in the glass
	 * Juez online: LightOJ
	 * Veredicto: Accepted
	 * URL: https://lightoj.com/problem/juice-in-the-glass
	 */
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			double h = sc.nextDouble();
			double p = sc.nextDouble();
			double ph = p/h;
			double rsl = r2 + ((r1- r2) * ph);
			double srs = (rsl*rsl) + (r2*r2) + (rsl*r2);
			double v = (Math.PI/3) * srs * p;
			System.out.println("Case " + (i+1) + ":" + " "+ v);
			
		}
		
	}

}
