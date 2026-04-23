
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		String res = "";
		
		for (int i = 0; i < cases; i++) {
			int p = sc.nextInt();
			int s = sc.nextInt();
			int r = sc.nextInt();
			if(p==s && r!=1) {
				res = "No";
			}else {
				res = "Yes";
			}
			System.out.println("Case "+(i+1)+": "+res);
		}
	}

}
