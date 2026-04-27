import java.util.Scanner;

public class PalindromicNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		String b = "";
		for (int i = 0; i < casos; i++) {
			String a = sc.next();
			char[] lista = a.toCharArray();
			for (int j = lista.length - 1; j >= 0; j--) {
				b = b + lista[j];
			}
			if (b.equals(a)) {
				System.out.println("Case " + (i + 1) + ": Yes");
			} else {
				System.out.println("Case " + (i + 1) + ": No");
			}
			b = "";
		}
	}
}