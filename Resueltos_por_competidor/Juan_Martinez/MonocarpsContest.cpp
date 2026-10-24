/*
 * Autor: Juan Martinez
 * Problema: Monocarp's Contest (2260A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2260/A
 * Difficulty: 800
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
	int t, n, c; cin>>t;
    while(t--) {
        cin>>n;
        c = 0;
        vector<int> arr(n);
        for(int &a : arr) {
            cin>>a;
            if(a == 0) c++;
        }
        if(c < 2) cout<<-1<<ln;
        else {
            int res = 0;
            if(arr[0] != 0) res++;
            if(arr[(n-1)] != 0) res++;
            cout<<res<<ln;
        }
    }
}
