import java.util.Scanner;

public class RedirectUrl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {
			String a = sc.next();
			String[] b = a.split(":");
			String lista = b[1];
			System.out.println("Case " + (i + 1) + ": https:" + lista);
		}
	}
}
