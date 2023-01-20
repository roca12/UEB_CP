package codechef;
import java.util.*;
public class Speciality {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t=sc.nextInt();
	while (t-->0) {
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if (x>y && x>z) {
			System.out.println("Setter");
		} else {
			if (y>x && y>z) {
				System.out.println("Tester");
		} else {
			System.out.println("Editorialist");
		}
	}
	}

	}

}
