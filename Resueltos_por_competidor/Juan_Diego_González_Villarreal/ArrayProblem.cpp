#include <bits/stdc++.h>

typedef long long ll;

using namespace std;

ll gcd(ll a, ll b) {
    if (b == 0) {
        return a;
    }
        return gcd(b, a % b);

}

int main() {
    int t;
    cin>>t;
    while (t-->0) {
        int n;
        cin>>n;
        set<ll> mins;
        for (int i = 0; i < n; i++) {
            ll val;
            cin>>val;
            for (ll j = 2; j <= 1000000000000000000; j++) {
                if (gcd(val,j)==1) {
                    mins.insert(j);
                    break;
                }
            }
        }
        ll ans = *min_element(mins.begin(), mins.end());
        cout<<ans<<endl;
    }
}