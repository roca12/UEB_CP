
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BombsNoTheyAreMines {

	static final int MAX = 1001;

	static char ady[][] = new char[MAX][MAX];
	static boolean visitado[][] = new boolean[MAX][MAX];
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int h, w;
	
	
	static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
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

	static class Estado {
		int x;
		int y;
		int d;

		Estado(int x1, int y1, int d1) {
			this.x = x1;
			this.y = y1;
			this.d = d1;
		}

		Estado() {
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int x = 0, y = 0;
		while (true) {

			h = sc.nextInt();
			w = sc.nextInt();

			if (h == 0 && w == 0) {
				break;
			}
			
			int r_minas = sc.nextInt();
			for (int i = 0; i < r_minas; i++) {
				int fila = sc.nextInt();
				int cantidad = sc.nextInt();
				for (int j = 0; j < cantidad; j++) {
					int columna = sc.nextInt();
					ady[fila][columna] = '#';
				}
			}

			ady[sc.nextInt()][sc.nextInt()] = 'I';
			ady[sc.nextInt()][sc.nextInt()] = 'S';

			int min = BFS(x, y, h, w);
			if (min != -1) {
				System.out.println(min);
			} 

		}
	}

	static int BFS(int x, int y, int h, int w) {

		Estado inicial = new Estado(x, y, 0);

		Queue<Estado> Q = new LinkedList<>();

		Q.offer(inicial);
		for (int i = 0; i < h; i++) {
			Arrays.fill(visitado[i], false);
		}


		while (!Q.isEmpty()) {

			Estado actual = Q.peek();
			Q.poll();

			if (ady[actual.x][actual.y] == 'S') {

				return actual.d;
			}

			visitado[actual.x][actual.y] = true;
			for (int i = 0; i < 4; ++i) {
				int nx = dx[i] + actual.x;
				int ny = dy[i] + actual.y;
				if (nx >= 0 && nx < h && ny >= 0 && ny < w && ady[nx][ny] != '#' && !visitado[nx][ny]) {
					Estado adyacente = new Estado(nx, ny, actual.d + 1);
					Q.offer(adyacente);
				
				}
			}
		}
		return -1;
	}
}
