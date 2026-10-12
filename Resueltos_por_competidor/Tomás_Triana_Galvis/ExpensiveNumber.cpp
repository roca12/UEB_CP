#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
/*
 * Autor: Tomás Triana Galvis
 * Problema: Expensive Number
 * Juez online: Codeforces 2093B
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2093/B
 **/

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    ll t,ans,j;
    string a;
    cin>>t;
    while(t--){
        ans=0;
        cin>>a;
        for(int i=0;i<a.size();i++){
            if(a[i]!='0'){
                ans++;
            }
        }
        j= a.size()-1;
        while(true){
            if(a[j]!='0'){
                break;
            }
            ans++;
            j--;
        }
        cout<<ans-1<<"\n";
    }

    return 0;
}
