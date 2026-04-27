#include<bits/stdc++.h>
typedef long long ll;
using namespace std;

const int MOD = 676767677;

ll divisoresMod(ll n, ll mod) {
    if (n == 0) return 1;
    ll cnt = 0;
    for (ll i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            cnt++;
            if (i != n / i) cnt++;
        }
    }
    return cnt % mod;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    while (t--) {
        ll x, y;
        cin >> x >> y;
        ll S = x - y;
        ll absS = abs(S);
        cout << divisoresMod(absS, MOD) << "\n";
        for (ll i = 0; i < y; i++) cout << "-1 ";
        for (ll i = 0; i < x; i++) cout << "1 ";
        cout << "\n";
    }
    return 0;
}