import java.util.Scanner;

public class Big_Chocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			try {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int resul = (m*n)-1;
			System.out.println(resul);
			}catch(Exception e){
				
			}
		}

	}

}
