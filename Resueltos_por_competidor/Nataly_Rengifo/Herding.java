import java.io.*;
import java.util.*;

public class Herding {

    private static int n, m;
    private static char[][] ciudad;
    private static int[][] visitados;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ciudad = new char[n][m];
        visitados = new int[n][m];

        for (int i = 0; i < n; i++) {
            ciudad[i] = br.readLine().toCharArray();
        }

        int numTrampa = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (visitados[i][j] != 0) continue;

                int x = i;
                int y = j;

                
                while (visitados[x][y] == 0) {
                    visitados[x][y] = 1;

                    if (ciudad[x][y] == 'N') x--;
                    else if (ciudad[x][y] == 'S') x++;
                    else if (ciudad[x][y] == 'E') y++;
                    else if (ciudad[x][y] == 'W') y--;
                }

                
                if (visitados[x][y] == 1) {
                    numTrampa++;
                }

                
                x = i;
                y = j;

                while (visitados[x][y] == 1) {
                    visitados[x][y] = 2;

                    if (ciudad[x][y] == 'N') x--;
                    else if (ciudad[x][y] == 'S') x++;
                    else if (ciudad[x][y] == 'E') y++;
                    else if (ciudad[x][y] == 'W') y--;
                }
            }
        }

        System.out.println(numTrampa);
    }
}
