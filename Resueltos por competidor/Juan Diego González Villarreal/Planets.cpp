//
// Created by Usuario on 21/11/2025.
//
#include <bits/stdc++.h>

using namespace std;
int main() {
    int t;
    cin>>t;
    while (t-->0) {
        int n,c;
        cin>>n>>c;
        map<int,int> mp;
        for (int i = 0; i < n; i++) {
            int val;
            cin>>val;
            if (mp.find(val) == mp.end()) {
                mp[val] = 1;
            }else {
                mp[val]++;
            }
        }
        int total = 0;
        for (pair<int,int> p : mp) {
            if (p.second > c) {
                total += c;
            }else {
                total += p.second;
            }
        }
        cout<<total<<endl;

    }
}