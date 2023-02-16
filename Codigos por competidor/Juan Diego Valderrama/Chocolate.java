import java.util.Scanner;

public class Chocolate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int row = 0;
			int columns = 0;
			row = sc.nextInt();
			columns = sc.nextInt();
			int cuts = (row * columns) - 1;
			System.out.println(cuts);
		}
	}

}
