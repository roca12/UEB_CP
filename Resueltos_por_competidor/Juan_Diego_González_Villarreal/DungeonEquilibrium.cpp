//
// Created by Usuario on 23/11/2025.
//
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        int n;
        cin>>n;
        map<int, int> mp;
        for (int i = 0; i < n; i++) {
            int val;
            cin>>val;
            mp[val]++;
        }
        int cont = 0;
        for (pair<int, int> p : mp) {
            if (p.first<p.second) {
                cont+=p.second-p.first;
            }else if (p.first>p.second) {
                cont+=p.second;
            }
        }
        cout<<cont<<endl;
    }
}