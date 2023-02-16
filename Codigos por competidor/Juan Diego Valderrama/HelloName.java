import java.util.Scanner;

public class HelloName {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String name = sc.nextLine();
			System.out.println("Hello " + name + "!");
		}
	}

}
