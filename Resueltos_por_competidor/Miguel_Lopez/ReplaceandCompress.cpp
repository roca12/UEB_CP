/*
 * Autor: Miguel Lopez
 * Problema: Replace and Compress
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2276/problem/B
 */

#include <bits/stdc++.h>
#include <cctype>
#include <cstdio>
#include <ios>
#include <ostream>
#define ln "\n"
typedef long long int ll;
using namespace std;
void init_code() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif 
}
int main() {
    init_code();
    int t; cin >> t;
    while(t--) {
        string s; cin >> s;
        bool seguida = false, alterna = false;
        for(int i = 1; i < s.length()-1; i++) {
            if(s[i-1] == s[i] && s[i] == s[i+1]) seguida = true;
            if(s[i-1] != s[i] && s[i] != s[i+1]) alterna = true;
        }
        cout << 1 + seguida + alterna << ln;
    }
}
