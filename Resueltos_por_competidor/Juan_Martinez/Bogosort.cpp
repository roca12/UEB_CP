/*
 * Autor: Juan Martinez
 * Problema: Bogosort (1144F)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/1312/problem/B
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
#include <functional>
using namespace std;
#define ln "\n"

int main() {
    int t; cin>>t;
    while(t--) {
        int n; cin>>n;
        vector<int> arr(n);
        for(int &a: arr) cin>>a;
        sort(arr.begin(), arr.end(), greater<int>());
        for(int i: arr) cout<<i<<" ";
        cout<<ln;
    }
}
