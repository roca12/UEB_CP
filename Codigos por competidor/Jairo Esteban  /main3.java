import java.util.Scanner;

//CCPL EJERCICIO FACTORIAL INVERSO
public class Main3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int nFac, n;
		n = 1;
		nFac = sc.nextInt();
		int i = 1;
		while (n != nFac) {
			n *= i;
			i++;
		}
		System.out.println(i - 1);
	}

}
