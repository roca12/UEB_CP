import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Barclassification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		sc.nextLine();
		char[][] matrix = new char[tam][tam];
		for (int i = 0; i < tam; i++) {
			String line = sc.nextLine();
			matrix[i] = line.toCharArray();
		}
		int maxvert = Integer.MIN_VALUE;
		int maxhori = Integer.MIN_VALUE;
		int posvert = Integer.MAX_VALUE;
		int poshor = Integer.MAX_VALUE;

		for (int i = 0; i < tam; i++) {
			String aux1 = String.copyValueOf(matrix[i]);
			int counthor = countOnes(aux1);
			String aux2 = "";
			for (int j = 0; j < tam; j++) {
				aux2 += matrix[j][i];
			}
			int countver = countOnes(aux2);

			if (maxhori < counthor) {
				maxhori = counthor;
				poshor = i;
			}

			if (maxvert < countver) {
				maxvert = countver;
				posvert = i;
			}

		}

		if (maxvert > maxhori) {
			System.out.println("|");
		} else if (maxvert < maxhori) {
			System.out.println("-");
		} else if (maxvert == maxhori && poshor == posvert) {
			System.out.println("+");
		}

	}

	static int countOnes(String str) {
		Pattern pattern = Pattern.compile("[1]");
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		return count;
	}

}
