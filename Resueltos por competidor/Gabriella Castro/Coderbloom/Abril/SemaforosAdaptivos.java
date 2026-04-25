import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String linea1 = br.readLine();
        if (linea1 == null) return;
        
        StringTokenizer st = new StringTokenizer(linea1);
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int verdes = 0;

        for (int i = 0; i < n; i++) {
            String lineaSemaforo = br.readLine();
            if (lineaSemaforo == null) break;
            
            st = new StringTokenizer(lineaSemaforo);
            int g = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            if (t % p < g) {
                verdes++;
            }
        }
        System.out.println(verdes);
    }
}