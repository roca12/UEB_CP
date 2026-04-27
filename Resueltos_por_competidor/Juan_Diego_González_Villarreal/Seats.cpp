#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin >> n;
    string s;
    cin >> s;

    int total = 0;
    for (int i = 0; i < n; i++) {
        if (s[i] == '1') {
            total++;
        } else {
            
            bool can_place = true;
            if (i > 0 && s[i - 1] == '1') can_place = false;
            if (i < n - 1 && s[i + 1] == '1') can_place = false;

            if (can_place) {
                if (i + 1 < n && s[i + 1] == '0') {
                    s[i + 1] = '1';
                    total++;
                    i += 2;
                } else {
                    s[i] = '1';
                    total++;
                    i += 1;
                }
            }
        }
    }
    cout << total << endl;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}