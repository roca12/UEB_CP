import java.util.Arrays;

public class CribaEratostenes {
	
	static boolean[] criba(int N) {
		boolean[] primos = new boolean[N+1];
		Arrays.fill(primos, true);
		primos[0]=primos[1]=false;
		for (int p = 2; p*p <=N; p++) {
			if (primos[p]) {
				for (int i =p*p; i <=N; i+=p) {
					primos[i]=false;
				}
			}
		}
		return primos;
		
	}
	// complejidad algoritmica

	public static void main(String[] args) {
		int index=0;
		for (boolean b : criba(100)) {
			System.out.println(index+"->"+b);
			index++;
		}

	}

}
