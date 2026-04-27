import java.util.Scanner;

public class IdentifyingTea {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		    while(sc.hasNext()) {
		    int cont = 0;
		    int nTe = sc.nextInt();
	    	int te1 = sc.nextInt();
	    	int te2 = sc.nextInt();
	    	int te3 = sc.nextInt();
	    	int te4 = sc.nextInt();
	    	int te5 = sc.nextInt();
            if (te1 == nTe) {
            	cont++;
            } if(te2 == nTe) {
            	cont++;
            } if(te3 == nTe) {
            	cont++;
            } if(te4 == nTe) {
            	cont++;
            } if(te5 == nTe) {
            	cont++;
            } System.out.println(cont);
  
		}
    }
}
