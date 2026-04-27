import java.util.*;

public class Main {
    static final int MAX = 1000;
    static Scanner sc = new Scanner(System.in);
    
    static char ady[][] = new char[MAX][MAX];
    static boolean refrescado[][] = new boolean[MAX][MAX];
    static boolean visitadoComp[][] = new boolean[MAX][MAX];
    
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    
    static int h, w;

    static class Estado {
        int x, y;
        Estado(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        if (!sc.hasNextInt()) return;
        
        h = sc.nextInt();
        w = sc.nextInt();
        sc.nextLine(); 

        Queue<Estado> colaAire = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            String fila = sc.nextLine();
            for (int j = 0; j < w; j++) {
                ady[i][j] = fila.charAt(j);
                if (ady[i][j] == 'A') {
                    refrescado[i][j] = true;
                    colaAire.add(new Estado(i, j));
                }
            }
        }

        while (!colaAire.isEmpty()) {
            Estado actual = colaAire.poll();

            for (int i = 0; i < 4; i++) {
                int nx = actual.x + dx[i];
                int ny = actual.y + dy[i];

                if (nx >= 0 && nx < h && ny >= 0 && ny < w && 
                    ady[nx][ny] != '#' && !refrescado[nx][ny]) {
                    
                    refrescado[nx][ny] = true;
                    colaAire.add(new Estado(nx, ny));
                }
            }
        }

        int totalRefrescados = 0;
        int componentesSinRefrescar = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (ady[i][j] == '.') {
                    if (refrescado[i][j]) {
                        totalRefrescados++;
                    } else if (!visitadoComp[i][j]) {
                        componentesSinRefrescar++;
                        bfsComponente(i, j);
                    }
                }
            }
        }

        System.out.println(totalRefrescados + " " + componentesSinRefrescar);
    }

    static void bfsComponente(int r, int c) {
        Queue<Estado> q = new LinkedList<>();
        q.add(new Estado(r, c));
        visitadoComp[r][c] = true;

        while (!q.isEmpty()) {
            Estado actual = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = actual.x + dx[i];
                int ny = actual.y + dy[i];

                if (nx >= 0 && nx < h && ny >= 0 && ny < w && 
                    ady[nx][ny] == '.' && !refrescado[nx][ny] && !visitadoComp[nx][ny]) {
                    
                    visitadoComp[nx][ny] = true;
                    q.add(new Estado(nx, ny));
                }
            }
        }
    }
}