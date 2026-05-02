/*
 * Autor: Juan Martinez
 * Problema: Party Monster (2227B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2227/problem/B
 */

#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n, izq, der , cant;
    cin>> n;
    char c;
    while(n--) {
        cin>>cant;
        izq = 0;
        der = 0;
        for(int i = 0; i < cant; i++) {
            cin>>c;
            if(c == '(' ) izq++;
            else der++;
        }

        if(izq == der) cout <<"YES"<< endl;
        else cout <<"NO"<< endl;
    }

    return 0;
}
