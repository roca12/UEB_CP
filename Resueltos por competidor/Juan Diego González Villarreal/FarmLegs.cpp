//
// Created by Usuario on 26/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        int cont = 0;
        for (int i = 0; 2*i<=n; i++) {
            for (int j = 0; 4*j<=n-2*i; j++) {
                if (2*i+4*j==n)cont++;
            }
        }
        cout<<cont<<endl;
    }
}