/*
 * Autor: Miguel Lopez
 * Problema: Come Be My Friend, Don't Be So Scared (Easy Version)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2261/problem/D1
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
void init_code() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif 
}
int main() {
    init_code();
    int t; cin >> t;
    while(t--) {
        int n,m; cin >> n >> m;
        if(n == 1) {
            cout << 0 << ln;
            continue;
        }
        int k = (n+1) / 2;
        cout << k << ln;
        for(int i = 1; i <= k; i++) {
            cout << i+1 << " " << min(i + k, n) << ln;
        }
    }
}
