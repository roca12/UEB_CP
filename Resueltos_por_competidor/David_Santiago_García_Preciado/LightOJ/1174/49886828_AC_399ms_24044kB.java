import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class PointK {
    static ArrayList<Integer>[] adj;
    static int[] path;
    static boolean[] visited;
    static ArrayDeque<Integer> queue;
    static int N;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        for (int tt = 0; tt < t; tt++) {
            N = sc.nextInt();
            int r = sc.nextInt();
            adj = new ArrayList[N];
            for (int i = 0; i < N; i++) adj[i] = new ArrayList<>();
            for (int i = 0; i < r; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }
            int s = sc.nextInt(), d = sc.nextInt();
            bfs(s);
            int[] temp = Arrays.copyOf(path, N);
            bfs(d);
            int ans = 0;
            for (int i = 0; i < N; i++) {
                ans = Math.max(ans, path[i] + temp[i]);
            }
            pw.println("Case " + (tt + 1) + ": " + ans);
        }
        pw.close();
        sc.close();
    }

    static void bfs(int s) {
        queue = new ArrayDeque<>();
        visited = new boolean[N];
        queue.add(s);
        visited[s] = true;
        path = new int[N];
        while (!queue.isEmpty()) {
            int u = queue.poll();
            ListIterator<Integer> itr = adj[u].listIterator();
            while (itr.hasNext()) {
                int v = itr.next();
                if (!visited[v]) {
                    path[v] = path[u] + 1;
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }
}
