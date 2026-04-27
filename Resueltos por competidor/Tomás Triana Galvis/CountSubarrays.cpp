#include <bits/stdc++.h>

using namespace std;

/*
 * Autor: Tomás Triana Galvis
 * Problema: Count Subarrays
 * Juez online: Codeforces 219774Q
 * Veredicto: Accepted
 * Url: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Q
 **/

int main()
{
    long long t,n,a;
    cin>>t;
    for(long long i = 0; i<t; i++){
        cin>>n;
        long long cont=0;
        vector<long long> arr(n, 0), x;
        for(long long i = 0; i<n;i++){
            cin>>arr[i];
            if(cont == 0){
                cont++;
                continue;
            }
            if(arr[i]>=arr[i-1]){
                cont++;
            }else{
                x.push_back(cont);
                cont=1;
            }
        }
        x.push_back(cont);
        long long ans = 0;
        for(long long j:x){
            ans+= (j*(j+1))/2;
        }
        cout<<ans<<endl;
    }
    return 0;
}
