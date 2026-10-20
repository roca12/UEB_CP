/*
 * Autor: Juan Martinez
 * Problema: Crafting (2055B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2055/B
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
const int INF = 1e9;

int main() {
    int t, n, mini, ne; cin>>t;
    while(t--) {
        cin>>n;
        vector<int> act(n), need(n);
        for(int &a: act) cin>>a;
        for(int &a: need) cin>>a;
        mini = INF;
        ne = 0;
        for(int i = 0; i < n; i++) {
            if(act[i] >= need[i]) mini = min(mini, abs(act[i]-need[i]));
        }
        bool b = 0, e = 0;
        for(int i = 0; i < n; i++) {
            if(act[i] < need[i]) {
                if(e) {
                    b = 1;
                    break;
                }
                e = 1;
                ne = need[i] - act[i];
            }
        }
        if(!b && ne <= mini) cout<<"YES"<<ln;
        else cout<<"NO"<<ln;
    }
}

