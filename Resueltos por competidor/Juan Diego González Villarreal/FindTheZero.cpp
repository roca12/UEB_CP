#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;

    while (t--) {
        long long n, c, k;
        cin >> n >> c >> k;

        vector<long long> a(n);
        for (int i = 0; i < n; i++) cin >> a[i];

        sort(a.begin(), a.end());

        long long cur = c;
        long long rem_k = k;

        for (int i = 0; i < n; i++) {
            if (a[i] <= cur) {
                long long can_throw = min(rem_k, cur - a[i]);
                rem_k -= can_throw;
                cur += a[i] + can_throw;
            }
        }

        cout << cur << "\n";
    }

    return 0;
}