#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin >> t;
    while (t-->0) {
        int n,m;
        cin >> n>>m;
        multiset<long> swords;
        for (int i = 0 ;i<n; i++) {
            long val;
            cin >> val;
            swords.insert(val);
        }

        vector<pair<long, long> > mons(m);
        for (int i = 0; i<m; i++) {
            long val;
            cin >> val;
            mons[i].first = val;
        }

        for (int i = 0; i<m; i++) {
            long val;
            cin >> val;
            mons[i].second = val;
        }
        sort(mons.begin(), mons.end());


    }
}