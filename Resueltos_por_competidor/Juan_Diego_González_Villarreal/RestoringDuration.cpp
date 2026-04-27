//
// Created by Usuario on 24/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        int n;
        cin>>n;
        vector<int> s(n);
        vector<int> f(n);
        for (int i = 0;i<n; i++) {
            cin>>s[i];
        }
        for (int i = 0; i<n; i++) {
            cin>>f[i];
        }

        for (int i = 0; i<n; i++) {
            if (i==0) {
                cout<<f[i]-s[i]<<" ";
                continue;
            }

            if (s[i]<f[i-1]) {
                cout<<f[i]-f[i-1]<<" ";
            }else {
                cout<<f[i]-s[i]<<" ";
            }
        }
        cout<<endl;
    }
}