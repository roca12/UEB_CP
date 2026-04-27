//
// Created by Usuario on 15/11/2025.
//
#include <bits/stdc++.h>

using namespace std;


int main() {
    vector<int> v(3);
    for (int i = 0; i<3; i++) {
        cin>>v[0]>>v[1]>>v[2];
    }
    sort(v.begin(), v.end());

    if (v[2]-v[0]>=10) {
        cout<<"check again"<<endl;
    }else {
        int median = v[1];
        cout<<"final "<<median<<endl;
    }

}