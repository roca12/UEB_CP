package ClasificaroriaNacional;

import java.util.Scanner;

public class urls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < t; i++) {
			String url = sc.nextLine();
			String[] aux = url.split(":");
			switch (aux[0]) {
			case "http":
				System.out.println("Case "+(i+1)+": https:"+aux[1]);
				break;
			case "https":
				System.out.println("Case "+(i+1)+": "+url);
				break;
			}
		}
	}

}
