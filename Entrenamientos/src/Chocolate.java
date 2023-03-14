import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			n=sc.nextInt();
			m=sc.nextInt();
			int resultado=(n*m)-1;
			System.out.println(resultado);
		}

	}

}
