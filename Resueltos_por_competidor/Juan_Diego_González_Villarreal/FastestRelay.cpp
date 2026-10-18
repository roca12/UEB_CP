#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<vector<int>> swimmers(n, vector<int>(4));
    for (int i = 0; i < n; i++)
        for (int j = 0; j < 4; j++)
            cin >> swimmers[i][j];

    int best = INT_MAX;
    vector<int> idx(n);
    iota(idx.begin(), idx.end(), 0);

    for (int a = 0; a < n; a++)
        for (int b = 0; b < n; b++) { if (b == a) continue;
            for (int c = 0; c < n; c++) { if (c == a || c == b) continue;
                for (int d = 0; d < n; d++) { if (d == a || d == b || d == c) continue;
                    int total = swimmers[a][0] + swimmers[b][1] + swimmers[c][2] + swimmers[d][3];
                    best = min(best, total);
                }}}

    cout << best << endl;
    return 0;
}