#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n,l = 0;
        cin>>n;
        vector<int> v(n);
        vector<vector<int>> dp(n+1, vector<int>(n+1, 0));

        for (int i = 0; i < n; i++) {
            cin>>v[i];
            dp[0][0]+=v[i];
        }
        for (int r = 1; r < n; r++) {
            int d = 0;
            for (int i = l; i <= r; i++) d+=v[i];

        }
    }
}
