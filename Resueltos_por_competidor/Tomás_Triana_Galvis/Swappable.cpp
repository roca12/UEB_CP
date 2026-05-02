#include <bits/stdc++.h>

/*
 * Autor: Tomás Triana Galvis
 * Problema: Swappable
 * Juez online: AtCoder abc206_c
 * Veredicto: Accepted
 * Url: https://atcoder.jp/contests/abc206/tasks/abc206_c
 **/ 
using namespace std;

int main()
{
    long long n,a;
    cin>>n;
    vector<long long> arr(n,0), an;
    for(long long i =0;i<n;i++){
        cin>>arr[i];
    }
    long long cuenta;
    sort(arr.begin(),arr.end());
    for(long long i=0;i<arr.size();i++){
        cuenta =0;
        while(arr[i]==arr[i+1]){
            cuenta++;
            i++;
        }
        an.push_back(cuenta);
    }
    long long ans =(n*(n-1))/2;
    for(auto x:an){
        if(x==0){
            continue;
        }
        ans-=(x*(x+1))/2;
    }
    cout<<ans<<endl;
    return 0;
}
