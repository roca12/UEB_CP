//
// Created by Usuario on 18/11/2025.
//
#include<bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t-->0) {
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++) {
            cin>>a[i];
        }
        pair<int,int> p;
        bool flag = false;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if ((a[j]%a[i])%2==0) {
                    p=make_pair(a[i],a[j]);
                    flag=true;
                    break;
                }
            }
            if (flag) break;
        }
        if (p==make_pair(0,0)) cout<<"-1"<<endl;
        else cout<<p.first<<" "<<p.second<<endl;

    }
}