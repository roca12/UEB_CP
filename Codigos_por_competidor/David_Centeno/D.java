package codechef;
import java.util.Scanner;
public class D {

	public static void main(String[] args) {
		String oldstring;
		String real = "https";
		Scanner sc = new Scanner(System.in);
		int casos =sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			oldstring=sc.nextLine();
			if (oldstring == real) {
				System.out.println(oldstring);
			}
			else {
				String newstring = oldstring.replace("http","https");
				System.out.println(newstring);
			}	
		}
		
		
		
		

	        

	       

	}

}
