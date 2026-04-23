#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        int n,k;
        cin>>n>>k;
        vector<int> v(n);
        for(int i=0;i<n;i++) cin>>v[i];
        vector<vector<vector<int>>> dp(n,vector<vector<int>>(k,vector<int>(k,-1)));
        dp[0][v[0]][v[0]] = v[0];
        for(int i=1;i<n;i++) {
            if (dp[i-1][v[i-1]][v[i]] < ) {}
        }
    }
}