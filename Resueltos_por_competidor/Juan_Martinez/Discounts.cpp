/*
 * Autor: Juan Martinez
 * Problema: Discounts (2143B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2143/B
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
#define all(x) x.begin(), x.end()
typedef long long int ll;
 
void solve() {
    ll n, k, sum; cin>>n>>k;
    vector<ll> arr(n), cup(k);
    for(ll &a : arr) cin>>a;
    for(ll &a: cup) cin>>a;
    sort(all(arr), greater<ll>());
    sort(all(cup));
    sum = 0;
    for(ll i = 0, j = 0; i < n; i++) {
        if(j < k && cup[j] <= (n-i)) {
            if(cup[j] != 1) {
                //cout<<i<<" "<<sum<<ln;
                for(ll z = i; z < (i+cup[j]-1); z++) {
                    sum += arr[z];
                    //cout<<arr[i]<<ln;
                }
                i += cup[j]-1;
            }
            j++;
        } else {
            //cout<<arr[i]<<ln;
            sum += arr[i];
        }
    }
    cout<<sum<<ln;
}

int main() {
    ll t; cin>>t;
	while(t--) solve();
}