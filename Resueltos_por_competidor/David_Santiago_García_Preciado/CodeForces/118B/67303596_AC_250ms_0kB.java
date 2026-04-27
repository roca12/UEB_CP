import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Parte superior + centro
        for (int i = 0; i <= n; i++) {
        	printGift(i, n);
        }

        // Parte inferior
        for (int i = n - 1; i >= 0; i--) {
        	printGift(i, n);
        }
    }

    static void printGift(int i, int n) {
        // Espacios iniciales
        for (int s = 0; s < 2 * (n - i); s++) {
            System.out.print(" ");
        }

        // Parte creciente
        for (int x = 0; x <= i; x++) {
            System.out.print(x);
            if (x < i) System.out.print(" ");
        }

        // Parte decreciente
        for (int x = i - 1; x >= 0; x--) {
            System.out.print(" " + x);
        }

        System.out.println();
    }
}
