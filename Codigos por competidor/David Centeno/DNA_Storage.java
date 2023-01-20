package codechef;
import java.util.*;
public class DNA_Storage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int n=sc.nextInt();
			String s=sc.next();
			for (int i = 0; i < n; i=i+2) {
				if (s.substring(i,i+2).equals("00")) {
					System.out.print("A");
				} else if (s.substring(i,i+2).equals("01")) {
					System.out.print("T");
				} else if (s.substring(i,i+2).equals("10")) {
					System.out.print("C");
				} else if (s.substring(i,i+2).equals("11")) {
					System.out.print("G");
				}
				
			}
			System.out.println();
			
		}

	}

}
