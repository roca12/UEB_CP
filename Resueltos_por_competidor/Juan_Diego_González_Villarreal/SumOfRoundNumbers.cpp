//
// Created by Usuario on 23/11/2025.
//
#include <bits/stdc++.h>

using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--) {
        string n;
        cin>>n;
        vector<int> v;
        for (int i = 0; i < n.length(); i++) {
            if (n[i]!='0') {
                string temp = to_string(n[i]-'0');
                for (int j = i+1; j < n.length(); j++) {
                    temp+='0';
                }
                v.emplace_back(stoi(temp));
            }
        }
        cout<<v.size()<<endl;
        for (int i = 0; i < v.size(); i++) {
            cout<<v[i]<<" ";
        }
        cout<<endl;
    }
}