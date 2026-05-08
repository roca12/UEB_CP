#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
/*
 * Autor: Tomás Triana Galvis
 * Problema: Add Plus Minus Sign
 * Juez online: CodeForces 1774A
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1774/A
 **/ 
int main()
{
    int t, n,cuenta;
    string arr,ans;
    cin>>t;
    while(t--){
        cuenta = 0;
        ans="";
        cin>>n;
        cin>>arr;
        if(arr[0] == '1'){
            cuenta++;
        }
        for(int i = 1;i<n;i++){

            if(cuenta%2==1){
                ans+= "-";
            }else{
                ans += "+";
            }
            if(arr[i] == '1'){
                cuenta++;
            }
        }

        cout<<ans<<endl;
    }
    return 0;
}
