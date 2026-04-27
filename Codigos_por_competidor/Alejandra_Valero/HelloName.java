import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
	    for (int i = 0; i < casos; i ++) {
	         String aux = sc.next();
	         System.out.println("Hello " + aux + "!");
	    }    
	}
}
