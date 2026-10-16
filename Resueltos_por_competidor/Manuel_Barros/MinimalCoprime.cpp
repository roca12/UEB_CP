/*
 * Autor: Manuel Barros
 * Problema: Minimal Coprime
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2063/A
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
    while(t--){
        ll x, y;
        cin >> x >> y;
        if(x == 1 && y == 1){
            cout << 1 << "\n";
        }else{
            cout << y-x << "\n";
        }

    }
}
