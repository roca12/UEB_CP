import java.util.Scanner;

public class TariffPlan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int cases=1;
		for (int i = 0; i < t; i++) {
			int mile = 0, juice = 0;
			int numllamadas = sc.nextInt();
			for (int j = 0; j < numllamadas; j++) {
				double tiempoactual = sc.nextInt();

				double cant =  Math.ceil(tiempoactual / 30);
				if(tiempoactual%30==0) {
					cant++;
				}
				double costA = cant * 10;

				double cant2 =  Math.ceil(tiempoactual / 60);
				if(tiempoactual%60==0) {
					cant2++;
				}
				double costB = cant2 * 15;

				mile += costA;
				juice += costB;

			}
			if (mile < juice) {
				System.out.println("Case " + cases + ": Mile " + mile);
			} else if (mile > juice) {
				System.out.println("Case " + cases + ": Juice " + juice);
			} else {
				System.out.println("Case " + cases + ": Mile Juice " + mile);
			}
			cases++;

		}

	}
}
