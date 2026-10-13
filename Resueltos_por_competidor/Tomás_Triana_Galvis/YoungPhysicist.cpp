#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
/*
 * Autor: Tomás Triana Galvis
 * Problema: Young Physicist
 * Juez online: Codeforces 69A
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/69/A
 **/


int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    ll n,x,y,z,temp;
    cin>>n;
    x=0,y=0,z=0;
    while(n--){
        cin>>temp;
        x+=temp;
        cin>>temp;
        y+=temp;
        cin>>temp;
        z+=temp;
    }
    if(x==0 && y==0 && z ==0){
        cout<<"YES\n";
    }else{
        cout<<"NO\n";
    }


    return 0;
}
