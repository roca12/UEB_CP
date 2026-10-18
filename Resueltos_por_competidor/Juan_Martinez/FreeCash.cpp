/*
 * Autor: Juan Martinez
 * Problema: Free Cash (237A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/237/A
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
 
int main() {
	int t, h, m, maxi = 1, res = 1; cin>>t;
    int x = -1, y = -1;
    while(t--) {
        cin>>h>>m;
        if(h == x && m == y) {
            res++;
            maxi = max(maxi, res);
        } else res = 1;
        x = h, y = m;
    }
    cout<<maxi<<ln;
}