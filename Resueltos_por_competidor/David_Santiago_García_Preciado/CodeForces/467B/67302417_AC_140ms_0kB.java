import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] army = new int[m + 1];
        for (int i = 0; i <= m; i++) {
            army[i] = sc.nextInt();
        }

        int fedor = army[m];
        int friends = 0;

        for (int i = 0; i < m; i++) {
            int diff = army[i] ^ fedor;
            if (Integer.bitCount(diff) <= k) {
            	friends++;
            }
        }

        System.out.println(friends);
    }
}
