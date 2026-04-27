package codechef;
import java.util.Scanner;
public class Fiebre {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int casos=0;
	int temperatura=0;
	casos = sc.nextInt();
	
	for (int i = 0; i > casos; i++) {
		temperatura = sc.nextInt();
		if (temperatura>98) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	}

}
