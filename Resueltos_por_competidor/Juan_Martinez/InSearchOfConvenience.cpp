/*
 * Autor: Juan Martinez
 * Problema: In Search of Convenience (2275A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2275/problem/A
 */
#include <bits/stdc++.h>
using namespace std;

#define ln "\n"
typedef long long int ll;

int main() {
	int t, x, y, r; cin>>t;
    while(t--) {
        cin>>x>>y>>r;
        for(int i = -25; i < 26; i++) {
            for(int j = -25; j < 26; j++) {
                if(sqrt(((x-i)*(x-i))+((y-j)*(y-j))) == r) {
                    cout<<i<<" "<<j<<ln;
                    i = 26;
                    j = 26;
                }
            }
        }
    }
}
