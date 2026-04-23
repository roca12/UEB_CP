#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

int main() {
    int t;
    cin >> t;
    while(t--) {
        int n;
        cin >> n;
        vector<ll> a(n), b(n);
        ll score = 0;
        for(int i = 0; i < n; i++) {
            cin >> a[i];
        }
        for(int i = 0; i < n; i++) {
            cin >> b[i];
        }
        ll red = 0; ll blue = 0;
        for(int i = 0; i < n; i++) {
            ll maxRed = max(red-a[i], blue-a[i]);
            ll minRed = min(red-a[i], blue-a[i]);
            ll maxBlue = max(b[i]-red, b[i]-blue);
            ll minBlue = min(b[i]-red, b[i]-blue);

            red = max(maxRed, maxBlue);
            blue = min(minRed, minBlue);
        }
        cout << red << "\n";
    }

}
