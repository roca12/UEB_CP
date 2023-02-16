import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String cadena = sc.nextLine();
			if (cadena.isEmpty()==false) {
				for(int i = 0; i<cadena.length(); i++) {
					System.out.print((char)(cadena.charAt(i)-7));
				}
				System.out.println();
			} else {
				break;
			}
			
		}
	}

}
