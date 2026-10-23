/*
 * Autor: Juan Martinez
 * Problema: Moo Language School (2259A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2259/A
 * Difficulty: 800
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
	int t; cin>>t;
    while(t--) {
        int n, k, res = 0;
        string s; cin>>n>>k>>s;
        bool b = 0;
        for(int i = 0; i < n; i++) {
            if(s[i] == '0') {
                b = 1;
            }
            if((i+1) % k == 0) {
                if(!b) res++;
                b = 0;
            }
        }
        cout<<res<<ln;
    }
}
