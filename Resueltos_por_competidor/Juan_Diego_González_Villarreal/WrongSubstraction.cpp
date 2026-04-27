//
// Created by Usuario on 23/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    long x,y;
    cin>>x>>y;
    for (int i=0;i<y;i++) {
        if (x%10!=0) {
            x-=1;
        }else {
            x=x/10;
        }
    }
    cout<<x<<endl;
}