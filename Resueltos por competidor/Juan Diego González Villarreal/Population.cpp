#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

struct FenwickTree {
    int n;
    vector<ll> bit;
    FenwickTree(int n) : n(n), bit(n + 1, 0) {}
    void add(int i, ll delta) {
        for (; i <= n; i += i & -i) {
            bit[i] += delta;
        }
    }
    ll query(int i) {
        ll sum = 0;
        for (; i > 0; i -= i & -i) {
            sum += bit[i];
        }
        return sum;
    }
    ll queryRange(int l, int r) {
        return query(r) - query(l - 1);
    }
};

int main() {
    int n;
    cin>>n;
    ll temp;
    FenwickTree ft(n);
    for (int i = 1; i <= n; ++i) {
        cin >> temp;
        ft.add(i, temp);
    }
    int t;
    cin >> t;
    while (t--) {
        char o;
        cin >> o;
        if (o == 'U') {
            int c;
            ll d;
            cin >> c >> d;
            ft.add(c, d);
        } else if (o == 'R') {
            int l, r;
            cin >> l >> r;
            cout << ft.queryRange(l, r) <<endl;
        }
    }
    return 0;
}