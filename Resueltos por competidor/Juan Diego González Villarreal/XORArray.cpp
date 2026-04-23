#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        ll n,l,r;
        cin>>n>>l>>r;
        vector<ll> b(n+1);
        for (int i = 1; i <= n; i++) {
            if (i==r) b[i] = l-1;
            else b[i] = i;
        }
        for (int i = 1; i <= n; i++) cout<<(b[i]^b[i-1])<<" ";
        cout<<endl;
    }
}