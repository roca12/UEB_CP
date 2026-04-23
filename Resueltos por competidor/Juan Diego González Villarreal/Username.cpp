//
// Created by Usuario on 25/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        string s;
        cin>>s;
        int n = s.length();
        for (int i=s.length()-1; i>=0; i--) {
            if (std::isdigit(s[i])) {
                n--;
            }else break;
        }

        cout<<s.substr(0,n)<<endl;
    }
}