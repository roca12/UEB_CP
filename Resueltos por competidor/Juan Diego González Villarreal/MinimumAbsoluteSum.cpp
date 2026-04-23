//
// Created by Usuario on 26/11/2025.
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
        if (v.front()==-1 && v.back()==-1) {
            v.front()=0;
            v.back()=0;
        }else if (v.front()==-1 && v.back()!=-1) {
            v.front()=v.back();
        }else if (v.front()!=-1 && v.back()==-1) {
            v.back()=v.front();
        }
        cout<<abs(v.back()-v.front())<<endl;
        for (auto val:v) {
            if (val==-1)cout<<0<<" ";
            else cout<<val<<" ";
        }
        cout<<endl;
    }
}