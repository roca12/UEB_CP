//
// Created by Usuario on 24/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    int v[1000];
    int cont = 0;
    for (int i = 1; i<=1666; i++) {
        if (to_string(i).back()!='3' && i%3!=0) {
            v[cont] = i;
            cont++;
        }
    }
    int t;
    cin>>t;

    while(t--) {
        int n;
        cin>>n;
        cout<<v[n-1]<<endl;
    }
}