#include<bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        vector<char> a(n);
        vector<char> b(n);
        for (int i = 0; i < n; i++) {
            cin>>a[i];
        }
        for (int i = 0; i < n; i++) {
            cin>>b[i];
        }
        if (a == b) {
            cout<<"YES"<<endl;
            continue;
        }
        sort(a.begin(), a.end());
        sort(b.begin(), b.end());
        if (a == b) {
            cout<<"YES"<<endl;
        }else {
            cout<<"NO"<<endl;
        }
    }
}