import java.util.Scanner;

public class Tape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont=0;
		String linea= sc.nextLine();
		while (true) {
			linea=sc.nextLine();
			if (linea.equals("___________")) {
				break;
			}
			//expresion regular 
			linea=linea.replaceAll("[^o ]", "");
			linea=linea.replace("o", "1");
			linea=linea.replace(" ", "0");
			//System.out.println(linea);
			int numero_ascii = Integer.parseInt(linea,2);
			System.out.print((char)numero_ascii);
		}
		

	}

}
