
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int a=sc.nextInt();
			int f=sc.nextInt();
			for (int i = 0; i < f; i++) {
				for (int j = 1; j <= a; j++) {
					for (int j2 = 0; j2 < j; j2++) {
						System.out.print(j);
					}
					System.out.println(" ");
				}
				for (int j = a-1; j >=1; j--) {
					for (int j2 = 0; j2 < j; j2++) {
						System.out.print(j);
					}
					System.out.println(" ");
				}
				if (i!=f-1) {
					System.out.println(" ");
				}
				
			}
				
		}

	}

}
