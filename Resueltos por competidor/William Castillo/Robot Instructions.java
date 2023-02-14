import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int t2 = sc.nextInt();
			ArrayList<Integer>pt = new ArrayList<>();
			int cont = 0;
			sc.nextLine();
			for (int j = 0; j < t2; j++) {
				String instruccion = sc.nextLine();
				
				if (instruccion.equals("LEFT")) {
					cont--;
					pt.add(-1);
				} else if (instruccion.equals("RIGHT")) {
					cont++;
					pt.add(1);
				} else {
					String aux = instruccion.substring(8);
					int probar = Integer.parseInt(aux);
					pt.add(pt.get(probar-1));
					cont = cont + pt.get(probar-1);
				}
			}
			
			System.out.println(cont);
			
		}
		
	}

}