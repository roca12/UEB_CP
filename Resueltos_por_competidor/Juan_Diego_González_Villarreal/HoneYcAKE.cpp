#include <iostream>
#include <vector>

using namespace std;
typedef long long ll;

int main() {
    ll w, h, d, n;
    if (!(cin >> w >> h >> d >> n)) return 0;

    // Buscamos divisores de n, que son mucho menos que 10^9
    vector<ll> divs;
    for (ll i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            divs.push_back(i);
            if (i * i != n) divs.push_back(n / i);
        }
    }

    // Probamos combinaciones de divisores de n
    for (ll nw : divs) {
        if (w % nw != 0) continue; // w debe ser divisible por la cantidad de trozos
        for (ll nh : divs) {
            if (h % nh != 0) continue;

            // Si n es divisible por (nw * nh), entonces nd es fijo
            if (n % (nw * nh) == 0) {
                ll nd = n / (nw * nh);
                if (d % nd == 0) {
                    // El problema pide el número de CORTES: pedazos - 1
                    cout << nw - 1 << " " << nh - 1 << " " << nd - 1 << endl;
                    return 0;
                }
            }
        }
    }

    cout << -1 << endl;
    return 0;
}