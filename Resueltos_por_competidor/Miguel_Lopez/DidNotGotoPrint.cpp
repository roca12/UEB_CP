#include <bits/stdc++.h>
using namespace std;

#define ln "\n"
#define ll long long int

void init_code() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif
}

int main() {
    init_code();
    ll t; cin >> t;
    while (t--) {
        ll n;
        string s; cin >> n >> s;
        vector<char> printed(n + 1, 0);
        vector<ll> st;
        for (ll i = 1; i <= n; i++) {
            char c = s[i - 1];
            if (c == '1') {
                st.push_back(i);
            } else if (c == '2') {
                if (!st.empty()) {
                    printed[st.back()] = 1;
                    st.pop_back();
                } else {
                    printed[i] = 1;
                }
            } else {
                printed[i] = 1;
            }
        }
        vector<ll> res;
        for (ll i = 1; i <= n; i++)
            if (!printed[i]) res.push_back(i);
        cout << res.size() << ln;
        for (int i = 0; i < (int)res.size(); i++)
            cout << res[i] << (i + 1 < res.size() ? " " : "");
        cout << ln;
    }
}
