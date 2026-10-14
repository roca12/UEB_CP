/*
 * Autor: Py chad
 * Problema: C++ sucks
 * Juez online: Factos Garcia
 * Veredicto: Accepted (WA en C++)
 * Url: https://codeforces.com/contest/2276/problem/C
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
        int n,k; cin >> n >> k;
        vector<int> aux(n+1,0);
        for(int i = 1; i <= n; i++) {
            ll a; cin >> a;
            aux[i] = (a + aux[i-1]) % k;
        }
        vector<int> help(k,0);
        ll ans = 0;
        for(int i = 0; i <= n; i++) {
            int j = i - k - 1;
            if(j >= 0) help[aux[j]]++;
            ans+=help[aux[i]];
        }
        cout << ans << ln;
        // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO

                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO

                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO

                // PYTHON ES MEJOR WAHOOOOOOOOOOO
                // PYTHON ES MEJOR WAHOOOOOOOOOOO


    }
}
