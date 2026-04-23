//
// Created by Usuario on 15/11/2025.
//
#include <bits/stdc++.h>
using namespace std;


vector<int> v(200002);

int gcd(int a, int b) {
    if (a==0) return b;
    return gcd(b%a, a);
}

int findGCD(int i, int j) {
    int result = v[i];
    i++;
    for (; i <= j;) {
        result = gcd(v[i],result);
        i++;
    }
    return result;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin>>n;
    map<int ,int>mp;
    int temp;
    for (int i = 0; i < n; i++) {
        cin>>v[i];
    }
    int aux;
    map<pair<int,int>,int>memo{};
    for (int i = 0; i < n; i++) {
        aux = v[i];
        for (int j = i+1; j < n; j++) {
            if (memo.find({i,j})==memo.end()) {
                temp = gcd(aux, v[j]);
                memo[{i,j}] = temp;
            }else {
                temp = memo[{i,j}];
            }

            if (temp == 1) {
                mp[temp]+=n-j;
                break;
            }
            if (mp.count(temp)==0) {
                mp[temp]=1;
            }else {
                mp[temp]++;
            }
            aux = temp;
        }
        if (mp.count(1)>=1&&mp[1]>=n-1) {
            cout<<n-1;
            return 0;
        }
    }
    int nodos = n-1;
    int cont = 0;
    while (nodos>0) {
        auto it = mp.begin();
        if (it->second>nodos) {
            cont+=nodos*it->first;
            nodos=0;
        }else {
            cont+=it->first*it->second;
            nodos-=it->second;
        }
        it++;
    }
    cout<<cont;
}