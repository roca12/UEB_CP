import java.util.Scanner;

class Nibble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x=sc.nextInt();
			if (x%4==0) {
				System.out.println("Good");
			}else {
				System.out.println("Not good");
			}
		}
	}
}
