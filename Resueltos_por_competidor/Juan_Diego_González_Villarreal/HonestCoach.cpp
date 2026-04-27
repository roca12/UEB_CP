//
// Created by Usuario on 22/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        int n;
        cin>>n;
        vector<int> v(n);
        for(int i=0;i<n;i++) {
            cin>>v[i];
        }
        if (n==2) {
            cout<<abs(v[0]-v[1])<<endl;
            continue;
        }
        sort(v.begin(),v.end());
        int minDiff = abs(v[0]-v[n-1]);
        for (int i = 0; i < n-1; i++) {
            if (minDiff==0) break;
            if (v[i+1]-v[i]<minDiff)minDiff = v[i+1]-v[i];
        }
        cout<<minDiff<<endl;
    }
}