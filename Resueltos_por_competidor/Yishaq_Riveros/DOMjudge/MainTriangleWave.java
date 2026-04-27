import java.util.Scanner;

public class MainTriangleWave {

	private static String[] forma = {"1", "22", "333", "4444","55555","666666", "7777777", "88888888", "999999999" };
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int contador = sc.nextInt();
		while(contador>0) {
			contador--;
			int altura=sc.nextInt();
			int reptcontador= sc.nextInt();
			String str=DibujarTriangulo(altura);
			for (int i = 0; i < reptcontador; i++) {
				System.out.println(str);
				if (i != reptcontador - 1) {
					System.out.println();
				}
			}
		}
	}
	
	private static String DibujarTriangulo (int altura) {
		String resultado="";
		for (int i=0; i < altura; i++) {
			resultado+=(forma[i]);
			resultado+=('\n');
		}
		for (int i = altura - 2; i >=0; i--) {
			resultado+=(forma[i]);
			if (i!=0) {
				resultado+=('\n');
			}
		}
		return resultado;
	}
}
