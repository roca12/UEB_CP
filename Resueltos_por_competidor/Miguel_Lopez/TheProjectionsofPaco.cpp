/*
 * Autor: Miguel Lopez
 * Problema: 
 * Juez online: 
 * Veredicto: Accepted
 * Url: 
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
        int n; cin >> n;
        vector<int> res(n);
        for(int &i: res) {
            cin >> i;
        }
       int aux = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) aux+= res[i];
            else aux-=res[i];
        }
        cout << aux << ln;
    }
    return 0;
}
