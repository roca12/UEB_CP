//
// Created by Usuario on 25/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

void upper(string &s) {
    transform(s.begin(), s.end(), s.begin(), ::toupper);
}

int main() {
    string s1;
    string s2;
    cin>>s1>>s2;
    upper(s1);
    upper(s2);
    if (s1==s2) {
        cout<<"0"<<endl;
    }else if (s1<s2) {
        cout<<"-1"<<endl;
    }else {
        cout<<"1"<<endl;
    }
}