#include <bits/stdc++.h>
using namespace std;

#define vi vector<int>
#define vii vector<pair<int, int>>
#define pii pair<int, int>
#define ll long long
#define pll pair<ll, ll>

const ll INF = 2e18;

void solve() {
    int n;
    cin >> n;
    vi a(n);
    for (int i = 0; i < n; i++) cin >> a[i];


    vi odd, even;

    for (int i = 0; i < n; i++) {
        if (a[i] & 1) odd.push_back(a[i]);
        else even.push_back(a[i]);
    }

    sort(odd.begin(), odd.end());
    sort(even.begin(), even.end());
    reverse(even.begin(), even.end());

    vector<ll> prefeven((int)even.size() + 1);

    if (even.size() > 0) {
        prefeven[0] = 0;
        for (int i = 0; i < even.size(); i++) prefeven[i + 1] = prefeven[i] + even[i];
    }

    ll ans = -INF;

    int cntodd = (int)odd.size();
    int cnteven = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 0) cnteven++;
    }

    int odd1 = 1, even1 = 0;

    if (odd.size() == 0) odd1 = 0, even1 = 1;

    for (int k = 1; k <= n; k++) {
        if (k > 1) {
            if (even1 < even.size()) even1++;
            else {
                if (odd1 + 2 <= odd.size() && even1 > 0) {
                    odd1 += 2;
                    even1--;
                }
                else {
                    odd1++;
                }
            }
        }
        if (odd1 & 1) {
            cout << odd.back() + prefeven[even1] << " ";
        }
        else {
            cout << 0 << " ";
        }
    }
    cout << '\n';
}


int main() {
    srand(time(0));
    ios::sync_with_stdio(0);
    cout.tie(0), cin.tie(0);
    int T = 1;
    cin >> T;
    while (T--) {
        solve();
    }
}