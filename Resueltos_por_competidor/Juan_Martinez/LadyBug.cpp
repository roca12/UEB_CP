/*
 * Autor: Juan Martinez
 * Problema: Lady Bug (2092B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2092/B
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
#define all(x) x.begin(), x.end()
typedef long long int ll;
 
void solve() {
    int n, aa = 0, bb = 0; cin>>n;
    string a, b; cin>>a>>b;
    for(int i = 0; i < n; i++) {
        if(i % 2 == 0) {
            if(a[i] == '0') aa++;
            if(b[i] == '0') bb++;
        } else {
            if(b[i] == '0') aa++;
            if(a[i] == '0') bb++;
        }
    }
    if((aa >= ((n+1)/2)) && (bb >= (n/2))) cout<<"YES"<<ln;
    else cout<<"NO"<<ln;
    
}

int main() {
    ll t; cin>>t;
	while(t--) solve();
}