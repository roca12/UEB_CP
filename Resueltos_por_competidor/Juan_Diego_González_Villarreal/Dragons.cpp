//
// Created by Usuario on 23/11/2025.
//
#include <bits/stdc++.h>

using namespace std;
int main() {
    int s,n;
    cin>>s>>n;
    multimap<int, int> mp;
    for(int i=0;i<n;i++) {
        int x,y;
        cin>>x>>y;
        mp.insert(make_pair(x,y));
    }
    bool flag = true;
    for (pair<int,int> i:mp) {
        if (s>i.first) {
            s+=i.second;
        }else {
            flag = false;
            break;
        }
    }
    if (flag) {
        cout<<"YES"<<endl;
    }else {
        cout<<"NO"<<endl;
    }
}