#include<bits/stdc++.h>
typedef long long ll;
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        vector<ll> v(n);
        ll gcdTemp = 1;
        for(int i=0;i<n;i++) {
            cin>>v[i];
            if (i>0) {
                gcdTemp = gcd(gcdTemp, v[i]);
            }else {
                gcdTemp = v[i];
            }
        }
        for (int i = n-1; i >= 0; i--) {
            ll temp = gcd(i+1, v[i]);
            if (gcd(gcdTemp, temp) == 1) {
                cout<<n-i<<endl;
                break;
            }
        }
    }
}
