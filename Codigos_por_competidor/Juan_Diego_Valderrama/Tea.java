import java.util.Scanner;

public class Tea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char correct = sc.next().charAt(0);
			String answers = (sc.next() + "" + sc.next() + "" + sc.next() + "" + sc.next() + "" + sc.next());
			int cont = 0;
			for (int i = 0; i < answers.length(); i++) {
				if (correct == answers.charAt(i)) {
					cont++;
				}
			}
			System.out.println(cont);
		}
	}

}
