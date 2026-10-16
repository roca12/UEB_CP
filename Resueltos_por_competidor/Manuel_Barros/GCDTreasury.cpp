/*
 * Autor: Manuel Barros
 * Problema: GCD Treasury
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2267/C
 */

#include <iostream>
#include <vector>
#include <map>
typedef long long ll;

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    ll N = 300000;
    vector<bool> prime(N+1, true);
    vector<ll> primos;
    prime[0] = prime[1] = false;
    for (int p = 2; p * p <= N; p++) {
        if (prime[p]) {
            for (int i = p * p; i <= N; i += p) {
                prime[i] = false;
            }
        }
    }

    for(int i = 0; i < N+1; i++) {
        if(prime[i]){
            primos.push_back(i);
        }
    }

    ll t;
    cin>>t;

    while(t--) {
        ll n, x;
        cin>>n>>x;
        vector<ll> tuPrimo;
        map<ll, ll> fs;

        for(int i = 0; i < primos.size(); i++) {
            if(primos[i] > x)
            {
                break;
            }

            if(x%primos[i] == 0)
            {
                tuPrimo.push_back(primos[i]);
            }
        }

        ll maxim = 0;
        while(n--){
            ll a;
            cin>>a;
            for(int i = 0; i < tuPrimo.size(); i++){
                if(a%tuPrimo[i] == 0){
                    fs[tuPrimo[i]] +=  a/tuPrimo[i];
                }
            }

        }
        for(int i = 0; i < tuPrimo.size(); i++){
            ll valor = fs[tuPrimo[i]]*tuPrimo[i];
            maxim = max(maxim, valor);
        }

        cout << maxim << "\n";
    }
}
