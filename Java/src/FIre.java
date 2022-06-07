import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FIre {

	static int maxn = 1050;
	static int maxm = 1050;
	static int inf = 0x3f3f3f3f;
	static int Next[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	static char mapp[][] = new char[maxn][maxm];
	static int step[][] = new int[maxn][maxm];
	static boolean vis[][] = new boolean[maxn][maxm];
	static int n, m;

	static class Node {
		int x, y, s, b;

		Node() {
		}

		public Node(int _x, int _y, int _s, int _b) {
			this.x = _x;
			this.y = _y;
			this.s = _s;
			this.b = _b;
		}
	};

	static void bfs() {
		Node temp = new Node(), chu = new Node();
		for (int i = 0; i < vis.length; i++) {
			Arrays.fill(vis[i], false);
		}
		for (int i = 0; i < vis.length; i++) {
			Arrays.fill(step[i], inf);
		}
		Queue<Node> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mapp[i][j] == 'F') {
					temp.x = i;
					temp.y = j;
					temp.s = 0;
					temp.b = 1;
					q.offer(temp);
				} else if (mapp[i][j] == 'J') {
					chu.x = i;
					chu.y = j;
					chu.s = 0;
					chu.b = 0;
				}
			}
		}
		q.offer(chu);
		step[chu.x][chu.y] = 0;
		while (!q.isEmpty()) {
			Node u = q.peek();
			q.poll();
			if (u.b == 0) {
				if (u.x == 0 || u.x == n - 1 || u.y == 0 || u.y == m - 1) {
					System.out.printf("%d\n", u.s + 1);
					return;
				}
			}
			for (int i = 0; i < 4; i++) {
				temp.x = u.x + Next[i][0];
				temp.y = u.y + Next[i][1];
				temp.s = u.s + 1;
				temp.b = u.b;
				if (safe(temp.x, temp.y)) {
					if (temp.b != 0) {
						vis[temp.x][temp.y] = true;
						mapp[temp.x][temp.y] = 'F';
						q.offer(temp);
					} else {
						if (mapp[temp.x][temp.y] == '.' && step[temp.x][temp.y] > step[u.x][u.y] + 1) {
							step[temp.x][temp.y] = step[u.x][u.y] + 1;
							q.offer(temp);
						}
					}
				}
			}
		}
		System.out.printf("IMPOSSIBLE\n");
	}

	static boolean safe(int x, int y) {
		if (!vis[x][y] && x >= 0 && y >= 0 && x < n && y < m && mapp[x][y] != '#') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < n; j++) {
				String s = sc.nextLine();
				mapp[i] = s.toCharArray();
			}
			bfs();
		}
	}

}
