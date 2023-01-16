package ClasificaroriaNacional;

import java.util.Scanner;

public class Factoriales {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int cas = 1; cas<=t; cas++) {
			long num = sc.nextLong();
			int fact = 1;
			long aux = 1;
			String imp = "";
			
			do{
				aux *= fact;
				fact++;
			}while(aux*fact<=num);
			
			fact--;
			num -= aux;
			aux /= fact;
			imp = fact+"!";
			
			for(int i=fact-1; i>0; i--){
				if(num-aux >= 0) {
					num -= aux;
					imp = i+"!+"+imp;
					if(num==0) break;
				}
				aux /= i;
			}
			
			if(num==0) System.out.println("Case "+cas+": "+imp);
			else if(num==1) System.out.println("Case "+cas+": "+"0!+"+imp);
			else System.out.println("Case "+cas+": "+"impossible");
			
		}
		
	}
	
}
