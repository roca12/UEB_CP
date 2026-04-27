import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class If_We_Were_a_Child_Again {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			try {
			String entrada = sc.nextLine();
			String[] numero;
			String division = "/";
			String modulo = "%";
			entrada = entrada.replaceAll(" ", "");
			BigInteger resul = new BigInteger("0");
			BigInteger a = new BigInteger("0");
			BigInteger b = new BigInteger("0");
			if(entrada.contains(division)) {
				numero = entrada.split(division);
				for(int i = 0; i < 2; i++) {
					a = new BigInteger(numero[0]);
					b = new BigInteger(numero[1]);
				}
				resul = a.divide(b);
				System.out.println(resul);
			}else if(entrada.contains(modulo)) {
				numero = entrada.split(modulo);
				for(int i = 0; i < 2; i++) {
					a = new BigInteger(numero[0]);
					b = new BigInteger(numero[1]);
				}
				resul = a.mod(b);
				System.out.println(resul);
			}
			
			}catch(Exception e){
				
			}
		
			
		}

	}

}
