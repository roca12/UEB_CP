import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int casos = sc.nextInt();
			int lst[] = new int[casos];
			Arrays.fill(lst, -99);
			boolean fat = false;
			if (casos == 0) {
				break;
			} else {
				for (int i = 0; i <= casos-1; i++) {
					int c = sc.nextInt();
					int p = sc.nextInt();

					if ((i + p) < 0 || (i + p) > casos || lst[i+p] != -99) {
						fat = true;
					} else {
						lst[i+p] =c;
					}
				}
				
				if (fat == true) {
					System.out.println("-1");
				} else {
					String aux = Arrays.toString(lst);
					System.out.println(aux.replaceAll(",", "").replace("[", "").replace("]", ""));
				}
				
			}

		}

	}
}
