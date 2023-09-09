import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x= sc.nextInt();
			int y= sc.nextInt();
			if((x+y)>6) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}
