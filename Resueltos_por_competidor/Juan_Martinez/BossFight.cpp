/*
 * Autor: Juan Martinez
 * Problema: Boss Fight (2252A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2252/problem/A
 * Difficulty: 800
 */
#include <bits/stdc++.h>
using namespace std;

#define ln "\n"

int main() {
	int t, n, act, maxi, suma; cin>>t;
    while(t--) {
        cin>>n;
        vector<int> arr(n);
        vector<bool> used(n,0);
        map<int, int> mapa;
        for(int &a: arr) {
            cin>>a;
            mapa[a]++;
        }
        maxi = 0;
        for(auto [val,cant]: mapa) {
            if(cant > maxi) {
                maxi = cant;
                act = val;
            }
        }
        suma = 0;
        for(auto [val,cant]: mapa) {
            if(val != act) suma += (val* cant);
        }
        if(maxi < ((n-maxi)+2)) {
            cout<<(suma + (act * maxi))<<ln;
        } else {
            cout<<(suma + (act * min(maxi,((n-maxi)+2))))<<ln;
        }
        
    }
}
