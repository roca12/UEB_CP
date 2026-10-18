#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
/*
 * Autor: Tomás Triana Galvis
 * Problema: LCM Challenge
 * Juez online: Codeforces 235A
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/235/problem/A
 **/

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    ll n,ans;
    cin>>n;
    if(n<=2){
        ans = n;
    }else{
        if(n%2==1){
            ans = n*(n-1)*(n-2);
        }else if(n%3==0){
            ans = (n-1)*(n-2)*(n-3);
        }else{
            ans = n*(n-1)*(n-3);
        }

    }
    cout<<ans<<"\n";

    return 0;
}
