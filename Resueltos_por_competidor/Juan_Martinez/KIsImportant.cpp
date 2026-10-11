/*
 * Autor: Juan Martinez
 * Problema: K Is Important (2269C)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2269/problem/C
 * Difficulty: 1200
 */
#include <bits/stdc++.h>
#include <vector>
using namespace std;
#define ln "\n"
typedef long long int ll;

int main() {
    ll t, n, k, s, score; cin>>t;
    while(t--) {
        cin>>n>>k;
        score = 0;
        vector<ll> arr(n);
        for(ll &a : arr) cin>>a;
        ll x, y;
        s = (ll)arr.size();
        while(s >= k) {
            x = k-1;
            y = s - k;
            if(arr[x] > arr[y]) {
                score += arr[x];
                arr.erase(arr.begin() + x);
            } else {
                score += arr[y];
                arr.erase(arr.begin() + y);
            }
            s--;
        }
        cout<<score<<ln;
    }
}
