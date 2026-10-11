/*
 * Autor: Manuel Barros
 * Problema: Doras Set
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2007/A
 */

#include <iostream>
typedef long long ll;

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    ll t;
    cin >> t;
    while(t--) {
        ll l, r;
        cin >> l >> r;

        if(l%2 == 0 && r%2 == 0){
            cout << (r-l)/4 << "\n";
        }
        else if (l%2 == 1 && r%2 == 1){
            cout << (((r-l)/2)+1)/2 << "\n";
        }
        else cout << (r-l+1)/4 << "\n";
    }
}
