/*
 * Autor: Miguel Lopez
 * Problema: What Does the Cow Say?
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2261/problem/E
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
        int n,k;
        string s; cin >> n >> k >> s;
        vector<int> run(n +1,0);
        for(int i = n - 1 ; i >= 0; i--) {
            run[i] = (s[i] == '(') ? run[i+1] + 1 : 0;
        }
        vector<int> c(n+1);
        int top = 0;
        int cerra = 0;
        int best = 0, ans = 0;
        for(int p = 0; p < n; p++) {
            if(s[p] == ')') {
                cerra++;
                top--;
                continue;
            }
            int cost = cerra;
            int val = top + run[p];
            c[top++] = cost;
            int l = 0, r = top-1;
            while(l < r) {
                int m = (l+r) / 2;
                if(c[m] >= cost - k) {
                    r = m;
                }
                else {
                    l = m+1;
                }
            }
            ans = max(ans,val-l);
            if(cost <= k) best = max(best, val);
        }
        int ansb = k + min(best, n / 2 - k);
        cout << max(ans, ansb) << ln;

    }
}
