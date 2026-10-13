#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
/*
 * Autor: Tomás Triana Galvis
 * Problema: Longest Rainy Streak
 * Juez online: Atcoder abc479_b
 * Veredicto: Accepted
 * Url: https://atcoder.jp/contests/abc479/tasks/abc479_b
 **/


int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    ll n,ans=0,mx=0;
    string a;
    cin>>n;
    cin>>a;
    for(int i=0;i<n;i++){
        if(a[i]=='R'){
            ans++;
        }
        if(a[i]=='S'){
            mx =max(mx,ans);
            ans=0;
        }
    }
    mx = max(mx,ans);
    cout<<mx<<"\n";


    return 0;
}
