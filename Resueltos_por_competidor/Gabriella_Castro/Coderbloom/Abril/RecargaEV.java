import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea1 = br.readLine();
        if (linea1 == null) return;
        
        StringTokenizer st = new StringTokenizer(linea1);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] costos = new int[m];
        int[] capacidades = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) costos[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) capacidades[i] = Integer.parseInt(st.nextToken());

        ordenar(costos, capacidades, 0, m - 1);

        long total = 0;
        int restantes = n;
        for (int i = 0; i < m && restantes > 0; i++) {
            int sesiones = Math.min(restantes, capacidades[i]);
            total += (long) sesiones * costos[i];
            restantes -= sesiones;
        }
        System.out.println(total);
    }

    static void ordenar(int[] costos, int[] caps, int low, int high) {
        if (low < high) {
            int pi = partition(costos, caps, low, high);
            ordenar(costos, caps, low, pi - 1);
            ordenar(costos, caps, pi + 1, high);
        }
    }

    static int partition(int[] costos, int[] caps, int low, int high) {
        int mid = low + (high - low) / 2;
        int pivot = costos[mid];

        intercambiar(costos, caps, mid, high);

        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (costos[j] <= pivot) {
                i++;
                intercambiar(costos, caps, i, j);
            }
        }
        intercambiar(costos, caps, i + 1, high);
        return i + 1;
    }

    static void intercambiar(int[] costos, int[] caps, int a, int b) {
        int tempP = costos[a];
        costos[a] = costos[b];
        costos[b] = tempP;
        
        int tempC = caps[a];
        caps[a] = caps[b];
        caps[b] = tempC;
    }
}