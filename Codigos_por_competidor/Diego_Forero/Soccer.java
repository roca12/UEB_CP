import java.util.Scanner;

public class Soccer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		int[] partidos = new int[3];
		int mp = 0, pts = 0, w = 0, d = 0, l = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					for (int k2 = 0; k2 < 5; k2++) {
						if (numeros[i]==numeros[j]+numeros[k]+numeros[k2]) {
							mp = numeros[i];
							partidos[0] = numeros[j];
							partidos[1] = numeros[k];
							partidos[2] = numeros[k2];
						}
					}
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			if (numeros[i] != mp && numeros[i] != partidos[0] && numeros[i] != partidos[1] && numeros[i] != partidos[2]) {
				pts = numeros[i];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(pts == partidos[i]*3 + partidos[j] && i != j) {
					w = partidos[i];
					d = partidos[j];
					if ((i==0 || i==1) && (j==0 || j==1)) {
						l = partidos[2];
					} else if ((i==0 || i==2) && (j==0 || j==2)) {
						l = partidos[1];
					} else {
						l = partidos [0];
					}
				}
			}
		}
		System.out.println(mp+" "+w+" "+d+" "+l+" "+pts);
		//int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt(), n4 = sc.nextInt(), n5 = sc.nextInt();
		
	}

}
