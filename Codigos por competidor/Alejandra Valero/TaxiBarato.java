import java.util.Scanner;

public class TaxiBarato {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int ncasos = sc.nextInt();
		      for(int i = 0; i<ncasos; i++) {
			      int p1, p2;
			      p1 = sc.nextInt();
			      p2 = sc.nextInt();
			  if (p1 > p2) {
				  System.out.println("SECOND");
			   } else if (p1 < p2) {
				  System.out.println("FIRST");
			   } else if (p1 == p2){
				  System.out.println("ANY");
			   }
  }
 }
}