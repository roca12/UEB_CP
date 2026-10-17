/*
 * Autor: Miguel Lopez
 * Problema: What's the Capital of France?
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2261/problem/B
 */

#include <algorithm>
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
        int n; cin >> n;
        vl vec(n);
        for(ll &i : vec) cin >> i;
        ll ans = 0;
        while(true) {
            ll m = *max_element(vec.begin(), vec.end());
            if(m == 0) break;
            ll p = 1;
            while(p * 2 <= m) p *= 2;
            ll mn = *min_element(vec.begin(), vec.end());
            if(mn < p) {
                ans += 2 * p - 1;
                break;
            }
            ans += p;
            for (ll &i: vec) {
                i-=p;
            }
        }
            cout << ans << ln;
    }
}
