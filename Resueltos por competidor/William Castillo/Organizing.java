
import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;

public class Organizing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			boolean monda[] = { false, false, false, false, false, false, false, false, false, false };
			int num[] = new int[10];
			boolean com = false;
			int tot =0;
			int l = sc.nextInt();
			for (int j = 0; j < l; j++) {
				int belle = sc.nextInt();
				int dificultad = sc.nextInt();
				if (monda[dificultad-1] == false) {
					monda[dificultad-1] = true;
					num[dificultad-1] = belle;
				}
				if (num[dificultad-1] < belle) {
					num[dificultad-1] = belle;
				}
			}
			for (int j = 0; j < num.length; j++) {
				if (monda[j] == false) {
					com = true;
				}
			}
			if (com == true) {
				System.out.println("MOREPROBLEMS");
			} else {
				for (int j = 0; j < num.length; j++) {
					tot += num[j];
				}
				System.out.println(tot);
			}
		}
	}
}
