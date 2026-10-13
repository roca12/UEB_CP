/*
 * Autor: Manuel Barros
 * Problema: Minus two
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2259/B
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
        ll impares = 0;
        ll parDos = 0;
        ll parCuatro = 0;
        ll n;
        cin >> n;
        while(n--){
            ll k;
            cin>>k;
            if(k%2 == 1){
                impares++;
            }else{
                if(k%4 == 0){
                    parDos++;
                }
                else{
                    parCuatro++;
                }
            }

        }
        cout << max(impares, max(parDos, parCuatro)) << "\n";
    }
}
