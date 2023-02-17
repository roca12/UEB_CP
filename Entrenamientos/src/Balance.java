import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos= sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			String linea =sc.nextLine();
			while (linea.contains("()")||linea.contains("[]")) {
				linea=linea.replace("()", "");
				linea=linea.replace("[]", "");
			}
			
			if (linea.length()!=0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}

	}

}
