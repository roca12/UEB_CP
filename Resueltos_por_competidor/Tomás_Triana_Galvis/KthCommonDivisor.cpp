#include <bits/stdc++.h>
/*
 * Autor: Tomás Triana Galvis
 * Problema: K-th Common Divisor
 * Juez online: AtCoder abc120_b
 * Veredicto: Accepted
 * Url: https://atcoder.jp/contests/abc120/tasks/abc120_b
 **/
using namespace std;

int main()
{
    long long a,b,k;
    cin>>a>>b>>k;
    long long x = __gcd(a,b);
    vector<long long> arr;
    for(long long i=1;i<=x;i++){
        if(x%i==0){
            arr.push_back(i);
        }
    }
    sort(arr.begin(),arr.end());
    cout<<(arr[arr.size()-k]);
    return 0;
}
