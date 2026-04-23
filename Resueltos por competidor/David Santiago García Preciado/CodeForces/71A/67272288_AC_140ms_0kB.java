import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String n = sc.nextLine();
            int tam = n.length();
            
            if(tam>10) {
            	String res = n.charAt(0)+"";
            	res += (tam-2)+"";
            	res += n.charAt(tam-1);
            	System.out.println(res);
            }else {
            	System.out.println(n);
            }
            
        }
    }
}
