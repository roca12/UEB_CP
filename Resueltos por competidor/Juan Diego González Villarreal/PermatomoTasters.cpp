//
// Created by Usuario on 23/11/2025.
//
#include<bits/stdc++.h>
using namespace std;

int main() {
    int  t;
    cin>>t;
    while(t--) {
        int n, k;
        cin>>n>>k;

        vector<int>v(n);
        for (int i = 0; i < n; i++) {
            cin>>v[i];
        }
        sort(v.begin(), v.end());
        multiset<int> s;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n; j++) {
                s.insert(v[i]+v[j]);
            }
        }
        int cont = 1;
        for (int val: s) {
            if (cont == k)cout<<val<<endl;
            cont++;
        }
    }
}