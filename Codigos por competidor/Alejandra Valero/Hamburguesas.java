import java.util.Scanner;

public class Hamburguesas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for(int i= 0; i<casos; i++) {
			int empanadas=sc.nextInt();
			int bollos=sc.nextInt();
			int hamburguesa;
			if(empanadas<=bollos) {
			   hamburguesa = empanadas;
			   System.out.println(hamburguesa);
			} else {
				hamburguesa = bollos;
				System.out.println(hamburguesa);
		 }
	  }
   }	
}
