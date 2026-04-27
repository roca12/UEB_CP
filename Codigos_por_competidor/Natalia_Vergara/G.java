import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] numeros = new int[n];
			for (int m = 0; m < n; m++) {
				numeros[m] = sc.nextInt();
			}
			System.out.println("Case "+(i+1)+":");
			for (int j = 0; j < q; j++) {
				int cont=0;
				int a = sc.nextInt();
				int b = sc.nextInt();
				for (int k = 0; k < numeros.length; k++) {
					if(numeros[k]>=a&&numeros[k]<=b) {
						cont++;
					}
				}
				System.out.println(cont);
				
			}
		}
	}

}
