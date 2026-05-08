#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
/*
 * Autor: Tomás Triana Galvis
 * Problema: One And Two
 * Juez online: CodeForces 1788A
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1788/A
 **/ 
int main()
{
    int t, n,cuenta,ans,temp;
    vector<int> arr;
    cin>>t;
    while(t--){
        cuenta =0;
        cin>>n;
        arr.resize(n);
        for(int i =0;i<n;i++){
            cin>>arr[i];
            if(arr[i] == 2){
                cuenta++;
            }
        }
        if(cuenta%2!=0){
            ans = -2;
        }else{
            temp = 0;
            cuenta/=2;
            ans =-1;
            while(temp!=cuenta){
                ans++;
                if(arr[ans]==2){
                    temp++;
                }
            }
        }
        if(ans == -1){
            cout<<1<<endl;
        }else{
            cout<<ans+1<<endl;
        }

    }
    return 0;
}
