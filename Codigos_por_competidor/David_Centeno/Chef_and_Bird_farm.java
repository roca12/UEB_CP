package codechef;
import java.util.*;
public class Chef_and_Bird_farm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			if (z%x==0 && z%y==0) {
				System.out.println("Any");
			} else if (z%x==0 && z%y!=0) {
				System.out.println("Chicken");
			} else if (z%x!=0 && z%y==0) {
				System.out.println("Duck");
			} else if(z%x!=0 && z%y!=0) {
				System.out.println("None");
			}
		}

	}

}
