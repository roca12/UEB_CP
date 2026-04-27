import java.util.Scanner;

public class MasAlto {

	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int ncasos = sc.nextInt();
	    for(int i = 0; i<ncasos; i++) {
	    	int alice = sc.nextInt();
	    	int bob = sc.nextInt();
            if(alice > bob) {
               System.out.println("A");
            } else {
               System.out.println("B");
            }
    }
  }
}
