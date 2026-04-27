package codechef;
import java.util.*;
public class Ranklist_Pages {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int x=sc.nextInt();
			if (x<=25) {
				System.out.println("1");
			} else if (x%25==0) {
				System.out.println(x/25);
			} else if (x>25) {
				System.out.println((x/25)+1);
			}

			}
		}
}

