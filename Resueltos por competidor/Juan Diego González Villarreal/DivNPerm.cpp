#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        vector<bool> used(n+1, false);
        vector<int> v(n);
        for (int i = 0; i < n; i++) {
            cin>>v[i];
        }
        sort(v.begin(), v.end(), greater<int>());
        bool flag = true;
        for (int i = 0; i < n; i++) {
            int val = v[i];
            while (val>0) {
                if (val<=n && !used[val]) {
                    used[val]=true;
                    break;
                }
                val/=2;
            }
            if (val==0) {
                flag = false;
                break;
            }

        }

        if (flag) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
}