/*
 * Autor: Juan Martinez
 * Problema: Minimise Sum (2124B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2124/problem/B
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
    int t, n; cin>>t;
    while(t--) {
        cin>>n;
        vector<int> arr(n);
        for(int &a: arr) cin>>a;
        cout<<(min(arr[0],arr[1])+arr[0])<<ln;
    }
}
