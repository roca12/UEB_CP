/*
 * Autor: Miguel Lopez
 * Problema: 
 * Juez online: 
 * Veredicto: Accepted
 * Url: 
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
        int n; cin >> n;
        vector<int> a(n);
        for(int &i : a) {
            cin >> i;
        }

        ll x = a[0];
        ll y = a[0];
        ll r = a[0];

        for (int i = 1; i < n; i++) {
            ll aux = max(abs(x), abs(y));
            ll b = a[i] + aux;
            r = max(r, b);

            ll aux1 = a[i];
            ll aux2 = x + a[i];
            ll aux3 = 2 * x + a[i];
            ll aux4 = y + a[i];
            ll aux5 = 2 * y + a[i];

            ll nx = max(aux1, max(aux2, aux3));
            ll ny = min(aux1, min(aux4, aux5));

            x = nx;
            y = ny;
        }
        cout << r << ln;
    }
    return 0;
}
