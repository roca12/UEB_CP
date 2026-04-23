#include <bits/stdc++.h>
using namespace std;

void solve() {
    long long a, b;
    cin >> a >> b;

    long long X = a ^ b;
    if (X == 0) {
        // ya son iguales
        cout << 0 << "\n";
        return;
    }

    vector<long long> ops;
    for (int i = 0; (1LL << i) <= X; i++) {
        if (X & (1LL << i)) {
            ops.push_back(1LL << i);
        }
    }

    long long p_max = ops.back();
    if (p_max > a) {
        // no podemos hacer una operación con un x tan grande
        cout << -1 << "\n";
        return;
    }

    // Si llegamos aquí, construimos la secuencia de operaciones
    cout << ops.size() << "\n";
    for (long long x : ops) {
        cout << x << " ";
    }
    cout << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}
