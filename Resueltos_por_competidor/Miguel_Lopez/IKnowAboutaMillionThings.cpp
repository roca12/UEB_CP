/*
 * Autor: Miguel Lopez
 * Problema: I Know About a Million Things
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2261/problem/C
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
        int n; cin >> n;
        int l = 0, r = 0;
        for(int i = 0; i < n; i++) {
            int z; cin >> z;
            if(z & 1) l++;
            else r++;
        }
        if((l == 1 && r == 1 )|| (l == 3 && r == 0)) cout << "Larpity" << ln;
        else cout << "Moggity" << ln;
    }
}
