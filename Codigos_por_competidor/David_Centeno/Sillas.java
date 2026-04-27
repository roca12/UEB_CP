package codechef;
import java.util.Scanner;
public class Sillas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int ex = y-x;
		if(ex < 0) {
	            ex = 0;
	        }
		System.out.println(ex);
		}
	}

}
