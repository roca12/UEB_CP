/*
 * Autor: Juan Martinez
 * Problema: Expensive Number (2093B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2093/problem/B
 * Difficulty: 900
 */
#include <bits/stdc++.h>
using namespace std;

#define ln "\n"

int main() {
	int t, res; cin>>t;
    while(t--) {
        string s; cin>>s;
        int maxi = 0;
        res = 0;
        for(int i = 0; i < s.size(); i++) {
            maxi = max(maxi, (s[i]-'0'));
        }
        bool n = 0;
        for(int i = s.size()-1; i >= 0; i--) {
            if(!n){
                if(s[i] != '0') {
                    n = 1;
                    if((s[i]-'0') != maxi) res++;
                } else res++;
            } else {
                if(s[i] != '0' && (s[i] - '0') != maxi) res++;
            }
        }
            int rep = 0;
            for(char c: s) {
                if((c - '0') == maxi) rep++;
            }
            res += rep - 1;
        cout<<res<<ln;
    }
}
