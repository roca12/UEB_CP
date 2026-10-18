/*
 * Autor: Juan Martinez
 * Problema: I Know About a Million 2261C (1144F)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2261/C
 */
#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
#define ln "\n"
typedef long long int ll;

int main() {
	ll t, n, imp, par, aux; cin>>t;
    while(t--) {
        cin>>n;
        imp = 0;
        par = 0;
        for(ll i = 0; i < n; i++) {
            cin>>aux;
            if((aux % 2) == 0) par++;
            else imp++;
        }
        //cout<<imp<<" "<<par<<ln;
        if(n == 1) cout<<"Moggity"<<ln;
        else if(n == 2) {
            if(imp == par) cout<<"Larpity"<<ln;
            else cout<<"Moggity"<<ln;
        } else if(n == 3) {
            if(par == 0) cout<<"Larpity"<<ln;
            else cout<<"Moggity"<<ln;
        }else cout<<"Moggity"<<ln;
    }
}
