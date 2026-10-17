/*
 * Autor: Miguel Lopez
 * Problema: Dominating Patterns
 * Juez online: OnlineJudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/UVA-1449
 */

#include <bits/stdc++.h>
#define ln "\n"
#define vi vector<int> 
#define vl vector<ll> 
#define add(x) .push_back(x);
#define debug(x) cerr << x << "<------------ DEBUG" << ln;
typedef long long int ll;
const int INF = int(1e9) + 5;
using namespace std;

struct Aho {
    static const int K = 26, N = 150 * 70 + 5;
    int to[N][K], fail[N], cnt[N], sz;
    vector<int> order;

    void clear() { sz = 0; newNode(); order.clear(); }
    int newNode() {
        memset(to[sz], -1, sizeof(to[sz]));
        fail[sz] = cnt[sz] = 0;
        return sz++;
    }
    int insert(const string& s) {         
        int u = 0;
        for (char ch : s) {
            int c = ch - 'a';
            if (to[u][c] == -1) to[u][c] = newNode();
            u = to[u][c];
        }
        return u;
    }
    void build() {
        queue<int> q;
        for (int c = 0; c < K; c++) {
            if (to[0][c] == -1) to[0][c] = 0;
            else { fail[to[0][c]] = 0; q.push(to[0][c]); }
        }
        while (!q.empty()) {
            int u = q.front(); q.pop();
            order.push_back(u);
            for (int c = 0; c < K; c++) {
                int v = to[u][c];
                if (v == -1) to[u][c] = to[fail[u]][c];
                else { fail[v] = to[fail[u]][c]; q.push(v); }
            }
        }
    }
    void search(const string& t) { 
        int u = 0;
        for (char ch : t) { u = to[u][ch - 'a']; cnt[u]++; }
        for (int i = (int)order.size() - 1; i >= 0; i--)
            cnt[fail[order[i]]] += cnt[order[i]];
    }
} ac;

void init_code() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif 
}

int main() {
    //init_code();
    int n;
    while (cin >> n && n) {
        ac.clear();
        vector<string> pat(n);
        map<string, int> nodo, freq;      
        for (auto& p : pat) {
            cin >> p;
            nodo[p] = ac.insert(p);
        }
        string text; cin >> text;
        ac.build();
        ac.search(text);

        int best = 0;
        for (auto& [p, u] : nodo) {
            freq[p] = ac.cnt[u];
            best = max(best, freq[p]);
        }
        cout << best << ln;
        for (auto& p : pat)            
            if (freq[p] == best) cout << p << ln;
    }
}
