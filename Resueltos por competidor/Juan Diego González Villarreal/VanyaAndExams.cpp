#include <bits/stdc++.h>
typedef long long ll;

struct exams {
    ll a;
    ll b;
};

using namespace std;
int main() {
    ll n,r,avg;
    cin>>n>>r>>avg;
    vector<exams> v(n);
    ll sum = 0;
    for (ll i = 0; i < n; i++) {
        cin>>v[i].a>>v[i].b;
        sum+= v[i].a;
    }
    auto cmp = [](const exams& a, const exams& b) {return a.b<b.b;};
    sort(v.begin(),v.end(),cmp);

    ll sumNeeded = avg*n;
    if (sum>=sumNeeded) {
        cout<<0<<endl;
        return 0;
    }
    ll diff = sumNeeded - sum;
    ll count = 0;
    for (int i = 0; i<n; i++) {
        if (diff==0)break;
        if (v[i].a<r) {
            count+=min(r-v[i].a,diff)*v[i].b;
            diff -=min(r-v[i].a,diff);
        }
    }
    cout<<count<<endl;
}