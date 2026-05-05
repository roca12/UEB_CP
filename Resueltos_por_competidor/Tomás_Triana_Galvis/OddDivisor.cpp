#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
/*
 * Autor: Tomás Triana Galvis
 * Problema: Odd Divisor
 * Juez online: CodeForces 1475A
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1475/A
 **/ 
int main()
{
    ll t,x;
    cin>>t;
    while(t--){
        cin>>x;
        if((x && !(x & x - 1))==1){
            cout<<"NO"<<endl;
        }else{
            cout<<"YES"<<endl;
        }
    }
    return 0;
}
