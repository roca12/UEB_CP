/*
 * Autor: Juan Martinez
 * Problema: Hey, It's Me, Souvlakity (2261A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2261/problem/A
 * Difficulty: 800
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
    int t; cin>>t;
    while(t--) {
        int n, maxi = 0, mini = 1e9, k = 0, aux; cin>>n;
        string s; cin>>s;
        aux = 1;
        for(int i = 0; i < n; i++) {
            if(s[i] == '1') {
                maxi = max(maxi, aux);
                mini = min(mini, aux);
                k++;
            }
            aux++;
        }
        if(k == 1) cout<<0<<ln;
        else if(k == 2) cout<<1<<ln;
        else cout<<maxi-mini<<ln;

    }
}
