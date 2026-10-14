/*
 * Autor: Juan Martinez
 * Problema:  Replace and Compress (2276B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2276/problem/B
 */
#include <bits/stdc++.h>
using namespace std;

#define ln "\n"

int main() {
    int t; cin>>t;
    while(t--) {
        string s;
        bool a = 0, b = 0;
        cin>>s;
        for(int i = 1; i < ((int)s.size()-1); i++) {
            if(s[i] != s[i-1] && s[i] != s[i+1]) a = 1;
            else if(s[i] == s[i+1] && s[i] == s[i-1]) b = 1;
        }
        cout<<(1+a+b)<<ln;
    }
}
