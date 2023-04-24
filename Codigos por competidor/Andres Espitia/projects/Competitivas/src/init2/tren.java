package init2;

import java.util.Scanner;

public class tren {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int tren[] = new int[n];
	        
	        for(int i=0; i<n; i++) tren[i] = sc.nextInt();;
	        int cont = 0;
	        for(int i=0; i<n; i++){
	            for(int j = n-1; j > i; j--) {
					if(tren[j] < tren[j-1]) {
						int aux = tren[j];
						tren[j] = tren[j-1];
						tren[j-1] = aux;
						cont++;
					}
				}
	        }
	        System.out.println("Optimal train swapping takes "+cont+" swaps.");
	    }
	}
}
