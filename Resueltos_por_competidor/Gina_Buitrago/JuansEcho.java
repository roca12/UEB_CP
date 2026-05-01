import java.util.Scanner;

public class JuansEcho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pal= sc.nextLine();
		
		for (int i = pal.length()-1; i >=0; i--) {
		System.out.print(pal.charAt(i));
		}
	}
		
	}


