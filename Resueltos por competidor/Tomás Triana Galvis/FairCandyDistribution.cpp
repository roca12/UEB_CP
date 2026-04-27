#include <bits/stdc++.h>
/*
 * Autor: Tomás Triana Galvis
 * Problema: Fair Candy Distribution
 * Juez online: AtCoder abc208_b
 * Veredicto: Accepted
 * Url: https://atcoder.jp/contests/abc208/tasks/abc208_c
 **/ 
using namespace std;

int main()
{
    long long n, k,a;
    cin>>n>>k;
    vector<pair<long long ,long long>> arr(n);
    long long x = k/n;
    vector<long long> ans(n, x);
    long long ansa = k%n;
    for(long long i =0;i<n;i++){
        cin>>arr[i].first;
        arr[i].second = i;
    }

    sort(arr.begin(), arr.end());
    long long ind;
    for(long long i =0; i<ansa;i++){
        ans[arr[i].second]++;
    }
    for(auto a:ans){
        cout<<a<<endl;
    }
    return 0;
}
