package ClasificaroriaNacional;

import java.util.Scanner;

public class DecodeTheTape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = {0,0,64,32,16,8,0,4,2,1,0};
		String lec, imp = "";
		while(sc.hasNext()){
			lec = sc.nextLine();
			int aux = 0;
			
			if(lec.charAt(0)!='|'){
				continue;
			}
			
			for(int i=2; i<=9; i++){
				if(lec.charAt(i)=='o'){
					aux += numeros[i];
				}
			}
			imp += (char)aux;			
		}
		System.out.print(imp);
	}
}
