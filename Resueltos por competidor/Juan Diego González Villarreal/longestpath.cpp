#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> ady[105];
int dp[105];
bool comp[105];

int resolver(int nodo) {
    if (comp[nodo]) {
        return dp[nodo];
    }

    comp[nodo] = true;
    dp[nodo] = 0;

    for (int vec : ady[nodo]) {
        dp[nodo] = max(dp[nodo], 1 + resolver(vec));
    }

    return dp[nodo];
}

void buscarFin(int nodo, int dist, int maxLong, int &mejorFin) {
    if (dist == maxLong) {
        if (nodo < mejorFin) {
            mejorFin = nodo;
        }
        return;
    }

    for (int vec : ady[nodo]) {
        if (resolver(vec) == maxLong - dist - 1) {
            buscarFin(vec, dist + 1, maxLong, mejorFin);
        }
    }
}

int main() {
    int n, s, p, q;
    int numCaso = 1;

    while (cin >> n && n != 0) {
        cin >> s;

        for (int i = 0; i <= n; i++) {
            ady[i].clear();
            comp[i] = false;
            dp[i] = 0;
        }

        while (cin >> p >> q && (p != 0 || q != 0)) {
            ady[p].push_back(q);
        }

        int maxLong = resolver(s);

        int mejorFin = 101;
        if (maxLong == 0) {
            mejorFin = s;
        } else {
            buscarFin(s, 0, maxLong, mejorFin);
        }

        cout << "Case " << numCaso++ << ": The longest path from " << s
             << " has length " << maxLong << ", finishing at " << mejorFin << "." << endl;
        cout << endl;
    }

    return 0;
}