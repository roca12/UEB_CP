/*
 * Autor: Miguel Lopez
 * Problema: Perfect Sandwiches
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2276/problem/A
 */

#include <bits/stdc++.h>
#include <cctype>
#include <cstdio>
#include <ios>
#include <ostream>
#define ln "\n"
typedef long long int ll;
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
    while (t--) {
        int a, b; cin >> a >> b;
        if (a <= b) cout << -1 << ln;
        else cout << min(b, a - b) << ln;
    }
    return 0;
}
