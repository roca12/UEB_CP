import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] v = new int[n];
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
                a[i] = sc.nextInt();
            }

            int max = 0;

            for (int i = 0; i < n; i++) {

                for (int j = i + 1; j < n; j++) {

                    int power = (a[i] * v[j]) + (v[i] * a[j]);

                    if (power > max) {
                        max = power;
                    }
                }
            }

            System.out.println(max);
        }
	 }
}
