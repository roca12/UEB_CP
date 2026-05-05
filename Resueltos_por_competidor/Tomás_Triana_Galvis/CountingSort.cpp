#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

/*
 * Autor: Tomás Triana Galvis
 * Problema: Counting Sort
 * Juez online: OmegaUp 11398
 * Veredicto: Accepted
 * Url: https://omegaup.com/arena/problem/Counting-Sort/#problems
 **/ 

int main()
{
    int n,a;
    cin>>n;
    vector<int> arr(n), ans(n);
    for(int i = 0; i<n;i++){
        cin>>arr[i];
    }
    sort(arr.begin(),arr.end());
    int j;
    for(int i=0;i<arr.size();i++){
        j = i;
        ans[i] = i;
        while(arr[i]==arr[i+1]){
            ans[i+1] = j;
            i++;
        }

    }

    for(auto an:arr){
        cout<<an<<" ";
    }
    cout<<endl;
    for(auto an:ans){
        cout<<an<<" ";
    }
    return 0;
}
