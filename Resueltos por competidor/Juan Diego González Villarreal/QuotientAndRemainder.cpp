#include<bits/stdc++.h>
typedef long long ll;
using namespace std;

bool check(vector<ll> &q, vector<ll> &r, int n,  ll k) {
    for (int i = 0; i < n; i++) {
        if ((q[i]+1)*(r[n-1-i]+1)-1>k)return false;
    }
    return true;
}
int main() {
    int tt;
    cin>>tt;
    while(tt--) {
        ll n,k;
        cin>>n>>k;
        vector<ll> q(n), r(n);
        for(int i=0;i<n;i++) cin>>q[i];
        for(int i=0;i<n;i++) cin>>r[i];
        sort(q.begin(), q.end());
        sort(r.begin(), r.end());
        int small = 0,  large = n+1;
        while (large-small>1) {
            int mid = (large+small)/2;
            if (check(q, r, mid, k)) small = mid;
            else large = mid;
        }
        cout<<small<<endl;
    }
}