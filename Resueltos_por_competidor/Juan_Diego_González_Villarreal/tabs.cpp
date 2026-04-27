//
// Created by Usuario on 16/11/2025.
//
#include <bits/Stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t-->0) {
        double a,b,n;
        cin>>a>>b>>n;
        if (n==1||b*n <= a||a==b) {
            cout<<1<<endl;
        }else{
            cout<<2<<endl;
        }
    }
}