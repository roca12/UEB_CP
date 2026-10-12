/*
 * Autor: Miguel Lopez
 * Problema: In Search of Convenience
 * Juez online: Codeforces 
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2275/problem/A
 */

#include <bits/stdc++.h>
using namespace std;

#define ln "\n"
#define ll long long int

void init_code() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif
}

int main() {
    init_code();
    ll t;
    cin >> t;
    while (t--) {
        ll x0, y0, r;
        cin >> x0 >> y0 >> r;
        cout << x0 + r << " " << y0 << ln;
    }
}
