package codechef;
import java.util.*;
public class Wordle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		
		
		int t=sc.nextInt();
		while (t-->0) {
			String c="";
			String Sh=sc.next();
			String th=sc.next();
			a=th.length();
			for (int i = 0; i < a; i++) {
					if (Sh.charAt(i)!=th.charAt(i)) {
						c+="B";
					} else {
						c+="G";
					}
			}
			System.out.println(c);
		}

	}

}
