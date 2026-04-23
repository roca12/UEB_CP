import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prefix = new int[n];

        prefix[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + sc.nextInt();
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();
            int idx = Arrays.binarySearch(prefix, q);
            if (idx < 0) idx = -idx - 1;
            System.out.println(idx + 1);
        }
    }
}
