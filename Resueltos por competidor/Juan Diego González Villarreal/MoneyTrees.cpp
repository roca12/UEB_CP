#include <bits/stdc++.h>
typedef long long ll;

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        int n,k;
        cin>>n>>k;
        vector<int> a(n);
        vector<ll> h(n);
        for (int i = 0; i<n; i++) {
            cin>>a[i];
        }
        for (int i = 0; i<n; i++) {
            cin>>h[i];
        }
        int l = 0;
        int ans = 0;
        ll count = 0;
        for (int r = 0; r<n; r++) {
            count+=a[r];
            while (l<r && h[r-1]%h[r]!=0) {
                count-=a[l];
                l++;
            }
            while (l<=r && count>k) {
                count-=a[l];
                l++;
            }

            ans = max(ans,r-l+1);
        }
        cout<<ans<<endl;
    }
}