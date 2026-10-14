/*
 * Autor: Juan Martinez
 * Problema: Subarrays (2276C)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2276/problem/C
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
typedef long long int ll;

signed main() {
    ll t, n, k, aux, res, j; cin>>t;
    while(t--) {
        cin>>n>>k;
        vector<ll> arr(n+1, 0);
        aux, res = 0;
        for(ll i = 1; i <= n; i++) {
            cin>>aux;
            arr[i] = (arr[i-1] + aux) % k;
        }
        map<ll,ll> mapa;
        for(ll i = 1; i <= n; i++) {
            j = i - k - 1;
            if(j >= 0) mapa[arr[j]]++;
            res += mapa[arr[i]];
        }
        cout<<res<<ln;
    }
}
