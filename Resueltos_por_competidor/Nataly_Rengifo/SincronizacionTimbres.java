import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int mincommul = Math.max(x, y);

      
        while (true) {
            if (mincommul % x == 0 && mincommul % y == 0) {
                System.out.println(mincommul);
                break;
            }
            mincommul++;
        }

    }
}