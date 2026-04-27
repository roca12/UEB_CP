#include <bits/stdc++.h>
using namespace std;

int main() {
    int n; cin >> n;
    vector<double> x(n), y(n);
    for (int i = 0; i < n; i++) cin >> x[i] >> y[i];

    double ans = 1e18;
    for (int deg = 0; deg < 180000; deg++) {
        double a = deg * M_PI / 180000.0;
        double mn = 1e18, mx = -1e18;
        for (int i = 0; i < n; i++) {
            double proj = x[i]*sin(a) + y[i]*cos(a);
            mn = min(mn, proj);
            mx = max(mx, proj);
        }
        ans = min(ans, mx - mn);
    }
    printf("%.8f\n", ans);
}