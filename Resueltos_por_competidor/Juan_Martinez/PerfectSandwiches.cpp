/*
 * Autor: Juan Martinez
 * Problema: Perfect Sandwiches (2276A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2276/problem/A
 */
#include <bits/stdc++.h>
using namespace std;

#define ln "\n"

int main() {
    int t, c, s; cin>>t;
    while(t--) {
        cin>>c>>s;
        if(s >= c) cout<<-1<<ln;
        else cout<<min((c-s), s)<<ln;
    }
}
