import java.util.Scanner;

public class Chocolate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
		int n1= sc.nextInt(), n2=sc.nextInt();
		System.out.println((n1*n2)-1);
		}
	}
}
