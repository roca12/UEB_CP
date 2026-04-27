#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

vector<vector<int>> g;
vector<ll> cnt;

void dfs(int v, int p) {
    if (g[v].size() == 1 && g[v][0] == p) {
        cnt[v] = 1;
    } else {
        for (auto u : g[v]) {
            if (u != p) {
                dfs(u, v);
                cnt[v] += cnt[u];
            }
        }
    }
}



int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, q;
        cin >> n;

        g.assign(n, vector<int>());

        for (int i = 0; i < n - 1; i++) {
            int u, v;
            cin >> u >> v;
            u--;
            v--;
            g[u].push_back(v);
            g[v].push_back(u);
        }

        cnt.assign(n, 0);
        dfs(0, -1);

        cin >> q;
        for (int i = 0; i < q; i++) {
            int c, k;
            cin >> c >> k;
            c--;
            k--;
            ll res = cnt[c] * cnt[k];
            cout << res << endl;
        }
    }
}