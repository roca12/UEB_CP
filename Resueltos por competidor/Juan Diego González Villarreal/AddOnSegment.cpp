#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int t;
    cin>>t;
    while (t--) {
        ll n,  nz = 0,s=0, temp;
        cin>>n;
        for (int i = 0; i < n; i++) {
            cin>>temp;
            s+=temp;
            if (temp!=0)nz++;
        }
        cout<<min(nz, s-n+1)<<endl;
    }
}
