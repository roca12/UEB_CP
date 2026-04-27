//Time Limit Exceeded

import java.io.*;
import java.util.*;

public class Main {
        static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader(); 
        String tInput = fr.next();
        if (tInput == null) return;
        int T = Integer.parseInt(tInput);

        for (int l = 1; l <= T; l++) {
            int n = fr.nextInt();
            int q = fr.nextInt();

            int[] sacos = new int[n];
            for (int i = 0; i < n; i++) {
                sacos[i] = fr.nextInt();
            }

            System.out.println("Case " + l + ":");
            
            for (int j = 0; j < q; j++) {
                int tipo = fr.nextInt();
                if (tipo == 1) {
                    int pos = fr.nextInt();
                    System.out.println(sacos[pos]);
                    sacos[pos] = 0;
                } else if (tipo == 2) {
                    int pos = fr.nextInt();
                    int valor = fr.nextInt();
                    sacos[pos] += valor;
                } else if (tipo == 3) {
                    int inicio = fr.nextInt();
                    int fin = fr.nextInt();
                    long total = 0;
                    for (int m = inicio; m <= fin; m++) {
                        total += sacos[m];
                    }
                    System.out.println(total);
                }
            }
        }
    }
}

            
            
            
            
