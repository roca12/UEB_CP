#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
/*
 * Autor: Tomás Triana Galvis
 * Problema: Even Odds
 * Juez online: Codeforces 318A
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/318/A
 **/


int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    ll a,b,mid;
    cin>>a>>b;
    mid = (a+1)/2;
    if(b<=mid){
        cout<<(b*2)-1<<"\n";
    }else{
        cout<<(b-mid)*2<<"\n";
    }


    return 0;
}
