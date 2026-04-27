import java.util.Scanner;

public class TriangleWave {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i<casos; i++) {
		int f = sc.nextInt();
		int a = sc.nextInt();
		int j = 0;
		int i1 = 1;

		if (f <= 9) {

			for (int k = 0; k < casos; k++) {

				for (int n = 1; n <= a; n++) {

					for (i1 = 1; i1 <= f; i1++) {

						for (j = 1; j <= i1; j++) {
							System.out.print(i1);

						}
						System.out.println("");
					}

					for (i1 = f; i1 >= 1; i1--) {

						for (j = 2; j <= i1; j++) {
							System.out.print(i1 - 1);
						}
						System.out.println("");
					}
				}
			}
		}
	}
  }
}
