import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Identifying_tea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int nNumeros = 0;
		while(sc.hasNext()) {
			int nTe = sc.nextInt();
			int contador = 0;
			List<Integer> numeros = new ArrayList<>();
			for(int j = 0; j < 5; j++) {
				nNumeros = sc.nextInt();
				numeros.add(nNumeros);
				//System.out.println(numeros.get(j));
				if(numeros.get(j)== nTe) {
					
					contador++;
				}else {
					
				}
			}
			
			System.out.println(contador);
			//nTe = sc.nextInt();
			}
		}

	}


