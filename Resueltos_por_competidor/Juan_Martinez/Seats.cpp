/*
 * Autor: Juan Martinez
 * Problema: Seats (2188B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2188/B
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
	int t, res, z, n; cin>>t;
    string s;
    while(t--) {
        cin>>n>>s;
        bool b = 0;
        res = 0;
        z = 0;
        if(n == 1) {
            cout<<1<<ln;
        } else {
            for(int i = 0; i < n; i++) {
            if(s[i] == '0') z++;
            else {
                if(!b) res += (z + 1)/3;
                else res += z/3;
                b = 1;
                z = 0;
                res++;
                //cout<<"se encontro un 1"<<ln;
            }
        }
        if(b) res += (z + 1)/3;
        else res += (z + 2)/3;
        //cout<<z<<" "<<res<<ln;
        cout<<res<<ln;
        }
    }
}

