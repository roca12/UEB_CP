/*
 * Autor: Manuel Barros
 * Problema: Monocarp and projects
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2260/B
 */

#include <iostream>

typedef long long ll;

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    ll t;
    cin>>t;

    while(t--) {
        ll x, y, k;
        cin >> x >> y >> k;
        ll res = y - x;
        ll sum = 0;
        while(k--){
            if(res < x){
                sum += res*(k+1);
                k = 0;
            }
            else{
                sum += y%x;
                x++;
                y++;
            }

        }
        cout << sum << "\n";
    }
}
