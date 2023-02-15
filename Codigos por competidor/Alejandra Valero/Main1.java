import java.util.Scanner;

public class Main1 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		String linea = sc.nextLine();
		while(true) {
			linea=sc.nextLine();
			if (linea.equals("___________")) {
				break;
			}
			
			//Expresion regular
			linea = linea.replaceAll("[^o ]", "");
			linea = linea.replaceAll("o", "1");
			linea = linea.replaceAll(" ", "0");
			//System.out.println(linea);
			int nascci = Integer.parseInt(linea, 2);
			System.out.print((char)nascci);
		}
	}
}
