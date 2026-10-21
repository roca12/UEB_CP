/*
 * Autor: Juan Martinez
 * Problema: Removals Game (2002B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2002/problem/B
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
	int t, n; cin>>t;
    while(t--) {
        cin>>n;
        vector<int> a(n), b(n);
        for(int &a: a) cin>>a;
        for(int &a: b) cin>>a;
        bool ig = 0, dif = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] != b[i]) ig = 1;
            if(a[i] != b[n-i-1]) dif = 1;
            //cout<<a[i]<<" "<<b[n-i-1]<<ln;
        }
        if(!ig || !dif) cout<<"Bob"<<ln;
        else cout<<"Alice"<<ln;
    }
}
