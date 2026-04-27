import java.util.Scanner;
 
public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return; 
        
        int t = sc.nextInt();
        int c = 0;
 
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            
         if (s.contains("++")) {
                c++;
            } else if (s.contains("--")) {
                c--;
            }
        }
        
        System.out.println(c);
        sc.close();
    }
}
