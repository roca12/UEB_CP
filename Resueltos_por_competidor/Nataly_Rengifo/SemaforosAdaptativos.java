import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long t = Long.parseLong(st.nextToken());

        int contVerde = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            long g = Long.parseLong(st.nextToken());
            long p = Long.parseLong(st.nextToken());

            if (t % p < g) {
                contVerde++;
            }
        }

        System.out.println(contVerde);
    }
}