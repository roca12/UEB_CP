import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            int maximo = Integer.MIN_VALUE;
            int conteo = 0;
            for (int i = 0; i < n; i++) {
                int actual = sc.nextInt();

                if (actual > maximo) {
                    maximo = actual;
                    conteo = 1;
                } else if (actual == maximo) {
                    conteo++;
                }
            }
            System.out.println(maximo + " " + conteo);
        }
    }
}