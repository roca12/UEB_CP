import java.util.Collections;
import java.util.Scanner;

public class Problem_8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int test=sc.nextInt();
		for (int t = 1; t <=test; t++) {
			boolean res=false;
			String n=sc.next();
			StringBuilder r= new StringBuilder(n);
			if(n.equals(r.reverse().toString())) {
				System.out.println("Case "+t+": Yes");
			}else {
				System.out.println("Case "+t+": No");
			}
		}
	}
}
