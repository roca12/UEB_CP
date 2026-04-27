//
// Created by Usuario on 15/11/2025.
//
#include <bits/stdc++.h>
#define DBG(x) cerr<<#x<<" = "<<x<<endl;

using namespace std;

int main() {
    int  t;
    cin>>t;
    while (t-->0) {
        string b;
        int j,k;
        cin>>b>>j>>k;
        string s1,s2;
        for (int i = 0; i<max(j,k);i++) {

            if (j==i+1) {
                s1 = b;
            }
            if (k==i+1) {
                s2 = b;
            }
            next_permutation(b.begin(), b.end());
        }
        int c;
        c = s1.length();
        for (int i = 0; i < s1.length(); i++) {
            if (s1[i] == s2[i])c--;
        }
        cout<<s1.length()-c<<"A"<<c<<"B"<<endl;

    }
}