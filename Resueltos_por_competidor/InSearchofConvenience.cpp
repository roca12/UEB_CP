/*
 * Autor: Miguel Lopez
 * Problema: In Search of Convenience
 * Juez online: Codeforces 
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2275/problem/A
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
    while(t--) {
        int n; cin >> n;
        int a,b,c; cin >> a >> b >> c;
        int aux = min({a,b,c});
        cout << n-aux << ln;
    }
}
