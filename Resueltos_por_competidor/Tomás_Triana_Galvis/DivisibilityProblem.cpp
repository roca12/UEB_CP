#include <bits/stdc++.h>
#define ll long long
using namespace std;

/*
 * Autor: Tomás Triana Galvis
 * Problema: Divisibility Problem
 * Juez online: CodeForces 1328A
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1328/A
 **/ 
int main()
{
    ll t,a,b,ans,temp;
    cin>>t;
    while(t--){
        cin>>a>>b;
        if(a%b==0){
            cout<<0<<endl;
        }else{
            temp = a/b;
            ans = b*(temp+1);
            cout<<ans-a<<endl;
        }

    }
}
