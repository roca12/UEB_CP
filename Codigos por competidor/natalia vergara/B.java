import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < casos; i++) {
			int cont = 0;
			String a = sc.nextLine();
			String b = sc.nextLine();
			a = a.replace(".", ",");
			b = b.replace(".", ",");
			String[] aa = a.split(",");
			String[] bb = b.split(",");
			
			for (int j = 0; j < aa.length; j++) {
				int aux = Integer.parseInt(aa[j]);
				int aux2 = Integer.parseInt(bb[j]);
				if (Integer.parseInt((Integer.toBinaryString(aux))) == aux2) {
					cont++;
				}
			}
			if (cont == aa.length) {
				System.out.println("Case " + (i + 1) + ": Yes");
			} else {
				System.out.println("Case " + (i + 1) + ": No");
			}
		}
	}

}
