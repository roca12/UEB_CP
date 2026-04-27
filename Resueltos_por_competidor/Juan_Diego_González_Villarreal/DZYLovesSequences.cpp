#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

int main() {
    int n;
    cin>>n;
    vector<ll> v(n);
    for(int i=0;i<n;i++) {
        cin>>v[i];
    }
    int l = 0, r = 1, temp = 0, m = 0;
    for (; r < n; r++) {
        if (v[r]<v[r-1])temp++;
        if (temp==2) {
            m = max(m, r-l);
            while (v[l]<v[l+1])l++;
            temp--;
            l++;
        }
    }
    cout<<max(r-l, m)<<endl;
}
