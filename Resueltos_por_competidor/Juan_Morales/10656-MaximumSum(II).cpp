/*
 * Autor: OtherSpanish
 * Problema: Maximum Sum II
 * Juez online: UVA
 * Veredicto: Accepted
 * URL: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=0&problem=1597&mosmsg=Submission+received+with+ID+31108481
 */

#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N;

    while (cin >> N && N != 0) {
        vector<int> v(N);
        for (int i = 0; i < N; i++) cin >> v[i];

        vector<int> ans;

        for (int x : v) {
            if (x > 0) ans.push_back(x);
        }

        if (ans.empty()) {
            cout << 0 << endl;
            continue;
        }

        for (int i = 0; i < ans.size(); i++) {
            if (i) cout << " ";
            cout << ans[i];
        }
        cout << endl;
    }
}
