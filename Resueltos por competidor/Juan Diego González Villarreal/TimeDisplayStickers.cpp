#include<bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n,  total = 0, mFive = 0;
        char c;
        cin>>n;
        vector<int> f(10,0);
        for (int i = 0; i < n; i++) {
            cin>>c;
            f[c-'0']++;
            if (c-'0'<5) mFive++;
        }
    }
}