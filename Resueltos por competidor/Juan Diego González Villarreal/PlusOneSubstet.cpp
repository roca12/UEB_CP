//
// Created by Usuario on 24/11/2025.
//
#include <bits/stdc++.h>
typedef long long ll;

using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        set<ll> s;
        for (int i = 0; i < n; i++) {
            ll x;
            cin>>x;
            s.insert(x);
        }

        cout<<*max_element(s.begin(),s.end())-*min_element(s.begin(), s.end())<<endl;
    }
}