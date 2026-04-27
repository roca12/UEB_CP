import java.util.Scanner;

public class RotatingSentences {
	
	public static void main(String []args){
		
    Scanner sc = new Scanner(System.in);
	String[] cad = new String[100];
	int oracion = 0;
	
	while(sc.hasNext())
	     cad[oracion++] = sc.nextLine();

	for(int i = 0; i < 100; ++i) {
		boolean rta = false;
		
		for(int j = oracion-1; j>= 0; j--) {
			
			if(i < cad[j].length()){
				rta = true;
				break;
				}
			}
		
		if(!rta) break;
		
		for(int j = oracion - 1; j >= 0; j--) {
			
			if(i < cad[j].length())
				System.out.print(cad[j].charAt(i));
			else
				System.out.print(" ");
		 }
		System.out.println();
  }
 }
}
