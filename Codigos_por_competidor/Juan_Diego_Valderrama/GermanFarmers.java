import java.util.Scanner;

public class GermanFarmers {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int farmers = sc.nextInt();
			int premium = 0;
			for (int j = 0; j < farmers; j++) {
				int size = sc.nextInt();
				int animals = sc.nextInt();
				int eco = sc.nextInt();
				int average = (animals / size);
				int premiumper = average * eco;
				premium += premiumper * animals;
			}
			System.out.println(premium);
			
		}
	}
}
