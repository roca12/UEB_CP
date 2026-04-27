//
// Created by Usuario on 23/11/2025.
//
#include <bits/stdc++.h>
typedef long long ll;

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        ll n;
        cin>>n;
        ll pot = 10;
        ll div = 11;
        multiset<ll> s;
        while(div <= n) {
            if (n%div == 0) {
                s.insert(n/div);
            }
            pot*=10;
            div = 1 + pot;
        }
        if (s.empty()) {
            cout<<"0";
        }else {
            cout<<s.size()<<endl;
            for (ll val: s) {
                cout<<val<<" ";
            }
        }
        cout<<endl;
    }
}