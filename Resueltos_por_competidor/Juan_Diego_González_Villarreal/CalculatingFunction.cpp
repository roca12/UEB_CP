//
// Created by Usuario on 23/11/2025.
//
#include <bits/stdc++.h>
typedef long long ll;

using namespace std;

int main() {
    ll num;
    cin>>num;
    if (num%2!=0) {
        cout<<-(num/2 + 1)<<endl;
    }else {
        cout<<num/2<<endl;
    }
}