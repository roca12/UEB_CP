import java.util.*;

public class UbiquitousReligions {

	static final int MAX = 50002;
	static int padre[] = new int[MAX];
	static int rango[] = new int[MAX];

	static void MakeSet(int n) {
		for (int i = 0; i < n; ++i) {
			padre[i] = i;
			rango[i] = 0;
		}
	}

	static int Find(int x) {
		if (x == padre[x]) {
			return x;
		} else {
			return padre[x] = Find(padre[x]);
		}
	}

	static void Union(int x, int y) {
		int xRoot = Find(x);
		int yRoot = Find(y);
		padre[xRoot] = yRoot;
	}

	static void UnionbyRank(int x, int y) {
		int xRoot = Find(x);
		int yRoot = Find(y);
		if (rango[xRoot] > rango[yRoot]) {

			padre[yRoot] = xRoot;
		} else {
			padre[xRoot] = yRoot;
			if (rango[xRoot] == rango[yRoot]) {
				rango[yRoot]++;
			}
		}
	}

	static int root[] = new int[MAX];
	static int numComponentes;

	static int getNumberConnectedComponents(int n) {
		numComponentes = 0;
		for (int i = 0; i < n; ++i) {
			if (padre[i] == i) {
				root[numComponentes++] = i;
			}
		}
		return numComponentes;
	}

	static boolean sameComponent(int x, int y) {
		if (Find(x) == Find(y)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int V, E, origen, destino, caso = 1;
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		while (V != 0 && E != 0) {
			MakeSet(V);
			for (int i = 0; i < E; ++i) {
				origen = sc.nextInt();
				destino = sc.nextInt();
				UnionbyRank(origen, destino);
			}
			System.out.println("Case " + caso + ": " + getNumberConnectedComponents(V));
			caso++;
			V = sc.nextInt();
			E = sc.nextInt();

		}
	}

}
