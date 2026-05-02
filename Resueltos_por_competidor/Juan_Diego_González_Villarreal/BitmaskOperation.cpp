/*
 * Autor: Juan Diego González Villarreal
 * Problema: Bitmask Operation
 * Veredicto: Accepted
 * URL> https://codeforces.com/group/c3FDl9EUi9/contest/267312/problem/B
 */

#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int q;
    int32_t original_n;
    
    if (!(cin >> q >> original_n)) return 0;

    uint32_t n = original_n;

    while (q--) {
        int type, x;
        cin >> type >> x;
        if (type == 1) {
            cout << ((n >> x) & 1) << "\n";
        } 
        else {
            if (type == 2) {
                n |= (1U << x);
            } 
            else if (type == 3) {
                n &= ~(1U << x);
            } 
            else if (type == 4) {
                n ^= (1U << x);
            }
            cout << (int32_t)n << "\n";
        }
    }

    return 0;
}
