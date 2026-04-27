#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        vector<ll> a(n),b(n);
        for(int i=0;i<n;i++) cin>>a[i];
        for(int i=0;i<n;i++) cin>>b[i];

        vector<vector<ll>> dp(n+1, vector<ll>(2, 0));
        for(int i=0;i<n;i++) {
            ll rMax = max(dp[i][0]-a[i], dp[i][1]-a[i]);
            ll rMin = min(dp[i][0]-a[i], dp[i][1]-a[i]);
            ll bMax = max(b[i]-dp[i][0], b[i]-dp[i][1]);
            ll bMin = min(b[i]-dp[i][0], b[i]-dp[i][1]);
            dp[i+1][0] = max(rMax, bMax);
            dp[i+1][1] = min(rMin, bMin);
        }
        cout<<dp[n][0]<<endl;
    }
}
