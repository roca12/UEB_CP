import java.util.*;

public class Main {
    static List<Integer>[] tree;
    static int[] cat;
    static int n, m;
    static int result = 0;

    public static void dfs(int node, int parent, int cats) {
        if (cat[node] == 1) cats++;
        else cats = 0;

        if (cats > m) return;

        boolean isLeaf = true;

        for (int next : tree[node]) {
            if (next != parent) {
                isLeaf = false;
                dfs(next, node, cats);
            }
        }

        if (isLeaf) result++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        cat = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cat[i] = sc.nextInt();
        }

        tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) tree[i] = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            tree[x].add(y);
            tree[y].add(x);
        }

        dfs(1, 0, 0);
        System.out.println(result);
    }
}
