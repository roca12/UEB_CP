/*
 * Autor: Miguel Lopez
 * Problema: Hey, It's Me, Souvlakity
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2261/problem/A
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
        int n;
        string s; cin >> n >> s;
        int k = count(s.begin(), s.end(), '1');
        int f = s.find('1');
        int e = s.rfind('1');
        if(k == 1) cout << 0 << ln;
        else if ( k == 2) cout << 1 << ln;
        else cout << abs(f-e) << ln;
    }
}
