import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        long min = b[0];
        long max = b[0];

        for (int i = 1; i < n; i++) {
            min = Math.min(min, b[i]);
            max = Math.max(max, b[i]);
        }

        long countMin = 0;
        long countMax = 0;

        for (int i = 0; i < n; i++) {
            if (b[i] == min) countMin++;
            if (b[i] == max) countMax++;
        }

        long maxDifference = max - min;
        long ways;

        if (min == max) {
        	//Toda combinacion posible de par entre n elementos
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = countMin * countMax;
        }

        System.out.println(maxDifference + " " + ways);
    }
}
