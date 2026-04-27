import java.util.Scanner;
 
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine(); 
 
            for (int i = 0; i < n; i++) {
                String word = sc.nextLine();
                int L = word.length();
 
                if (L > 10) {
                    char first = word.charAt(0);
                    char last = word.charAt(L - 1);
                    int countInBetween = L - 2;
 
                    System.out.println("" + first + countInBetween + last);
                } else {
                    System.out.println(word);
                }
            }
        }
    }
}
