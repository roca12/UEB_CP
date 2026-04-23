import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
        	
            int a = sc.nextInt();
            int b = sc.nextInt();
            boolean found = false;
            
            for (int j = 0; j < a; j++) {
				if (b == sc.nextInt()) {
					found = true;
				}
			}
            if(found) {
            	System.out.println("YES");
            }else {
            	System.out.println("NO");
            }
            
        }
    }
}
