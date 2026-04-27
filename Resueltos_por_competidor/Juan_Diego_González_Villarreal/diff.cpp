//
// Created by Usuario on 16/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while (t-->0) {
        int n;
        cin>>n;
        string s;
        cin>>s;
        char ch = s[n-1];
        cout<<n-count(s.begin(), s.end(), ch)<<endl;
    }
}