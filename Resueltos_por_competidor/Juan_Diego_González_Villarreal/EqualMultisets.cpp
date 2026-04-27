#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    while(t--) {
        int n, k;
        cin >> n >> k;

        vector<int> a(n), b(n);
        for(int i = 0; i < n; i++) cin >> a[i];
        for(int i = 0; i < n; i++) cin >> b[i];

        bool ok = true;

        for(int i = 0; i < n-k && ok; i++)
            if(b[i] != -1 && b[i] != a[i]) ok = false;
        for(int i = k; i < n && ok; i++)
            if(b[i] != -1 && b[i] != a[i]) ok = false;

        if(ok) {
            multiset<int> aFree;
            for(int i = n-k; i < k; i++) aFree.insert(a[i]);
            for(int i = n-k; i < k && ok; i++) {
                if(b[i] != -1) {
                    auto it = aFree.find(b[i]);
                    if(it == aFree.end()) ok = false;
                    else aFree.erase(it);
                }
            }
        }

        cout << (ok ? "YES" : "NO") << "\n";
    }
    return 0;
}