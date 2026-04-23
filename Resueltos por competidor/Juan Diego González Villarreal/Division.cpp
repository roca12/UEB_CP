//
// Created by Usuario on 23/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        int num;
        cin>>num;
        if (num<=1399) {
            cout<<"Division 4"<<endl;
        }else if (num<=1599) {
            cout<<"Division 3"<<endl;
        }else if (num<=1899) {
            cout<<"Division 2"<<endl;
        }else {
            cout<<"Division 1"<<endl;
        }
    }
}