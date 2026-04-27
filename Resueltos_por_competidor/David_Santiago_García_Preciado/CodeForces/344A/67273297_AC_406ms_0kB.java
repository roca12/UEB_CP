import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        int res = 1;
        char last = 'x';
        
        for (int i = 0; i < n; i++) {
        	String temp = sc.nextLine();
        	if(temp.charAt(0)==last) {
        		res++;
        	}
        	last = temp.charAt(1);
			
		}
        
        System.out.println(res);
    }
}
