
/*
* Autor: pgms1103-afk
* Problema: E. Cover it!
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/1176/E
* Difficulty: 1700
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class CoverIt {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Integer>[] grafo;
	static boolean visitados[];
	static int equipo[];

	public static void main(String[] args) throws NumberFormatException, IOException {

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {

			String datos[] = br.readLine().split(" ");
			int vertices = Integer.parseInt(datos[0]);
			int conecciones = Integer.parseInt(datos[1]);
			grafo = new ArrayList[vertices + 1];
			visitados = new boolean[vertices + 1];
			equipo = new int[vertices + 1];

			for (int j = 1; j <= vertices; j++) {
				grafo[j] = new ArrayList<>();
			}

			for (int j = 0; j < conecciones; j++) {
				String datos2[] = br.readLine().split(" ");
				int u = Integer.parseInt(datos2[0]);
				int v = Integer.parseInt(datos2[1]);

				grafo[u].add(v);
				grafo[v].add(u);
			}

			bfs(1);

			int grupo1 = 0;
			int grupo2 = 0;
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			for (int j = 1; j < equipo.length; j++) {
				if (equipo[j] == 1) {
					grupo1++;
					sb1.append(j + " ");
				} else {
					grupo2++;
					sb2.append(j + " ");
				}
			}

			if (grupo1 < grupo2) {
				System.out.println(grupo1);
				System.out.println(sb1);
			} else {
				System.out.println(grupo2);
				System.out.println(sb2);
			}

		}

	}

	static void bfs(int inicio) {
		ArrayDeque<Integer> cola = new ArrayDeque<>();
		cola.add(inicio);
		visitados[inicio] = true;
		equipo[inicio] = 1;
		while (!cola.isEmpty()) {
			int actual = cola.poll();

			for (int vecino : grafo[actual]) {

				if (!visitados[vecino]) {
					visitados[vecino] = true;
					cola.add(vecino);

					if (equipo[actual] == 1) {
						equipo[vecino] = 2;
					} else {
						equipo[vecino] = 1;
					}
				}

			}
		}
	}

}
